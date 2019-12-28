package android.the.coding.archer.espressotestingadv

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner

class CustomTestRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application {
        return super.newApplication(cl, "android.the.coding.archer.espressotestingadv.TestApplication", context)
    }
}