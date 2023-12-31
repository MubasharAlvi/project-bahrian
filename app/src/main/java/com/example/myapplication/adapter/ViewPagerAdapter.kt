package com.example.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragment.BirdFragment
import com.example.myapplication.fragment.CatFragment
import com.example.myapplication.fragment.DogFragment

private const val NUM_TABS = 3

 class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
        FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return CatFragment()
            1 -> return DogFragment()
        }
        return BirdFragment()
    }
}