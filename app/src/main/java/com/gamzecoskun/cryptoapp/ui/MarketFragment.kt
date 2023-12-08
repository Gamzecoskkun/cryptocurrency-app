package com.gamzecoskun.cryptoapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gamzecoskun.cryptoapp.R
import com.gamzecoskun.cryptoapp.common.viewBinding
import com.gamzecoskun.cryptoapp.databinding.ActivityMainBinding.bind
import com.gamzecoskun.cryptoapp.databinding.FragmentHomeBinding
import com.gamzecoskun.cryptoapp.databinding.FragmentMarketBinding

class MarketFragment : Fragment(R.layout.fragment_market) {

    private val binding by viewBinding(FragmentMarketBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

        }
    }
}