package com.example.fridaandroid13

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    // override onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        // call super.onCreate method
        super.onCreate(savedInstanceState)
        // set content view to activity_main layout
        setContentView(R.layout.activity_main)
        // handle button click and log "Button clicked" message with internal class as listener
        findViewById<Button>(R.id.button).setOnClickListener(InternalClickListener())
    }
}

