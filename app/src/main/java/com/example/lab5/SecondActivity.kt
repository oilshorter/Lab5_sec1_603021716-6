package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newStudent = data?.getParcelable<student>("stdData")
        idText.text = "Student ID : ${newStudent.id}"
        nameText.text = "Student Name : ${newStudent?.name}"
        ageText.text = "Student Age : ${newStudent?.age}"
    }

    fun onClickClose(view: View) {
        finish()
    }
}
