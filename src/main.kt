import com.taracha.Person

fun main(args: Array<String>) {
    println("Hello, World")

    /*
        var means variable and its type can change.
        val means whatever is assigned is immutable.
     */
    val taracha = Person()

    //taracha is a val and Name is a var
    taracha.Name = "Taracha"

    // Kotlin uses string interpolation
    println("Name is ${taracha.Name}")

    // Re-assigning the Name value which is a var property.
    taracha.Name = "Roger"

    println("Name is ${taracha.Name}")
}