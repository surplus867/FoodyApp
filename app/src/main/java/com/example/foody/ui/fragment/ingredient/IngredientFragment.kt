package com.example.foody.ui.fragment.ingredient

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foody.R
import com.example.foody.adapter.IngredientsAdapter
import com.example.foody.databinding.FragmentIngredientBinding
import com.example.foody.models.Result
import com.example.foody.util.Constants.Companion.RECIPE_RESULT_KEY

class IngredientFragment : Fragment() {

    private val mAdapter: IngredientsAdapter by lazy { IngredientsAdapter() }

    private var _binding: FragmentIngredientBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentIngredientBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args?.getParcelable(RECIPE_RESULT_KEY)

        setUpRecyclerView()
        myBundle?.extendedIngredients?.let { mAdapter.setData(it) }

        return binding.root
    }

    private fun setUpRecyclerView() {
        binding.ingredientsRecyclerview.adapter = mAdapter
        binding.ingredientsRecyclerview.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}