fun main(){

    var answer = power1(4, 2)
    println("Value of answer is $answer")

    println(multiply(4, 2))

    var a = listOf(45,1,5,1,7,2,85)
    println(findIndex(a, 5))
}

fun power1(base: Int, exp: Int): Int{
    var result = 1
    for(i in 1..exp){
        result *= base
    }
    return result
}

fun multiply(a: Int, b: Int) = a*b

fun findIndex(a: List<Int>, find: Int): Int{
    for(i in 0 until a.size-1){
        if(a[i] == find)
            return i
    }
    return -1
}