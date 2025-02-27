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