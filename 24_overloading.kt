//! constructor overloading and function overloading

class Rectange(var a: Double, var b: Double){
    
    constructor(a: Double): this(a, a)    
    constructor(x: Int, y: Int): this(x.toDouble(), y.toDouble())
    
    init{
        println("Rectangle created with a=$a and b=$b")
    }
    
    fun area() = a*b
    fun perimeter() = 2*a+2*b
    fun square() = a==b
}

class Circle(var radius: Double){
    
    var pi = 3.14
    
    init{
        println("The radius of circle is $radius")
    }
    
    fun area() = radius*radius*pi
}

fun main(){
    
    var rec1 = Rectange(5.0)



}