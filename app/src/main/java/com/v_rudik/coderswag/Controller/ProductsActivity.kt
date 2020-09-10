package com.v_rudik.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.v_rudik.coderswag.Adapters.ProductsAdapter
import com.v_rudik.coderswag.R
import com.v_rudik.coderswag.Services.DataService
import com.v_rudik.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this,DataService.getProduct(categoryType))

        var spanCount = 2

        var orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720) {
            spanCount ==3
        }

        val layoutManager = GridLayoutManager(this, spanCount)

        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}