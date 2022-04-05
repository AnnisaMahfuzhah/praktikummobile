package com.example.annisamytechnology.data

import com.example.annisamytechnology.R
import com.example.annisamytechnology.model.AnnisaMyTechnology

class Datasource {
    fun loadAnnisaMyTechnology() : List<AnnisaMyTechnology> {
        return listOf(
            AnnisaMyTechnology(R.string.technology1, R.drawable.tab),
            AnnisaMyTechnology(R.string.technology2, R.drawable.kamera,),
            AnnisaMyTechnology(R.string.technology3, R.drawable.telpon),
            AnnisaMyTechnology(R.string.technology4, R.drawable.handphone),
            AnnisaMyTechnology(R.string.technology5, R.drawable.kalkulator),
            AnnisaMyTechnology(R.string.technology6, R.drawable.komputer),
            AnnisaMyTechnology(R.string.technology7, R.drawable.laptop),
            AnnisaMyTechnology(R.string.technology8, R.drawable.maps),
            AnnisaMyTechnology(R.string.technology9, R.drawable.mail),
            AnnisaMyTechnology(R.string.technology10, R.drawable.cloud)
        )
    }
}