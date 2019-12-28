package android.the.coding.archer.espressotestingadv

import android.app.Application

open class GreetingApplication : Application() {
    open fun provideClock(): Clock = Clock()
}