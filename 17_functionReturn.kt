fun main(){

    var answer = power1(4, 2)
    println("Value of answer is $answer")

    println(multiply(4, 2))
}

fun power1(base: Int, exp: Int): Int{
    var result = 1
    for(i in 1..exp){
        result *= base
    }
    return result
}

fun multiply(a: Int, b: Int) = a*b