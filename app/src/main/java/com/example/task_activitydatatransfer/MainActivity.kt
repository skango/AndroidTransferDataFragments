package com.example.task_activitydatatransfer

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ReportFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    var f = Fragment1()
    var ff = framgent2()
    var fff = fragment3()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bottomnav = findViewById<BottomNavigationView>(R.id.menubottom)
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,f).commit()
        bottomnav.setOnItemSelectedListener()
        {
                 item ->
                when(item.itemId)
                {

                    R.id.fragment1 -> {
                        var bundle = Bundle()
                        bundle.putString("Fragmenti 1 is key","gadmogeci")
                        SwitchFragment(f,bundle)
                        true
                    }


                    R.id.fragment2 -> {
                        var bundle = Bundle()
                        bundle.putString("Fragmenti 2 is key","gadmogeci")
                        SwitchFragment(ff,bundle)
                        true
                    }

                    R.id.fragment3 -> {
                        var bundle = Bundle()
                        bundle.putString("Fragmenti 3 is key","gadmogeci")
                        SwitchFragment(fff,bundle)
                        true
                    }

                    else -> false
                }


        }


    }

    public fun SwitchFragment(fragment: Fragment, bundle: Bundle) {
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment).commit()
        println("Fragmentis monacemebi:" + fragment.arguments.toString())
    }
}








