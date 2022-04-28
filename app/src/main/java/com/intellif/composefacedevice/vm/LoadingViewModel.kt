package com.intellif.composefacedevice.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intellif.composefacedevice.utils.SDKManager
import kotlinx.coroutines.launch

class LoadingViewModel : ViewModel() {

    fun initSDK() {
        viewModelScope.launch {
            initSDKAsy()


        }

    }


    @Suppress("RedundantSuspendModifier")
    private suspend fun initSDKAsy() {
        SDKManager.initSDK()

    }

}