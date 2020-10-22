package com.sample.embed.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.sample.embed.moduled.SomeDActivity

class AppActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_app)

        findViewById<Button>(R.id.startButton).setOnClickListener {
            startActivityForResult(Intent(this, SomeDActivity::class.java), 12345)
        }
    }
}