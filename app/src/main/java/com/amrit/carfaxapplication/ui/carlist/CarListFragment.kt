package com.amrit.carfaxapplication.ui.carlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrit.carfaxapplication.R
import com.amrit.carfaxapplication.data.entities.CarData
import com.amrit.carfaxapplication.databinding.FragmentCarListBinding
import com.amrit.carfaxapplication.di.AppModule
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CarListFragment : Fragment(), CarAdapter.CarItemListener {
    private lateinit var binding: FragmentCarListBinding
    private lateinit var carAdapter: CarAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarListBinding.inflate(inflater, container, false)
        return binding.root
    }

    @OptIn(DelicateCoroutinesApi::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()

        lifecycleScope.launch {
            withContext(Dispatchers.IO)
            {
                getCarList()
            }

        }

    }

    private fun setupRecyclerView() {
        carAdapter = CarAdapter(this)
        binding.carRV.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = carAdapter

        }
    }

    private fun getCarList() {
        binding.progressBar.visibility = View.VISIBLE
        val compositeDisposal = CompositeDisposable()
        compositeDisposal.add(
            AppModule.buildService().getCarList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })


        )
    }

    private fun onResponse(response: CarData?) {
        binding.progressBar.visibility = View.GONE
        response?.listings?.let { carAdapter.setItems(it) }


    }


    private fun onFailure(t: Throwable) {
        binding.progressBar.visibility = View.GONE
        Toast.makeText(activity, t.message, Toast.LENGTH_SHORT).show()
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CarListFragment().apply {

            }
    }

    override fun onClickedCar(
        carId: String?,
        image: String,
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
    ) {

        findNavController().navigate(
            R.id.action_list_to_detail,
            bundleOf(
                "id" to carId,
                "vehicle_photo" to image,
                "carDetail" to carDetail,
                "priceValue" to priceValue,
                "address" to address,
                "interiorColor" to interiorColor,
                "extColor" to exteriorColor,
                "driveType" to drivetype,
                "transmission" to transmission,
                "engine" to engine,
                "bodyType" to bodytype,
                "fuel" to fuel,
                "phone" to phone

            )
        )
    }


}