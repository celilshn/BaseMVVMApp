package com.cengcelil.basemvvmapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.cengcelil.basemvvmapp.databinding.BlackFragmentBinding
import com.cengcelil.basemvvmapp.databinding.WhiteFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BlackFragment : Fragment() {

    private lateinit var viewModel: BlackViewModel
    private lateinit var b: BlackFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        b = BlackFragmentBinding.inflate(LayoutInflater.from(requireContext()))
        viewModel = ViewModelProvider(this)[BlackViewModel::class.java]
        return b.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}