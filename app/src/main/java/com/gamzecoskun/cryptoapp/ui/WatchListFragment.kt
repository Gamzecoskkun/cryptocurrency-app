package com.gamzecoskun.cryptoapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gamzecoskun.cryptoapp.R
import com.gamzecoskun.cryptoapp.common.viewBinding
import com.gamzecoskun.cryptoapp.databinding.FragmentWatchlistBinding

class WatchListFragment : Fragment(R.layout.fragment_watchlist) {

    private val binding by viewBinding(FragmentWatchlistBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

        }
    }
}