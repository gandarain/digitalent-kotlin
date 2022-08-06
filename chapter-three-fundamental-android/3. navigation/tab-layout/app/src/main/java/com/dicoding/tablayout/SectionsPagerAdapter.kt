package com.dicoding.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        // TODO One Fragment
        val fragment = HomeFragment()
        fragment.arguments = Bundle().apply {
            putInt(HomeFragment.ARG_SECTION_NUMBER, position + 1)
        }

        return fragment


        // TODO Many Fragment
        // var fragment: Fragment? = null
        // when(position) {
            // 0 -> fragment = HomeFragment()
            // 1 -> fragment = ProfileFragment()
        // }
        // return fragment as Fragment
    }
}