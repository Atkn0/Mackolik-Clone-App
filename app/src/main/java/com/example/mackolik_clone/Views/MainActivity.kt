package com.example.mackolik_clone.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mackolik_clone.R
import com.example.mackolik_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val homeFragment = HomeFragment()
    private val favouriteFragment = FavouriteFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        replaceFragment(homeFragment)

        binding.BottomNavView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Home -> replaceFragment(homeFragment)
                R.id.Favourite -> replaceFragment(favouriteFragment)
            }
            true
        }


    }




    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.FrameLayout,fragment)
        fragmentTransaction.commit()


    }



}