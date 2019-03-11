package jp.quocard.daggersample

import dagger.Component
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideGreetingRepository(): GreetingRepositoryContract {
        return GreetingRepository()
    }
}

@Module
class ViewModelModule {
    @Provides
    fun provideMainViewModel(greetingRepository: GreetingRepositoryContract): MainViewModelContract {
        return MainViewModel2(greetingRepository)
    }
}

@Component(modules = [ViewModelModule::class, RepositoryModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}