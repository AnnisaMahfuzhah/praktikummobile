package com.example.dadu

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDadu()}

    }

    private fun rollDadu()
    {
        val dadu1 = Dadu1(6)
        val rollDadu1 = dadu1.roll()

        val GambarDadu1 : ImageView = findViewById(R.id.imageView)

        when (rollDadu1)
        {
            1 -> GambarDadu1.setImageResource(R.drawable.dice_1)
            2 -> GambarDadu1.setImageResource(R.drawable.dice_2)
            3 -> GambarDadu1.setImageResource(R.drawable.dice_3)
            4 -> GambarDadu1.setImageResource(R.drawable.dice_4)
            5 -> GambarDadu1.setImageResource(R.drawable.dice_5)
            6 -> GambarDadu1.setImageResource(R.drawable.dice_6)
        }

        val dadu2 = Dadu2(6)
        val rollDadu2 = dadu2.roll()
        val GambarDadu2 : ImageView = findViewById(R.id.imageView2)

        when(rollDadu2)
        {
            1 -> GambarDadu2.setImageResource(R.drawable.dice_1)
            2 -> GambarDadu2.setImageResource(R.drawable.dice_2)
            3 -> GambarDadu2.setImageResource(R.drawable.dice_3)
            4 -> GambarDadu2.setImageResource(R.drawable.dice_4)
            5 -> GambarDadu2.setImageResource(R.drawable.dice_5)
            6 -> GambarDadu2.setImageResource(R.drawable.dice_6)
        }

        if(rollDadu1 != rollDadu2)
        {
            Toast.makeText(applicationContext, "Anda Belum Beruntung", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(applicationContext, "Selamat anda dapat dadu double", Toast.LENGTH_SHORT).show()
        }

    }

}

class Dadu1(val jumlahMataDadu : Int)
{
    fun roll() : Int
    {
        return (1..jumlahMataDadu).random()
    }
}

class Dadu2(val jumlahMataDadu: Int)
{
    fun  roll() : Int
    {
        return (1..jumlahMataDadu).random()
    }
}