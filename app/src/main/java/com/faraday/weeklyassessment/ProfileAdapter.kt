package com.faraday.weeklyassessment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faraday.weeklyassessment.databinding.ProfileItemBinding


class ProfileAdapter(private val profiles: List<ProfileModel>): RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(private val binding: ProfileItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(profile: ProfileModel){
            binding.firstName.text = profile.firstName
            binding.lastName.text = profile.lastName
            binding.image.setImageResource(R.drawable.ic_user0)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding: ProfileItemBinding = ProfileItemBinding.inflate(LayoutInflater.from(parent.context))
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.ProfileViewHolder, position: Int) {
       val profile = profiles.get(position)
        holder.bind(profile)

    }

    override fun getItemCount(): Int {
       return profiles.size
    }

}