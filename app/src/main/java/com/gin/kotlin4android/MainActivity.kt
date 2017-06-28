package com.gin.kotlin4android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.gin.kotlin4android.data.Person
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() { 
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = " hello kotlin!"
        
        var person = Person("dsadfas",3)
        var age = person.getAge(3)
        Log.i("------","$age")
        age = person.getAge()
        Log.i("------","$age")
        
//        btn1.setOnClickListener()
    }
    
    
    fun toast(message :String , length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this,message,length).show();
    }
}