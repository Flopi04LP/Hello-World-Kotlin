fun main(args : Array<String>) {
    println("Hi!")
    println("Whats your name?")
    println("It's nice to meet you "+ getName())
    println("How old are you?")
    println("Ohhh you are "+ getAge()+" years old. Very nice!")
    }

fun getName():String{
    val name = readLine().toString()
    return name
}

fun getAge():String{
    val age = readLine().toString()
    return age
}

