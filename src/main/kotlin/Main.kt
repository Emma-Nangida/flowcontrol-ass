fun main() {
  numbers()
    var z= members(arrayOf("Wina","Emmayo","Emmamai","Fawzia","Kabanyena","Ntooye","Mamalai"))
    println(z)
    characters()
    drinks(17)
    drinks(4)
    drinks(7)
}
//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun numbers() {
    var value=0
    for (value in 1..100) {
        if (value%2!=0)
        println(value)
    }
    }


//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun members(names:Array<String>) :Int {
var count=0
    for (x in names){
        if(x.length>5){
            count++
        }
    }
    return count
}






//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

fun drinks(age:Int){
    var x=0
    if ( age in 1..5){
        println("milk")}
        else if(age in 6..15){
            println("fanta orange")
    }
    else {
        println("coca cola")
    }



}

//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun characters(){
    for (num in 1..100) {

    when {
        num %3==0 && num %5==0-> println("FizzBuzz")
        num % 3==0-> println("Fizz")
        num %5==0-> println("Buzz")

        else->
            println("num")
        }

    }
}