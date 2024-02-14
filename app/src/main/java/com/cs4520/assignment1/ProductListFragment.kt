package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cs4520.assignment1.databinding.ProductListFragmentBinding

class ProductListFragment: Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductListAdapter
    private lateinit var productListFragmentBinding: ProductListFragmentBinding

    private var products = mapListToProductType(productsDataset)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        productListFragmentBinding = ProductListFragmentBinding.inflate(inflater, container, false)
        recyclerView = productListFragmentBinding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = ProductListAdapter(products = products)
        recyclerView.adapter = adapter
        return productListFragmentBinding.root
    }

    private fun mapListToProductType(products: List<List<Any?>>): List<Product> {
        val returnList = mutableListOf<Product>()
        for (productList in products) {
            Product.create(productList[0], productList[1], productList[2], productList[3])
                ?.let { returnList.add(it) }
        }
        return returnList
    }
}