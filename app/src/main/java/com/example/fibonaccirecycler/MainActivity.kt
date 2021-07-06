package com.example.fibonaccirecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvNumbers=findViewById<RecyclerView>(R.id.rvnumbers)

        rvNumbers.layoutManager=
            LinearLayoutManager(baseContext )
        var numbersAdapter=NumbersrvAdapter(fibonacci(maxNumber=100))
        rvNumbers.adapter=numbersAdapter

        fibonacci(10)
    }
}

fun fibonacci(maxNumber:Int):MutableList<BigInteger>{
    var count=0
    var firstNumber=0.toBigInteger()
    var secondNumber=1.toBigInteger()
    var fibNumbers= mutableListOf<BigInteger>()

    while (count<=maxNumber){
        println(firstNumber)
        var sum=firstNumber+secondNumber
        firstNumber=secondNumber
        secondNumber=sum
        count ++
        fibNumbers.add(firstNumber)
    }
    return fibNumbers
}