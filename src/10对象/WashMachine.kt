package `10对象`

class WashMachine(module: String, width: Int) {

    var isDoorOpen = true
    var currentmode = 0
    fun openDoor() {
        println("openDoor....")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("closeDoor....")
        isDoorOpen = false
    }

    fun selectMode(mode: Int) {
        this.currentmode = mode
        when (mode) {
            1 -> println("mode1....")
            2 -> println("mode2....")
            3 -> println("mode3....")
        }
    }

    fun start() {
        if (isDoorOpen) {
            print("bibibi")
        } else {
            when (currentmode) {
                0 -> print("no mode")
                1 -> {
                    setMotorSpeed(1000)
                    print("mode 1")
                }
                2 -> {
                    setMotorSpeed(2000)
                    print("mode 2")
                }
                3 -> {
                    setMotorSpeed(3000)
                    print("mode 3")
                }
            }
        }
    }

   private fun setMotorSpeed(speed: Int){
        println("转速${speed}")
    }
}

fun main(args: Array<String>) {
    var washMachine = WashMachine("小天鹅", 12)
    washMachine.openDoor()
    washMachine.closeDoor()
    washMachine.selectMode(1)
    washMachine.start()
}


