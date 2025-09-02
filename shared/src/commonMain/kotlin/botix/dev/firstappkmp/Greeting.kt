package botix.dev.firstappkmp

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds
import com.rickclephas.kmp.nativecoroutines.NativeCoroutines

class Greeting {
    private val platform: Platform = getPlatform()
    private val rocketComponent = RocketComponent()

    @NativeCoroutines
    fun greet(): Flow<String> = flow {

    }

    /*fun greet(): Flow<String> = flow {
        emit(if (Random.nextBoolean()) "Hi" else "Hello")
        delay(1.seconds)
        emit("Guess what this is > ${platform.name.reversed()}!")
        delay(1.seconds)
        emit(daysPhrase())
        emit(rocketComponent.launchPhrase())
    }*/
    
    /*fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "HI!" else "Hello!")
        add("Guess what this is > ${platform.name.reversed()}!")
        add(daysPhrase())
    }*/
    /*fun greet(): String {
        //return "Hello, ${platform.name}!"
        return if (Random.nextBoolean())  "Guess what this is".reversed() else "Si Hi KMP"
    }*/
}