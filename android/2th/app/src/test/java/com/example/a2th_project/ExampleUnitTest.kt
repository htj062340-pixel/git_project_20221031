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

        var x: Int = 4
        var y: Int = 2

        println("코틀린 : 산술 연산자, x + y = " + (x + y))
        println("코틀린 : 산술 연산자, x - y = " + (x - y))
        println("코틀린 : 산술 연산자, x / y = " + (x / y))
        println("코틀린 : 산술 연산자, x * y = " + (x * y))
        println("코틀린 : 산술 연산자, x % y = " + (x % y))

        println("코틀린 : 증감 연산자, x++ = " + (x++))
        println("코틀린 : 증감 연산자, ++x = " + (++x))
        println("코틀린 : 증감 연산자, y-- = " + (y--))
        println("코틀린 : 증감 연산자, --y = " + (--y))

        println("코틀린 : 비교 연산자, x > y = " + (x > y))
        println("코틀린 : 비교 연산자, x < y = " + (x < y))
        println("코틀린 : 비교 연산자, x >= y = " + (x >= y))
        println("코틀린 : 비교 연산자, x <= y = " + (x <= y))
        println("코틀린 : 비교 연산자, x == y = " + (x == y))
        println("코틀린 : 비교 연산자, x != y = " + (x != y))

        x = 5
        y = 10

        y += x
        println("코틀린 : 할당 연산자, y += x => y = " + y)
        y -= x
        println("코틀린 : 할당 연산자, y -= x => y = " + y)
        y *= x
        println("코틀린 : 할당 연산자, y *= x => y = " + y)
        y /= x
        println("코틀린 : 할당 연산자, y /= x => y = " + y)
        y %= x
        println("코틀린 : 할당 연산자, y %= x => y = " + y)

        var num: Int = 10
        if (num % 2 == 0) {
            println("코틀린 : if-else 조건문, 숫자 " + num + "은 짝수")
        } else {
            println("코틀린 : if-else 조건문, 숫자 " + num + "은 홀수")
        }

        var score: Int = 85
        var grade: String
        if (score >= 90) {
            grade = "A"
        } else if (score >= 80) {
            grade = "B"
        } else if (score >= 70) {
            grade = "C"
        } else {
            grade = "F"
        }
        println("코틀린 : if-else if 조건문, 점수 " + score + "점은 " + grade + "학점")

        var num3: Int = -10
        var result: String
        if (num3 > 0) {
            if (num3 % 2 == 0) {
                result = "숫자 " + num3 + "은 양수이고 짝수"
            } else {
                result = "숫자 " + num3 + "은 양수이고 홀수"
            }
        } else {
            if (num3 % 2 == 0) {
                result = "숫자 " + num3 + "은 음수이고 짝수"
            } else {
                result = "숫자 " + num3 + "은 음수이고 홀수"
            }
        }
        println("코틀린 : 중첩 if 조건문, " + result)

        var day: Int = 2
        var dayResult: String
        when (day) {
            1 -> dayResult = "Monday"
            2 -> dayResult = "Tuesday"
            3 -> dayResult = "Wednesday"
            4 -> dayResult = "Thursday"
            5 -> dayResult = "Friday"
            6 -> dayResult = "Saturday"
            7 -> dayResult = "Sunday"
            else -> dayResult = "Invalid day"
        }
        println("코틀린 : when 조건문, " + dayResult)

        var numbers = arrayOf(1, 2, 3, 4, 5)
        for (i in numbers) {
            if (i % 2 == 1) {
                println("코틀린 : for 반복문, 반복 변수 : " + i)
            }
        }

        var testScore: Int = 96
        var attendanceRate: Int = 85

        if (attendanceRate < 80) {
            println("코틀린 : 학점 판별기, F (낙제)")
        } else if (testScore >= 90) {
            if (testScore >= 95) {
                println("코틀린 : 학점 판별기, A+ 학점 (장학생 선발 대상)")
            } else {
                println("코틀린 : 학점 판별기, A 학점")
            }
        } else if (testScore >= 80) {
            println("코틀린 : 학점 판별기, B 학점")
        } else if (testScore >= 70) {
            println("코틀린 : 학점 판별기, C 학점")
        } else {
            println("코틀린 : 학점 판별기, F 학점")
        }

        for (i in 5..10) {
            for (j in 10..13) {
                print("$j x $i = ${j * i}\t")
            }
            println()
        }
    }
}