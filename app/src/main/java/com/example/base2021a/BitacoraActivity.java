package com.example.base2021a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BitacoraActivity extends AppCompatActivity {

    @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bitacora);
            BarChart chart = findViewById(R.id.barChartB);

            /*
            ArrayList NoOfEmp = new ArrayList();

            NoOfEmp.add(new BarEntry (945f, 0));
            NoOfEmp.add(new BarEntry(1040f, 1));
            NoOfEmp.add(new BarEntry(1133f, 2));
            NoOfEmp.add(new BarEntry(1240f, 3));
            NoOfEmp.add(new BarEntry(1369f, 4));
            NoOfEmp.add(new BarEntry(1487f, 5));
            NoOfEmp.add(new BarEntry(1501f, 6));
            NoOfEmp.add(new BarEntry(1645f, 7));
            NoOfEmp.add(new BarEntry(1578f, 8));
            NoOfEmp.add(new BarEntry(1695f, 9));

            ArrayList year = new ArrayList();

            year.add("2008");
            year.add("2009");
            year.add("2010");
            year.add("2011");
            year.add("2012");

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add((IBarDataSet) year);

            BarDataSet bardataset = new BarDataSet(NoOfEmp, "No Of Employee");
            chart.animateY(5000);
            BarData data = new BarData( bardataset);
            bardataset.setColors( ColorTemplate.COLORFUL_COLORS);
            chart.setData(data);

             */

        ArrayList<BarEntry> entries = new ArrayList<> ();

        for (int i = 0; i < 12; i++) {
            entries.add(new BarEntry(i, (float) (Math.random() * 70) + 30));
        }

        BarDataSet d = new BarDataSet(entries, "New DataSet " + 5);
        d.setColors( ColorTemplate.VORDIPLOM_COLORS);
        d.setBarShadowColor( Color.rgb(203, 203, 203));

        ArrayList<IBarDataSet> sets = new ArrayList<>();
        sets.add(d);

        BarData cd = new BarData(sets);
        cd.setBarWidth(0.9f);

        chart.setData(cd);

        }



}