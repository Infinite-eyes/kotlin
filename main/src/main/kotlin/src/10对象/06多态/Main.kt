package `10对象`.`06多态`

fun main(args: Array<String>) {

    var person1 = Man("Man1")
    var person2 = Woman("Woman1")

    var person3 = Man("Man2")
    var person4 = Woman("Woman2")

    var humanlist = listOf<Human>(person1, person2, person3, person4)

    for (h in humanlist) {
        h.eat()
    }


}