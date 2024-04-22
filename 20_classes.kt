import kotlin.math.sqrt

class Rectange(var a: Double, var b: Double){
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

    Rectange(5.0, 4.0)
    var first = Rectange(3.0, 4.0)
    println("Area is ${first.area()}")
    println("Perimeter is ${first.perimeter()}")
    println("It is a square? ${first.square()}")

    var second = Circle(5.0)
    var third = Circle(15.0)
    println("The area of second circle is ${second.area()}")
    println("The area of third circle is ${third.area()}")

    println("-------------------------------------------------------------")

    println(sqrt(4.0))
    println("The square root of 4 is ${sqrt(4.0)}")

}