package com.example.receiptproject

import android.app.Application
import android.content.Context

class App:Application() {
    class App : Application() {
        override fun onCreate() {
            super.onCreate()
            instance = this
        }
        companion object {
            lateinit var instance: App
            fun getContext(): Context {
                return instance.applicationContext
            }
        }
    }
}