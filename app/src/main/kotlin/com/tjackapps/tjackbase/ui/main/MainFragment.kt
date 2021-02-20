package com.tjackapps.tjackbase.ui.main

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.tjackapps.logging.Logger
import com.tjackapps.tjackbase.databinding.MainFragmentBinding
import com.tjackapps.tjackbase.ui.base.BaseFragment
import com.tjackapps.tjackbase.ui.base.BaseFragmentParams
import com.tjackapps.tjackbase.ui.main.MainViewModel.Action
import com.tjackapps.tjackbase.ui.main.MainViewModel.ViewState
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : BaseFragment<ViewState, Action, MainViewModel, MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var logger: Logger

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        logger.log("OnViewCreated")
    }
}