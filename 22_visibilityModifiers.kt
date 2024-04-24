//! protected --> access only in class itself and it's subclass only. We cannot access in main
//! private constructor

open class Shape(var name: String){
    
    init{
        println("I am the super class!")
    }

    fun changeName(newName: String){
        name = newName
    }
}

// class Rectange(var a: Double, var b: Double) : Shape("Rectange"){
//     init{
//         println("$name created with a=$a and b=$b")
//     }
    
//     fun area() = a*b
//     fun perimeter() = 2*a+2*b
//     fun square() = a==b
// }

class Circle(var radius: Double) : Shape("Circle"){

    private var pi = 3.14

    init{
        println("The radius of $name is $radius")
    }

    fun area() = radius*radius*pi
}

fun main(){

    var cir1 = Circle(4.0)
    println(cir1.radius)
    // println(cir1.pi) // Cannot access as it is private

}