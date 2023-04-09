package com.arstagaev.myplayzone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform