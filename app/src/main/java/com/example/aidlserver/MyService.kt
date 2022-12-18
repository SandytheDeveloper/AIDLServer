package com.example.aidlserver

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

    var b = object : IAidlInterface.Stub(){
        override fun addition(a: Int): Int {
            return (a+a)
        }
    }

    override fun onBind(intent: Intent): IBinder {
        return b
    }
}