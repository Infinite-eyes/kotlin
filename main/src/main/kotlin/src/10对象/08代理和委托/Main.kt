package `10对象`.`08代理和委托`

fun main(args: Array<String>) {


    //v1
//    var peopleDelegate = PeopleDelegate();

    //v2
    PeopleDelegate.wishing()

    var people = People();

    people.wishing()


}