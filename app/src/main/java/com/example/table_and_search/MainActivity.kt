package com.example.table_and_search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list1= ArrayList<String>()
        list1.add("harry")
        list1.add("kitti")
        list1.add("chintu")
        list1.add("hari")
        list1.add("potter")
        list1.add("harry")
        list1.add("kitti")
        list1.add("chintu")
        list1.add("hari")
        list1.add("potter")
        list1.add("harry")
        list1.add("kitti")
        list1.add("chintu")
        list1.add("hari")
        list1.add("potter")
        list1.add("harry")
        list1.add("kitti")
        list1.add("chintu")
        list1.add("hari")
        list1.add("potter")

        var adapterItems=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1)
        listView.adapter= adapterItems

        search_btn.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                if(list1.contains(query)){
                    adapterItems.filter.filter(query)
                }
                else{
                    var s=query.toString()
                    Toast.makeText(this@MainActivity,"$s",Toast.LENGTH_SHORT).show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                adapterItems.filter.filter(newText)
                listView.visibility=View.VISIBLE
                if (newText != null) {
                    if(newText.isEmpty()){
                        listView.visibility=View.GONE
                    }
                }
                return false
            }

        })

        }

    }


