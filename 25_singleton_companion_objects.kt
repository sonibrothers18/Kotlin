import kotlin.random.Random

object ImportantNumbers{
    val PI = 3.14
}

class Circle(var radius: Double){
    
    companion object{
        fun randomCircle(): Circle{
            var radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init{
        println("The radius of circle is $radius")
    }

    fun area() = radius*radius*ImportantNumbers.PI
}

fun main(){

    var circle1 = Circle.randomCircle()
    
}