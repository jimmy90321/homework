package homework3

fun main(args: Array<String>) {
    print("Please enter object's length: ")
    val length = readLine()!!.toFloat()
    print("Please enter object's width: ")
    val width = readLine()!!.toFloat()
    print("Please enter object's height: ")
    val height = readLine()!!.toFloat()

    getUsableBox(length, width, height)
}

private fun getUsableBox(length: Float, width: Float, height: Float) {
    val box3 = Box3()
    val box5 = Box5()
    when {
        box3.validate(length, width, height) -> print("Object can use Box3")
        box5.validate(length, width, height) -> print("Object can use Box5")
        else -> print("Object too large")
    }
}

data class Box(val length: Float, val width: Float, val height: Float) {
    fun validate(length: Float, width: Float, height: Float): Boolean =
        when {
            (length > this.length) -> false
            (width > this.width) -> width <= this.length && length <= this.width
            (height > this.height) -> if (width <= this.height && height <= this.width) true else length <= this.height && height <= this.length
            else -> true
        }
}

class Box3 {
    private val box3 = Box(23f, 14f, 13f)
    fun validate(length: Float, width: Float, height: Float): Boolean =
        box3.validate(length, width, height)
}

class Box5 {
    private val box5 = Box(39.5f, 27.5f, 23f)
    fun validate(length: Float, width: Float, height: Float): Boolean =
        box5.validate(length, width, height)
}