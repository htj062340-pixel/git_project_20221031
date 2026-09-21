package com.example.a2th_project

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {

        assertEquals(4, 2 + 2)

        val myName = "황태준"
        val age: Int = 24

        println("나이: " + age)
        println("이름: " + myName)

        var numOne = 1
        var numTwo = 300000000
        var myByte: Byte = 1
        var myInt: Int = 20
        var myLong = 25L

        println("코틀린 : 정수 자료형, Int : " + numOne)
        println("코틀린 : 정수 자료형, Long : " + numTwo)
        println("코틀린 : 정수 자료형, Byte : " + myByte)
        println("코틀린 : 정수 자료형, Int : " + myInt)
        println("코틀린 : 정수 자료형, Long : " + myLong)

        var myFloat = 30.2F
        var myDouble = 35.4

        println("코틀린 : 실수 자료형, Float : " + myFloat)
        println("코틀린 : 실수 자료형, Double : " + myDouble)

        var myBoolean: Boolean = true

        println("코틀린 : 논리 자료형, Boolean : " + myBoolean)

        var myString1: String = "Kotlin"
        var myString2: String = "Java"

        println("코틀린 : 문자열 자료형, String : " + myString1)
        println("코틀린 : 문자열 자료형, String : " + myString2)

        var myChar: Char = 'A'

        println("코틀린 : 문자 자료형, Char : " + myChar)

        var myArray: IntArray = intArrayOf(1, 2, 3, 4, 5)

        println("코틀린 : 배열 자료형, 배열의 3번째 값 : " + myArray[2])
    }
}