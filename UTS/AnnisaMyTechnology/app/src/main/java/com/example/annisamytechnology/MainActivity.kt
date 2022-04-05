package com.example.annisamytechnology

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.annisamytechnology.adapter.itemAdapter
import com.example.annisamytechnology.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myDataset = Datasource().loadAnnisaMyTechnology()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = itemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}