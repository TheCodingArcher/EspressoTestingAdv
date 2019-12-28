package android.the.coding.archer.espressotestingadv

import android.app.Application

class GreetingApplication : Application() {
    fun provideClock(): Clock = Clock()
}