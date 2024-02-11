package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductListFragment: Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductListAdapter

    private var products = mapListToProductType(productsDataset)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.product_list_fragment, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = ProductListAdapter(products = products)
        recyclerView.adapter = adapter
        return view
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