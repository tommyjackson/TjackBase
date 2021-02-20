package com.tjackapps.tjackbase.ui.base

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelStoreOwner
import androidx.viewbinding.ViewBinding

data class BaseFragmentParams<VS, A : Any, VM : BaseViewModel<VS, A>, VB : ViewBinding>(
    val viewModelStoreOwner: ViewModelStoreOwner? = null,
    val viewModelClass: Class<out VM>,
    val bindingInflater: (LayoutInflater) -> VB
)
