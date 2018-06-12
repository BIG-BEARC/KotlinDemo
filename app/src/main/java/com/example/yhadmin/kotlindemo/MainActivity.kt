package com.example.yhadmin.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val x = 5  // 自动判断出Int类型
    val s = "Sample"
    val c: Int = 1

    var d = 2
    var m: Int = 0

    val oneMillion = 1_000_000
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "hello kotlin";
        btn.setOnClickListener {
            textView.text = "${sum(1, 2)} $s"
            var a = 1
            // simple name in template:
            val s1 = "a is $a"

            a = 2
            // arbitrary expression in template:
            val s2 = "${s1.replace("is", "was")}, but now is $a"
            Toast.makeText(this, s2, Toast.LENGTH_SHORT).show()
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // 这里的函数没有写返回值，因为Kotlin会自动判断返回值类型
    fun sum1(a: Int, b: Int) = a + b

    //如果函数返回一个无意义的值，相当于Java的void，则可以这样写
    fun sum2(a: Int, b: Int): Unit {
        print(a + b)
    }

    //Uint 的返回类型可以省略
    fun sum3(a: Int, b: Int) {
        print(a + b)
    }
}
