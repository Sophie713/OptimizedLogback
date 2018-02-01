package com.example.sophie.loggerlastversion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find directory to save to
        val dest = applicationContext.getExternalFilesDir(null);
//log what I want to save
        SingletonLog.instance.logDown("Hello..")
        SingletonLog.instance.logDown("Hello....")
        SingletonLog.instance.logDown("Oh, Hello..")
    }
}
