package src.data


data class OrderBean(val createTime: Long) {
//    val createTimeShow:String
//        get() = { }
}


data class Goods(var name: String, var _price: Int) {

    //   dependent on gson
//    @SerializedName("price")
    var price: Float = 0F
        get() {

            var realValue = field
            if (realValue == 0F) {
                realValue = _price.toFloat()
            }
            return realValue / 100


//            return field / 100
        }

//    override fun writeToParcel(dest:Parcel,flags: Int) = with(dest){
//    writeString(name)
//    writeInt(price * 100)
//
//    }


}