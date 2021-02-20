package com.tjackapps.tjackbase.ui.main

import androidx.lifecycle.Observer
import com.tjackapps.tjackbase.databinding.MainFragmentBinding
import com.tjackapps.tjackbase.ui.base.BaseFragment
import com.tjackapps.tjackbase.ui.base.BaseFragmentParams
import com.tjackapps.tjackbase.ui.main.MainViewModel.Action
import com.tjackapps.tjackbase.ui.main.MainViewModel.ViewState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<ViewState, Action, MainViewModel, MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun getFragmentParams() = BaseFragmentParams(
        viewModelStoreOwner = this,
        viewModelClass = MainViewModel::class.java,
        bindingInflater = MainFragmentBinding::inflate
    )

    override val onViewStateChanged = Observer<ViewState> {
        when (it) {
            ViewState.StateShown -> {
                // do something
            }
        }
    }
}