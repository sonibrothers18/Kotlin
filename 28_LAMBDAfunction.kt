fun main(){

    var a = (1..20).toList()
    println(a)

    a = a.filter{ it%2 == 0 }
    println(a)
    a = a.filter{ it>10 }
    println(a)

}