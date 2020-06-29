package `10对象`.`07抽象类和接口`


//class AndroidProgrammer:IProgrammer{
class AndroidProgrammer:People(),IProgrammer{

   override fun coding(){
       println("写android")
   }

    override fun eat() {
        super.eat()
    }
}