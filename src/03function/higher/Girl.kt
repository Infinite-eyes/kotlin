package `03function`.higher


data class Girl(var name: String, var age: Int, var height: Int, var address: String)

var list = listOf<Girl>(

    Girl("111", 18, 168, "hz"),
    Girl("22", 18, 168, "hz"),
    Girl("33", 18, 168, "hz"),
    Girl("44", 18, 168, "hz"),
    Girl("55", 18, 168, "hz"),
    Girl("66", 18, 168, "hz"),
    Girl("77", 18, 168, "hz"),
    Girl("88", 18, 168, "hz"),
    Girl("99", 18, 168, "hz")

)


//行为参数化




fun filterGirlsByAddress(address: String) {
    var person = ArrayList<Girl>()

    for (girl in list) {
        if (girl.address == address) {
            person.add(girl)
        }
    }

    for (girl in person) {
        println("${girl.address} ${girl.age}岁的美女 ${girl.name}")
    }
}


fun filterGirlsByAge(age: Int) {
    var person = ArrayList<Girl>()
    for (girl in list) {
        if (girl.age < age) {
            person.add(girl)
        }
    }

    for (girl in person) {
        println("${girl.address} ${girl.age}岁的美女 ${girl.name}")
    }
}


//flag 是否小于
fun filterGirlsAddressHeightAge(address: String, height: Int, age: Int, flag: Boolean) {
    var person = ArrayList<Girl>()

    if (flag) {
        for (girl in list) {
            if ((girl.age < age) and (girl.address == address) and (girl.height > height)) {
                person.add(girl)
            }
        }
    } else {
        for (girl in list) {
            if ((girl.age > age) and (girl.address == address) and (girl.height > height)) {
                person.add(girl)
            }
        }
    }


    for (girl in person) {
        println("${girl.address} ${girl.age}岁的美女 ${girl.name}  身高 ${girl.height}")
    }
}