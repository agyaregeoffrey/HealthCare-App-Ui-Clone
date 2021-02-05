package com.gka.healthcareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.gka.healthcareapp.NavigationHost
import com.gka.healthcareapp.R
import com.gka.healthcareapp.ui.ChatFragment
import com.gka.healthcareapp.ui.FavouriteFragment
import com.gka.healthcareapp.ui.HomeFragment
import com.gka.healthcareapp.ui.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class LandingActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_activity)

        bottomNav = findViewById(R.id.bottomNav)
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_home -> {
                    openFragment(HomeFragment())
                    true
                }
                R.id.menu_chat -> {
                    openFragment(ChatFragment())
                    true
                }

                R.id.menu_bookmark -> {
                    openFragment(FavouriteFragment())
                    true
                }

                R.id.menu_more -> {
                    openFragment(SettingsFragment())
                    true
                }

                else -> false
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.navHost, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}