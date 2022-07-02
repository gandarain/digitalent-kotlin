package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Using Bundle
        // val name = arguments?.getString(CategoryFragment.EXTRA_NAME)
        // val description = arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        // TODO: Using Safe Args
        val name = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val description = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock

        binding.tvCategoryName.text = name
        binding.tvCategoryDescription.text = "Stock : $description"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}