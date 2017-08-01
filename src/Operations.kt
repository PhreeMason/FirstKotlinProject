
fun main(args:Array<String>){

    print("enter n1 ")
    var n1:Double = readLine()!!.toDouble()


    print("enter n2 ")
    var n2:Double = readLine()!!.toDouble()

    var product:Double?
    product = n1 * n2

    println("Product: " + product)
}