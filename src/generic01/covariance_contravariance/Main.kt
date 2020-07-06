package generic01.covariance_contravariance


//协变
interface Production<out T> {
    fun produce(): T
}


interface Consumer<in T> {
    fun consume(item: T)
}


//Invariant

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}


open class Food

open class FastFood : Food()
class Burger : FastFood()


class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}


class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce food")
        return FastFood()
    }
}

class InOutBurger : Production<Burger> {
    override fun produce(): Burger {
        println("Produce Burger")
        return Burger()
    }
}


class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }
}


fun main(args: Array<String>) {
//    val production1: Production<Food> = FoodStore()
//    val production2: Production<Food> = FastFoodStore()
//    val production3: Production<Food> = InOutBurger()

//    val production1 : Production<Burger> = FoodStore()  // Error
//    val production2 : Production<Burger> = FastFoodStore()  // Error
    val production3: Production<Burger> = InOutBurger()


//    val consumer1 : Consumer<Burger> = Everybody()
//    val consumer2 : Consumer<Burger> = ModernPeople()
//    val consumer3 : Consumer<Burger> = American()

    val consumer1: Consumer<Food> = Everybody()
//    val consumer2: Consumer<Food> = ModernPeople() //error
//    val consumer3: Consumer<Food> = American()  //error


}


