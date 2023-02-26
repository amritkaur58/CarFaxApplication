package com.amrit.carfaxapplication.ui.carlist

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amrit.carfaxapplication.data.entities.Listings
import com.amrit.carfaxapplication.databinding.CarItemBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.signature.ObjectKey

class CarAdapter(private val listener: CarItemListener) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    interface CarItemListener {
        fun onClickedCar(
            drinkId: String?,
            get: String,
            carDetail: String,
            priceValue: String,
            address: String?,
            interiorColor: String?,
            exteriorColor: String?,
            drivetype: String?,
            transmission: String?,
            engine: String?,
            bodytype: String?,
            fuel: String?,
            phone: String?
        )
    }

    private val items = ArrayList<Listings>()

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(items: ArrayList<Listings>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class CarViewHolder(
        private val itemBinding: CarItemBinding,
        private val listener: CarItemListener
    ) : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {

        private lateinit var carValue: Listings

        init {
            itemBinding.root.setOnClickListener(this)
        }

        fun bind(car: Listings) {
            this.carValue = car
            val carValue = "${car.year.toString()} ${car.make} ${car.model} ${car.trim}"
            val priceValue = "$ ${car.currentPrice.toString()} | ${car.mileage}K mi"
            itemBinding.yearTV.text = carValue
            itemBinding.priceTV.text = priceValue
            itemBinding.locationTV.text = car.dealer?.address ?: ""

            val imageMetadata = car.images?.medium?.let { ObjectKey(it) } ?: ObjectKey("")

            Glide.with(itemBinding.root.context)
                .load(car.images?.medium?.get(0))
                .override(600, 600)
                .dontAnimate()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .signature(imageMetadata)
                .into(itemBinding.carIV)

        }

        override fun onClick(v: View?) {
            val carDetail = "${carValue.year.toString()} ${carValue.make} ${carValue.model} ${carValue.trim}"
            val priceValue = "$ ${carValue.currentPrice.toString()} | ${carValue.mileage}K mi"
            carValue.images?.medium?.let {
                listener.onClickedCar(carValue.id,
                    it.get(0),carDetail,priceValue,
                    carValue.dealer?.address,carValue.interiorColor,carValue.exteriorColor,carValue.drivetype,carValue.transmission,carValue.engine,carValue.bodytype,carValue.fuel,
                    carValue.dealer?.phone
                )
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding: CarItemBinding =
            CarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        return holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}