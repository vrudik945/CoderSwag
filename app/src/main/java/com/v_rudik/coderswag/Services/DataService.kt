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
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$18","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey","$28","hoodie01"),
        Product("Devslopes Hoodie Black","$32","hoodie02"),
        Product("Devslopes Hoodie White","$28","hoodie03"),
        Product("Devslopes Hoodie Snapback","$30","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Grey","$18","shirt01"),
        Product("Devslopes Shirt Black","$22","shirt02"),
        Product("Devslopes Shirt White","$18","shirt03"),
        Product("Devslopes Shirt Snapback","$20","shirt04"),
        Product("Kickflip Studios","$25","shirt05")
    )


}