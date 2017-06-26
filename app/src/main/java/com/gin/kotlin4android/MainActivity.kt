package com.gin.kotlin4android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gin.kotlin4android.data.Person
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() { 
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = " hello kotlin!"
        
        var person = Person("dsadfas",3)
        
    }
}
