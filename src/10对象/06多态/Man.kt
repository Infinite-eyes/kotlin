package `10对象`.`06多态`

class Man(name: String) : Human(name) {
    override fun eat(){
        print("Man eat")
    }
}