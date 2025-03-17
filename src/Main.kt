//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    showMathTable(5)
    println("Max Value ${maxValue(arrayListOf(1,2,3,4,10,-1))}")
    println("Min Value ${minValue(arrayListOf(1,2,3,4,10,-1))}")

    println(listOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 0))
    println(revertValues(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
}


fun showMathTable(number:Int){
    /*for (i in 0..9)
        println("$number x $i = ${number * i}")
    */
    (0..9).forEach {println("$number x $it = ${number * it}")}
}

fun maxValue(list: ArrayList<Int>):Int{
    var maxValue = list[0]
    list.forEach { if (maxValue<it) maxValue = it }
    return maxValue
}
fun minValue(list: ArrayList<Int>):Int{
    var minValue = list[0]
    list.forEach { if (minValue>it) minValue = it }
    return minValue
}
fun revertValues(list: List<Int>):List<Int> {
    val listResult: MutableList<Int> = mutableListOf()
    list.forEach { listResult.addFirst(it)}
    return listResult
}

fun catAndMouse(x: Int, y: Int, z: Int): String {
    var distanceX = z - x
    var distanceY = z - y

    if (distanceX > 0) distanceX *= -1
    if (distanceY > 0) distanceY *= -1
    return if (distanceX >= distanceY)
        if (distanceX > distanceY )
            "Cat A"
        else
            "Mouse C"
    else
        "Cat B"
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val listResult: MutableList<Int> = mutableListOf()
    grades.forEach{
        listResult.add( if((it+2)%5 in 0..2 && it>38) it+2-((it+2)%5) else it )
    }
    return listResult.toTypedArray()
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val maxCandle = candles.max()
    val countCandles = candles.count { c -> c == maxCandle }
    return countCandles
}
fun staircase(n: Int){
    (n downTo 1).forEach{ i ->
        (1..n).forEach{ j ->
            if( j < i)
                print(" ")

            else
                print("#")
        }
        println()
    }
}

fun bonAppetit(bill: Array<Int>, k: Int, b: Int){
    val totalSplit = (bill.sum() - bill[k])/2
    println(if(totalSplit == b) "Bon Appetit" else "${b - totalSplit}")
}
