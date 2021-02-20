package com.tjackapps.tjackbase.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import com.tjackapps.tjackbase.R
import com.tjackapps.tjackbase.databinding.MainActivityBinding
import com.tjackapps.tjackbase.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<MainActivityBinding>() {

    override val bindingInflater: (LayoutInflater) -> MainActivityBinding
            = MainActivityBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}