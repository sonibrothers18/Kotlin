// fun main(){

//     var arr = intArrayOf(4,2,5,1,3384)
//     println(max(15,1,2,3,561, *arr, 1,66,45))
//     println(max(15,1,2,3,561,1,66,45))

//     print("Mayur")
//     print(lName = "muhal", fName = "mitesh") // name parameter
// }

// fun max(vararg numbers: Int): Int{
//     var a = numbers[0]
//     for(i in numbers){
//         if(a < i)
//             a = i
//     }
//     return a
// }

// fun print(fName: String, lName: String = "Soni"){
//     println("Your name is $fName $lName")
// }

//! -------------------------------------------------------------------

fun main(){

    var a = alternatingSum(3,4,5,2,1,2,3)
    println("Alternatin sum is $a")
}

fun alternatingSum(vararg numbers: Int): Int{
    var sum = 0
    var toggle = true
    for(i in numbers){
        if(toggle)
            sum += i
        else
            sum -= i
        toggle = !toggle
    }
    return sum
}