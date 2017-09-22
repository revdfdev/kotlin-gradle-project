fun main(args: Array<String>) {
    println("Hello world !")
    val person =  Person("Rehan", 26, "BMS")
    println("The person name is ${person.name} and he is ${person.age} he has completed ${person.qualification}")
}

data class Person(val name: String, val age: Int, val qualification: String)
