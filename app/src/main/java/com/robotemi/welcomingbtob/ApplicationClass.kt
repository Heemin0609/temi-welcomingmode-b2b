//package com.hardcopy.btchat
package com.robotemi.welcomingbtob

import android.app.Application
import android.content.Context



class ApplicationClass : Application() {
    companion object {
        lateinit var context: Context

        fun getAppContext(): Context {
            return context
        }
    }

    override fun onCreate() {
        super.onCreate()

        context = this
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}