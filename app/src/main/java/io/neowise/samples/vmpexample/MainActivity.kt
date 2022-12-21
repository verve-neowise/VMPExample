package io.neowise.samples.vmpexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.neowise.samples.vmpexample.ui.counter.CounterActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.goto_counter).setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
    }
}