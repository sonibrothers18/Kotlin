fun main(){
    var a = arrayOf("mayur", "parth", "mitesh", "naman")
    for(i in a){
        println(i)
    }
    println("---------------------------------------------")
    
    for(i in 5..10){
        println(i)
    }
    println("---------------------------------------------")
    
    for(i in 15 downTo 10){
        println(i)
    }
    println("---------------------------------------------")
    
    for(i in 15 downTo 10 step(2)){
        println(i)
    }
    println("---------------------------------------------")

    for(i in 'a'..'m'){
        println(i)
    }
    println("---------------------------------------------")

    var array = arrayOf(7,48,4,859,19,656,523,58)
    var max = array[0]
    for(i in array){
        if(i > max){
            max = i
        }
    }
    println(max)

}