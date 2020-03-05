package com.example.lorente_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.lorente_exer4_slambook.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("", "")
    private val myAge: MyAge = MyAge("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            display(it)
        }

        binding.myName = myName
        binding.myAge = myAge

    }

    private fun display(view: View) {
        binding.apply {
            myName?.name = nameText.text.toString()
            myName?.nickname = nicknameText.text.toString()
            myAge?.age = ageText.text.toString()
            invalidateAll()
            NameHeader.visibility = View.GONE
            nicknameHeader.visibility = View.GONE
            ageHeader.visibility = View.GONE
            bdayHeader.visibility = View.GONE
            phoneHeader.visibility = View.GONE
            emailHeader.visibility = View.GONE
            courseHeader.visibility = View.GONE
            dreamHeader.visibility = View.GONE
            crushHeader.visibility = View.GONE
            messageHeader.visibility = View.GONE
            hello.visibility = View.GONE

            nicknameText.visibility = View.GONE
            nameText.visibility = View.GONE
            ageText.visibility = View.GONE
            birthdayText.visibility = View.GONE
            phoneText.visibility = View.GONE
            emailText.visibility = View.GONE
            courseText.visibility = View.GONE
            dreamText.visibility = View.GONE
            crushText.visibility = View.GONE
            messageText.visibility = View.GONE
            done_button.visibility = View.GONE
//
            nameDisplay.visibility = View.VISIBLE
            nicknameDisplay.visibility = View.VISIBLE
            ageDisplay.visibility = View.VISIBLE
            thank_you.visibility = View.VISIBLE

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)

        }
    }
}
