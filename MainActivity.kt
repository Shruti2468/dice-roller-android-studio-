package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.button)

        rollButton.setOnClickListener {
            rolldice()

        }
    }

        class Dice(private val numSide:Int){
            fun roll ():Int{
                return (1..numSide).random()
            }
        }
        fun rolldice(){
            val dice= Dice(6)
            val diceroll= dice.roll()

            val diceImage: ImageView = findViewById(R.id.imageView)

            val drawableImg = when (diceroll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6

            }
            diceImage.setImageResource(drawableImg)

            if(diceroll==4){
                val toast = Toast.makeText(this, "lucky number", Toast.LENGTH_SHORT)
                toast.show()

            }
            else{
                val toast = Toast.makeText(this, "dice rolled", Toast.LENGTH_SHORT)
                toast.show()

            }
        }


        }




