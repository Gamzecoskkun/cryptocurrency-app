package com.gamzecoskun.cryptoapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gamzecoskun.cryptoapp.R
import com.gamzecoskun.cryptoapp.common.viewBinding
import com.gamzecoskun.cryptoapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

        }
    }
}