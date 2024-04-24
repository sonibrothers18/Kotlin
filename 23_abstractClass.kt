//! abstract class --> we cannot create instance of abstract class
//! abstract function --> functions are compulsory to override

abstract class Shape(var name: String){
    
    init{
        println("I am the super class!")
    }

    fun changeName(newName: String){
        name = newName
    }

    abstract fun area(): Double
    abstract fun perimeter(): Double

}

class Rectange(var a: Double, var b: Double) : Shape("Rectange"){
    init{
        println("$name created with a=$a and b=$b")
    }
    
    override fun area(): Double = a*b
    override fun perimeter(): Double = 2*a+2*b
    fun square() = a==b
}

class Circle(var radius: Double) : Shape("Circle"){

    var pi = 3.14

    init{
        println("The radius of $name is $radius")
    }

    override fun area(): Double = radius*radius*pi
    override fun perimeter(): Double = 2*pi*radius
}

fun main(){

    // var a = Shape("ellipse") // give error as Shape is a abstract class
    var cir1 = Circle(4.0)
    cir1.changeName("Mayur")
    println(cir1.name)

}