fun main(){

    greeting()
    power(2, 3)
    add(3)

}

fun greeting(){
    println("Good Morning")
    println("Good Morning")
    println("Good Morning")
}

fun power(base: Int, exp: Int){
    var result = 1
    for(i in 1..exp){
        result *= base
    }
    println("The exp is $result")
}

fun add(n: Int){
    var sum = 0
    for(i in 1..n){
        sum += i
    }
    println(sum)
}