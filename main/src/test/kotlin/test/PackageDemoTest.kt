package test

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import what
import Motorbike
import Car
import now
import VariableVSValue
import breakDemo_1
import breakDemo_2
import continueDemo
import org.junit.Assert
import returnDemo_1
import returnDemo_2
import returnDemo_3
import returnDemo_4
import Outer
import Son

@RunWith(JUnit4::class)
class PackageDemoTest {

    val variableVSValue = VariableVSValue()

    @Test
    fun testWhat() {
        what()
    }

    @Test
    fun testDriveMotorbike() {
        val motorbike = Motorbike()
        motorbike.drive()
        val car = Car()
        car.drive()
    }

    @Test
    fun testDefaultPackage() {
        now()
        val car = Car()
        car.drive()
    }

    @Test
    fun testVariableVSValue() {
//        variableVSValue.declareVal()
        variableVSValue.declareVar()
    }

    @Test
    fun testGetLength() {
        val obj = "abcdef"
        val len = variableVSValue.getLength(obj)
        Assert.assertTrue(len == 6)

        val obj2: Any = Any()
        variableVSValue.getLength(obj2)
    }

    @Test
    fun testContinueDemo() {
        continueDemo()
    }

    @Test
    fun testReturn() {
//        returnDemo_1()
//        returnDemo_2()
//        returnDemo_3()
//        returnDemo_4()

        breakDemo_1()
        breakDemo_2()
    }

    @Test
    fun testThisKeyWord() {
        val outer = Outer()
        outer.Inner().m()

    }

    @Test
    fun testSuperKeyWord() {
        val son = Son("Harry")
        son.love()
    }

}