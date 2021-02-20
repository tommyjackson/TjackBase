package com.tjackapps.tjackbase.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jakewharton.rxrelay3.PublishRelay
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.addTo
import io.reactivex.rxjava3.kotlin.subscribeBy

abstract class BaseViewModel<VS, A : Any> : ViewModel() {
    val disposables = CompositeDisposable()

    val viewState = MutableLiveData<VS>()

    val actionStream: PublishRelay<A> by lazy {
        PublishRelay.create<A>().apply {
            this.subscribeBy(
                onNext = { handleAction(it) },
                onError = { throw it }
            ).addTo(disposables)
        }
    }

    override fun onCleared() {
        super.onCleared()
        disposables.dispose()
    }

    abstract fun handleAction(action: A)
}