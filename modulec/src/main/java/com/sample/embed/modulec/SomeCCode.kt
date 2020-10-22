package com.sample.embed.modulec

import android.content.Context
import androidx.annotation.Keep
import com.sample.embed.moduleb.SomeBCode

abstract class SomeCCode : SomeBCode() {

    @Keep
    fun executeExampleCCode(context: Context): String = context.getString(R.string.c_string)
}
