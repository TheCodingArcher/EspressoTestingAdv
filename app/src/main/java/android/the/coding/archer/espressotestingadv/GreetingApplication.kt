package android.the.coding.archer.espressotestingadv

import android.app.Application

open class GreetingApplication : Application() {
    open val component : ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .clockModule(ClockModule)
            .build()
    }
}