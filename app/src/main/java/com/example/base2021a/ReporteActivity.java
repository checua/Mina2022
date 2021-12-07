package com.example.base2021a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class ReporteActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_reporte );

        barChart = findViewById ( R.id.barChartR );
        BarDataSet barDataSet1 =  new BarDataSet ( dataValues1 (), "DataSet 1" );
        barDataSet1.setColor ( Color.RED );
        BarData barData = new BarData();
        barData.addDataSet ( barDataSet1 );

        barChart.setData(barData);
        barChart.invalidate ();

    }

    private ArrayList<BarEntry> dataValues1(){
        ArrayList<BarEntry> dataVals = new ArrayList<> (  );
        dataVals.add ( new BarEntry ( 0,3 ));
        dataVals.add ( new BarEntry ( 1,2 ));
        dataVals.add ( new BarEntry ( 3,6 ));
        dataVals.add ( new BarEntry ( 4,11 ));
        return dataVals;
    }
}