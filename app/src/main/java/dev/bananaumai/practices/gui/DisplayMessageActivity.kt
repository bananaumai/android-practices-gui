package dev.bananaumai.practices.gui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        intent.getStringExtra(MainActivity.EXTRA_MESSAGE).let {
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "${textView.text}  $it"
        }

    }
}
