package com.example.a2sem.data.api.response.cities

data class City(
    val clouds: Clouds,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val rain: Any,
    val snow: Any,
    val sys: Sys,
    val weather: List<Weather>,
    val wind: Wind
)
