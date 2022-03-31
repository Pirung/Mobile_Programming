package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCurrency(view: View)
    {
        val dollarText= this.findViewById<EditText>(R.id.dollarText)
        val euroTextView= this.findViewById<TextView>(R.id.textView)
        val inputDollarText= dollarText.text.toString()
        if (inputDollarText!="")
        {
            val dollarValue= inputDollarText.toFloat()
            val euroValue= dollarValue* 0.85f
            euroTextView.setText(euroValue.toString())
        }
        else
        {
            euroTextView.setText(R.string.no_value_string)
        }
    }
}