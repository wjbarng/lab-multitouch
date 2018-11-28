package edu.uw.animdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val button = findViewById(R.id.button) as Button?
        button!!.setOnClickListener { v ->
            Log.v(TAG, "Clicked!")
            v.animate().x(100f).y(300f).alpha(0f)
        }
    }

    companion object {

        private val TAG = "Button"
    }
}
