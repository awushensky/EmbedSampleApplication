package com.sample.embed.moduled

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.Keep
import com.sample.embed.modulec.SomeCCode

@Keep
class SomeDActivity : Activity() {

    private val someDCode by lazy {
        object : SomeCCode() {
            override fun executeBaseCode(): String = getString(R.string.d_string)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_some_d)

        findViewById<Button>(R.id.breakButton).setOnClickListener {
            findViewById<TextView>(R.id.someTextView).text =
                someDCode.executeBaseCode() +
                        someDCode.executeExampleBCode(this) +
                        someDCode.executeExampleCCode(this)
        }
    }
}