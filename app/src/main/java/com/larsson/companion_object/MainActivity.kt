package com.larsson.companion_object

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Circle.randomRadius().area()

        var account1 = BankAccount("Johan", 27)
        var account2 = BankAccount("Erik", 20)
        var account3 = BankAccount("Annelie", 17)

        val account1Validated = BankAccount.createAccount("Fredrik", 17)
        val account2Validated = BankAccount.createAccount("Johanna", 24)



        if (account1Validated != null) {
            println("Account1: ${account1Validated.name}")
        }

        if (account2Validated != null) {
            println("Account2: ${account2Validated.name}")
        }

        if (account2Validated != null) {
            println("Account2: ${account2Validated.age}")
        }
        }

    }
