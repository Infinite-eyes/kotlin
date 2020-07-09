package test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import Point
import org.junit.Test
import unaryMinus
import Counter
import plus

@RunWith(JUnit4::class)
class OperatorDemoTest {


    @Test
    fun testPointUnaryMinus() {
        val p = Point(1, 1)
        val np = -p
        println(np)
    }

    @Test
    fun testCounterIndexPlus() {
        val c = Counter(1)
        val cplus = c + 10
        println(cplus)
    }


}