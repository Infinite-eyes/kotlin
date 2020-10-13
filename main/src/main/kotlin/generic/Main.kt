package generic

//fun <T> whoAmI(t: T){
//    val clazz = t::class   //编译器报错
//    println("I'm $clazz")
//}

//
//fun hello(name:String?){
//    print("Hello $name")
//}
//
//fun main(){
//    hello("manerfan")
//    //need  nullable
//    hello(null)
//}

//同样，对应泛型类，我们也可以指定nullable及non-nullable的type argument

class Tree(val name:String)
class Forest<T>(val tree: T)

////T的隐式边界为any？
//class Forest<T>
//
////显示指定T的边界为Any？
//class Forest<T: Any?>

//显示指定T的边界为Tree？
//class Forest<T: Tree?>




val forestA: Forest<Tree?> = Forest(Tree("Poplar"))
val forestAB: Forest<Tree?> = Forest(null)

val forestB: Forest<Tree> = Forest(Tree("Poplar"))
//val forestBA: Forest<Tree> = Forest(null)


