package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var taskRecyclerView : RecyclerView
    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        taskRecyclerView=binding.todoRecyclerView
        val layoutManager=LinearLayoutManager(this)
        taskRecyclerView.layoutManager=layoutManager
        setUpView()
    }

     private fun setUpView(){
        setUpDrawerLayout()

    }

     private fun setUpDrawerLayout(){
        setSupportActionBar(binding.appBar)
         toggle= ActionBarDrawerToggle(this,binding.maindrawer,R.string.app_name,R.string.app_name)
         toggle.syncState()
         binding.navView.setNavigationItemSelectedListener {
             when(it.itemId){
                 R.id.theme -> Toast.makeText(applicationContext,"Clicked Theme",Toast.LENGTH_SHORT).show()
                 R.id.Setting -> Toast.makeText(applicationContext,"Clicked Setting",Toast.LENGTH_SHORT).show()
                 R.id.about -> Toast.makeText(applicationContext,"Clicked About",Toast.LENGTH_SHORT).show()
             }
             true
         }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onResume() {
        super.onResume()
    }
}