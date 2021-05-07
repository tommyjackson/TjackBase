package com.tjackapps.tjackbase.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import com.tjackapps.base.BaseFragment
import com.tjackapps.logging.Logger
import com.tjackapps.tjackbase.databinding.MainFragmentBinding
import com.tjackapps.tjackbase.ui.main.MainViewModel.Action
import com.tjackapps.tjackbase.ui.main.MainViewModel.ViewState
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : BaseFragment<ViewState, Action, MainViewModel, MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    override val bindingInflater: (LayoutInflater) -> MainFragmentBinding
        = MainFragmentBinding::inflate

    override val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var logger: Logger

    override fun handleViewState() {
        // flow.collect ->
//        when (it) {
//            ViewState.StateShown -> {
//                // do something
//            }
//        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        logger.log("OnViewCreated")
    }
}