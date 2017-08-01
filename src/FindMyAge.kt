import java.util.*


fun main(args:Array<String>){

    print("Please enter you birth year ")
    var DOB = readLine()!!.toInt()

    var year = Calendar.getInstance().get(Calendar.YEAR)

    var age = year - DOB

    println(" your age is $age")
}