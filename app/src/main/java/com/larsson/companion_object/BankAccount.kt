package com.larsson.companion_object

class BankAccount(
    val name: String,
    val age: Int
) {

    val tag = "Bank account"


    companion object {

        fun createAccount(name: String, age: Int) : BankAccount? {
            val instance = BankAccount(name, age)

            println("vi är här")
            return if (instance.validate()) {
                println("Inne i return if validate")
                instance
            } else {
                null
            }
        }
    }

    fun validate() : Boolean {
        return age > 17
    }
}