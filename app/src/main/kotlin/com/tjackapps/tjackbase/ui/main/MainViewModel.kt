package com.tjackapps.tjackbase.ui.main

import com.tjackapps.tjackbase.ui.base.BaseViewModel

class MainViewModel : BaseViewModel<MainViewModel.ViewState, MainViewModel.Action>() {

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