package dev.bananaumai.practices.gui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    private val tag = this::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        Log.d(tag, "onCreate() : is finishing? -> $isFinishing")

        intent.getStringExtra(MainActivity.EXTRA_MESSAGE).let {
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "${textView.text}  $it"
        }
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(tag, "onRestart() : is finishing? -> $isFinishing")
    }

    override fun onStart() {
        super.onStart()

        Log.d(tag, "onStart() : is finishing? -> $isFinishing")
    }

    override fun onResume() {
        super.onResume()

        Log.d(tag, "onResume() : is finishing? -> $isFinishing")
    }

    override fun onPause() {
        super.onPause()

        Log.d(tag, "onPause() : is finishing? -> $isFinishing")
    }

    override fun onStop() {
        super.onStop()

        Log.d(tag, "onStop() : is finishing? -> $isFinishing")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(tag, "onDestroy() : is finishing? -> $isFinishing")

    }
}
