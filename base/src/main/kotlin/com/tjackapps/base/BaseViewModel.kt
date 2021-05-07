package com.tjackapps.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<VS, A : Any> : ViewModel() {

    abstract fun handleAction(action: A)
}