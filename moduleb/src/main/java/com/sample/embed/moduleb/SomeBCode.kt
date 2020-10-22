package com.sample.embed.moduleb

import android.content.Context
import androidx.annotation.Keep
import com.sample.embed.base.SomeBaseCode

abstract class SomeBCode : SomeBaseCode {

    @Keep
    fun executeExampleBCode(context: Context): String = context.getString(R.string.b_string)
}
