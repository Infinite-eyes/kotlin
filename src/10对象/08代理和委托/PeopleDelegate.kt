package `10对象`.`08代理和委托`


//v2
object PeopleDelegate : IWashBowl {
    override fun wishing() {
        println("peopleDelegate wishing")
    }

}

//v1
//class PeopleDelegate : IWashBowl {
//
//    override fun wishing() {
//      println("peopleDelegate wishing")
//    }
//
//}