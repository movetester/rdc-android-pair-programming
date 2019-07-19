package rdc.move_test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import rdc.move_test.util.getTestList

class ListActivityKotlin : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_main)
        recyclerView = findViewById(R.id.list_recyclerview)

        val listAdapter = ListAdapterKotlin(this)
        listAdapter.setListItems(getTestList())
        recyclerView.adapter = listAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        listAdapter.notifyDataSetChanged()
    }
}
