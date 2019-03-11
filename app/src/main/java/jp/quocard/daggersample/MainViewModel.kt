package jp.quocard.daggersample

import javax.inject.Inject

interface MainViewModelContract {
    fun greet(): String
}

class MainViewModel @Inject constructor(private val greetingRepository: GreetingRepositoryContract) : MainViewModelContract {
    override fun greet(): String {
        return this.greetingRepository.greet()
    }
}

class MainViewModel2 @Inject constructor(private val greetingRepository: GreetingRepositoryContract) : MainViewModelContract {
    override fun greet(): String {
        return this.greetingRepository.greet() + " 2222"
    }
}
