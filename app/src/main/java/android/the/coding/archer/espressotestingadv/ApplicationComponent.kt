package android.the.coding.archer.espressotestingadv

import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [ClockModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}

@Module
object ClockModule {
    @Provides
    fun provideClock() : Clock {
        return Clock()
    }
}