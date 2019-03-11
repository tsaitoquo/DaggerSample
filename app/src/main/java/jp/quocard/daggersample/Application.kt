package jp.quocard.daggersample

class Application : android.app.Application() {

    companion object {
        lateinit var component: AppComponent private set
    }

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
            .viewModelModule(ViewModelModule())
            .repositoryModule(RepositoryModule())
            .build()
    }
}