package dev.bananaumai.practices.gui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    }

    private val tag = this::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag, "onCreate() : is finishing? -> $isFinishing")
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

    fun sendMessage(view: View) {
        Intent(this, DisplayMessageActivity::class.java).let { intent ->
            val editText = findViewById<EditText>(R.id.editText)
            val message = editText.text.toString()
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent)
        }
    }
}
