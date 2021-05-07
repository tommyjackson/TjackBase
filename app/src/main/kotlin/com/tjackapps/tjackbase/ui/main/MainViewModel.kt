package com.tjackapps.tjackbase.ui.main

import com.tjackapps.base.BaseViewModel
import com.tjackapps.logging.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val logger: Logger
) : BaseViewModel<MainViewModel.ViewState, MainViewModel.Action>() {

    override fun handleAction(action: Action) {
        when (action) {
            Action.LaunchAction -> {
                // do something
            }
        }
    }

    sealed class ViewState {
        object StateShown : ViewState()
    }
    sealed class Action {
        object LaunchAction : Action()
    }
}