package src.dataclass1



//使用dataclass 编译器会默默帮我们生成一下函数
// equals()
// hashCode()
// toString()
// componentN()

data class Country(var id: Int, var name: String, var continent: String)