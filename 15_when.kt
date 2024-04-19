fun main(){

    var age = readLine()?.toInt()
    var x =5

    when(age){
        in 0..5 ->{
            println("You are a young kid")
            println("Another line")
        }

        in 6..17 -> println("You are a teenager")

        18 -> if(x==6){
            println("Finally, you are 18")
        }

        19, 20 -> println("You are a young adult")

        in 21..65 -> println("You are an adult")
        
        else -> println("You are really old")
    }
}