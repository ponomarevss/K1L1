package ru.geekbrains.ponomarevss.k1l1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        hello_button.setOnClickListener {
            viewModel.buttonClicked()
        }

        viewModel.getMyLiveData().observe(this, Observer { value ->
            Toast.makeText(this, value, Toast.LENGTH_LONG).show()
        })

    }


}