package com.robotemi.welcomingbtob

import android.content.Intent
import com.robotemi.sdk.NlpResult

interface IActivityCallback {
    fun setCloseVisibility(isVisible: Boolean)

    fun toggleActivityClickListener(enable: Boolean)

    fun onNlpCompleted(nlpResult: NlpResult)

}