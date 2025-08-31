package botix.dev.firstappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform