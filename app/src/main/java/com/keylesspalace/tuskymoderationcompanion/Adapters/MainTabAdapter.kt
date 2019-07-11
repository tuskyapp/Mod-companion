package com.keylesspalace.tuskymoderationcompanion.Adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.keylesspalace.tuskymoderationcompanion.fragments.AccountFragment
import com.keylesspalace.tuskymoderationcompanion.fragments.HomeFragment
import com.keylesspalace.tuskymoderationcompanion.fragments.ReportFragment

class MainTabAdapter(private val context: Context,
                     fm: FragmentManager,
                     internal var totalTabs: Int): FragmentPagerAdapter(fm) {

    override fun getItem(pos: Int): Fragment? {
        when (pos) {
            0 -> return HomeFragment()
            1 -> return AccountFragment()
            2 -> return ReportFragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}