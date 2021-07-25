package com.app.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MAIN_TAG" , "myTag from main branch")
        for (i in 1..10) {
            Log.d("MAIN_TAG2", "onCreate: $i")
        }
        Log.d("MAIN_TAG" , "myTag from main branch")

        Log.d("Lenovo_TAG" , "random : ${generateRandomList()}")
    }
}

fun generateRandomList() :ArrayList<Int> {
    val list = arrayListOf<Int>()
    for (i in 1..50) {
        val rand = Random.nextInt(50000)
        list.add(rand)
    }
    return list
}