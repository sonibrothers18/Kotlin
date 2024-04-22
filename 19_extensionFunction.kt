fun main(){

    var a = readLine()?.toInt()
    if(a != null){
        if(a.isPrime())
            println("$a is a prime number")
        else
            println("$a is not a prime number")
    }

    var x  = listOf(1,2,3,4)
    println("Product of list is ${x.product()}")

}

fun Int.isPrime(): Boolean{
    for(i in 2 until this-1){
        if(this % i == 0)
            return false
    }
    return true
}

fun List<Int>.product(): Int{
    var result = 1
    for(i in this)
        result *= i
    return result
}