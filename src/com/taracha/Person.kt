package com.taracha

/*
    Kotlin classes also support constructors.
    We set the constructor parameters when we define the class
  */

// There's a constructor to which we pass a single value.
class Person (var Name: String) {
    // Adding functions to classes
    fun display() {
        println("Display: $Name")
    }

    fun displayWithLambda(func: (s:String) -> Unit) {
        // Calling the function that's passed in with the Name variable
        // i.e. The name is declared on the constructor of my Object
        func(Name)

    }


}