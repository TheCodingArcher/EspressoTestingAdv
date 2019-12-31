package android.the.coding.archer.espressotestingadv

import org.joda.time.DateTime

open class Clock {
    open fun getNow() = DateTime()
}