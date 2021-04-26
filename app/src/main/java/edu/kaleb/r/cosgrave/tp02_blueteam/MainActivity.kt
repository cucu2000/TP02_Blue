package edu.kaleb.r.cosgrave.tp02_blueteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

//Author: Kaleb

class MainActivity : AppCompatActivity() {
    val homeFragment = HomeFragment()
    val schoolFragment = SchoolFragment()
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNav()

        loadFragment(homeFragment)
    }

    private fun setupBottomNav() {
        var bottomNav = findViewById<BottomNavigationView>(R.id.nav_bottom)

        bottomNav.setOnNavigationItemSelectedListener {
            checkMenuClick(it)
            true
        }
    }

    private fun checkMenuClick(item: MenuItem) {
        when (item.itemId) {
            R.id.nav_home -> loadFragment(homeFragment)
            R.id.nav_school -> loadFragment(schoolFragment)
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.commit()
    }
}