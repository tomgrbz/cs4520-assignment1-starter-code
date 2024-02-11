package com.cs4520.assignment1

sealed class Product {

    data class Equipment(
        val name: String,
        val expiryDate: String?,
        val price: String
    ): Product()
    data class Food(
        val name: String,
        val expiryDate: String?,
        val price: String
    ): Product()

    companion object {
        fun create(name: Any?, type: Any?, expiryDate: Any?, price: Any?): Product? {
            if (type == "Equipment") {
                if (name != null) {
                    return price?.let { Product.Equipment(name.toString(), expiryDate.toString(), it.toString()) }
                }

            } else {
                if (name != null) {
                    return price?.let { Product.Food(name.toString(), expiryDate.toString(), it.toString()) }
                }

            }
            return null
        }
    }
}