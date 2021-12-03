package com.example.base2021a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class AlmacenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_almacen );

        BarChart barChart = findViewById ( R.id.barChart );
        ArrayList<BarEntry> visitors = new ArrayList<> (  );
        visitors.add ( new BarEntry(2014,80));
        visitors.add ( new BarEntry(2015,70));
        visitors.add ( new BarEntry(2016,30));
        visitors.add ( new BarEntry(2017,20));
        visitors.add ( new BarEntry(2018,70));

        BarDataSet barDataSet = new BarDataSet ( visitors, "Residuos peligrosos" );
        barDataSet.setColors ( ColorTemplate.MATERIAL_COLORS );
        barDataSet.setValueTextColor ( Color.BLACK );
        barDataSet.setValueTextSize ( 16f );


        BarData barData = new BarData ( barDataSet );
        barChart.setFitBars ( true );
        barChart.setData ( barData );
        barChart.getDescription ().setText ( "% de alamcenamiento" );
        barChart.animateY (2000);


    }


}