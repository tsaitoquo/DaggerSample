package jp.quocard.daggersample

interface GreetingRepositoryContract {
    fun greet(): String
}

class GreetingRepository : GreetingRepositoryContract {
    override fun greet(): String {
        return "こんにちわ from Repository"
    }
}
