package io.neowise.samples.vmpexample.ui.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.neowise.samples.vmpexample.R
import io.neowise.samples.vmpexample.ui.contracts.Counter

class CounterActivity : AppCompatActivity(R.layout.activity_counter), Counter.View {

    private val presenter = CounterPresenter()

    private lateinit var counterText: TextView
    private lateinit var plusBtn: Button
    private lateinit var minusBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.attachView(this)

        counterText = findViewById(R.id.counter)
        plusBtn = findViewById(R.id.plus)
        minusBtn = findViewById(R.id.minus)

        plusBtn.setOnClickListener {
            presenter.increment()
        }

        minusBtn.setOnClickListener {
            presenter.decrement()
        }
    }

    override fun updateCounter(value: Int) {
        counterText.text = value.toString()
    }
}