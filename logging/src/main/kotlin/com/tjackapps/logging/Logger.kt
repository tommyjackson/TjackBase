package com.tjackapps.logging

import timber.log.Timber
import javax.inject.Inject

class Logger @Inject constructor(val timber: Timber.Tree) {
}