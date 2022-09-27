package com.larsson.companion_object

import kotlin.random.Random


class Circle(
   val radius: Double
) {

    var name = "ola"

    companion object{
        fun randomRadius() : Circle {
            val radius = Random.nextDouble(1.0,10.0)
            println("Inne i randomfunktionen: $radius")

            return Circle(radius)
        }
    }

    init {
        println("Area is: ${area()}")
        println("Perimeter is: ${perimeter()}")
    }

    fun area() = radius * radius * ImportantNumbers.pi
    fun perimeter() = 2 * radius * ImportantNumbers.pi

}