package com.faraday.weeklyassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faraday.weeklyassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    private  lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profiles : List<ProfileModel> = listOf(
            ProfileModel("Faraday", "Utomi", "@drawable/ic_user0"),
            ProfileModel("Kiwekuzi", "Ofuzim", "@drawable/ic_user1"),
            ProfileModel("Nkemnchor", "Nwaogbeni", "@drawable/ic_user0")
        )

        myProfileAdapter = ProfileAdapter(profiles)
        binding.recyclerView.adapter = myProfileAdapter
    }
}