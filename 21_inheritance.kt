open class Shape(var name: String){
    
    init{
        println("I am the super class!")
    }

    fun changeName(newName: String){
        name = newName
    }
}

class Rectange(var a: Double, var b: Double) : Shape("Rectange"){
    init{
        println("$name created with a=$a and b=$b")
    }
    
    fun area() = a*b
    fun perimeter() = 2*a+2*b
    fun square() = a==b
}

class Circle(var radius: Double) : Shape("Circle"){

    var pi = 3.14

    init{
        println("The radius of $name is $radius")
    }

    fun area() = radius*radius*pi
}

fun main(){

    var rec1 = Rectange(5.0, 2.0)
    rec1.changeName("Mayur")
    println(rec1.name)

}