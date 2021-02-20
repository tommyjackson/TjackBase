package com.tjackapps.tjackbase.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
//import timber.log.Timber
import javax.inject.Inject

abstract class BaseFragment<VS, A : Any, VM : BaseViewModel<VS, A>, VB : ViewBinding> : Fragment() {

//    @Inject
//    lateinit var timber: Timber.Tree

    private var _binding: ViewBinding? = null

    @Suppress("UNCHECKED_CAST")
    protected val binding: VB
        get() = _binding as VB

    lateinit var viewModel: VM

    abstract fun getFragmentParams(): BaseFragmentParams<VS, A, VM, VB>

    private val params by lazy { getFragmentParams() }

    open val onViewStateChanged: Observer<VS>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = params.bindingInflater.invoke(inflater)
        return requireNotNull(_binding).root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(params.viewModelStoreOwner ?: this)
            .get(params.viewModelClass)

        onViewStateChanged?.let { viewModel.viewState.observe(viewLifecycleOwner, it) }
    }
}