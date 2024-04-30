package com.example.fridaandroid13

import android.util.Log
import android.view.View

class InternalClickListener : View.OnClickListener {
    override fun onClick(v: View?) {
        Log.d("InternalClickListener", "Button clicked");
    }

}