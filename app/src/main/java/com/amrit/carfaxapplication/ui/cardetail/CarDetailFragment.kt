package com.amrit.carfaxapplication.ui.cardetail

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.amrit.carfaxapplication.databinding.FragmentCarDetailBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


class CarDetailFragment : Fragment() {

    private lateinit var phoneNumber: String
    private val requestCall = 1
    private lateinit var binding: FragmentCarDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setIntentData()
        setClickListener()
    }

    private fun setClickListener() {
        binding.callButton.setOnClickListener {
            arguments?.getString("phone")?.let {

                makePhoneCall(it)
            }

        }

    }

    private fun makePhoneCall(number: String) {
        phoneNumber = number
        if (number.trim { it <= ' ' }.isNotEmpty()) {
            if (ContextCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    requireActivity(),
                    arrayOf(Manifest.permission.CALL_PHONE),
                    requestCall
                )
            } else {
                val dial = "tel:$number"
                startActivity(Intent(Intent.ACTION_CALL, Uri.parse(dial)))
            }
        } else {
            Toast.makeText(requireActivity(), "Enter Phone Number", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        if (requestCode == requestCall) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall(phoneNumber)
            } else {
                Toast.makeText(requireContext(), "Permission DENIED", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setIntentData() {
        arguments?.getString("vehicle_photo")?.let {
            Glide.with(requireContext())
                .load(it)
                .override(600, 600)
                .dontAnimate()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(binding.image)
        }
        arguments?.getString("carDetail")?.let { binding.title.text = it }
        arguments?.getString("priceValue")?.let { binding.distance.text = it }
        arguments?.getString("address")?.let { binding.locationValue.text = it }
        arguments?.getString("extColor")?.let { binding.exeValue.text = it }
        arguments?.getString("interiorColor")?.let { binding.interValue.text = it }
        arguments?.getString("driveType")?.let { binding.driveValue.text = it }
        arguments?.getString("transmission")?.let { binding.transValue.text = it }
        arguments?.getString("engine")?.let { binding.engineValue.text = it }
        arguments?.getString("bodyType")?.let { binding.bodyValue.text = it }
        arguments?.getString("fuel")?.let { binding.fuelValue.text = it }
        binding.progressBar.visibility = View.GONE
    }

}