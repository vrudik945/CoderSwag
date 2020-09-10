package com.v_rudik.coderswag.Services

import com.v_rudik.coderswag.Model.Category
import com.v_rudik.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$18","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey","$28","hoodie1"),
        Product("Devslopes Hoodie Black","$32","hoodie2"),
        Product("Devslopes Hoodie White","$28","hoodie3"),
        Product("Devslopes Hoodie Snapback","$30","hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Grey","$18","shirt1"),
        Product("Devslopes Shirt Black","$22","shirt2"),
        Product("Devslopes Shirt White","$18","shirt3"),
        Product("Devslopes Shirt Snapback","$20","shirt4"),
        Product("Kickflip Studios","$25","shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProduct(category: String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HODDIES" -> hoodies
            else -> digitalGoods
        }
    }

}