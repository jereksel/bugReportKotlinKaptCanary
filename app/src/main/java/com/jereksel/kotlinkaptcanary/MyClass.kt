package com.jereksel.kotlinkaptcanary

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MyClass(
    val a: String,
    val b: Int
)