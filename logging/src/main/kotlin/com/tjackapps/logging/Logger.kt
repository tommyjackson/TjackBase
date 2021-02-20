package com.tjackapps.logging

import timber.log.Timber
import javax.inject.Inject

class Logger @Inject constructor(private val timber: Timber.Tree) {

    fun log(message: String) {
        timber.d(message)
    }
}