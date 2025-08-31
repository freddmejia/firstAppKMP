package botix.dev.firstappkmp

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "HI!" else "Hello!")
        add("Guess what this is > ${platform.name.reversed()}!")
    }
    /*fun greet(): String {
        //return "Hello, ${platform.name}!"
        return if (Random.nextBoolean())  "Guess what this is".reversed() else "Si Hi KMP"
    }*/
}