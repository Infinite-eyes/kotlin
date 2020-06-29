package `10对象`.`08代理和委托`


//v1
//
//class People : IWashBowl by PeopleDelegate() {
//
////    override fun wishing() {
//////        PeopleDelegate().wishing()
////        println("People wishing")
////    }
//
//
//
//}

class People : IWashBowl by PeopleDelegate{

    override fun wishing() {
        PeopleDelegate.wishing()
        println("People wishing")
    }
}