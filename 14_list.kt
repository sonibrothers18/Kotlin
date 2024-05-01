fun main(){
    var a = arrayOf(45, 51, 74, 25)
    println(a[0])
    //! In array we can change the value
    a[0] = 100
    println(a[0])

    // var b = listOf(45, 51, 74, 25)
    var x = (1..10).toList()
    println(x)
    // println(b[0])
    // //! In list we cannot change the value
    // b[0] = 100
    // println(b[0])

    var c = mutableListOf(85, 4741, 22, 1711, 233, 15)
    println(c)
    c[0] = 1
    println(c)
    
    //! We can also add extra values in list, but can't do in array
    c.add(22)
    println(c)
    
    c.remove(22)
    // remove value 22
    println(c)
    
    c.removeAt(1)
    // remove value at index 1
    println(c)

    //! Program to take 10 number and store in list
    var  d = mutableListOf<Int>()
    // create int type list
    for(i in 1..10){
        var x = readLine()?.toInt()
        if(x!= null)
            d.add(x)
    }
    println(d.reversed())

}