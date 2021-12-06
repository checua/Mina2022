package com.example.base2021a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.LargeValueFormatter;

import java.util.ArrayList;

public class BitacoraActivity extends AppCompatActivity {

    private BarChart chart;
    float barWidth;
    float barSpace;
    float groupSpace;


    @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bitacora);
            //BarChart mChart = findViewById(R.id.barChartB);

        barWidth = 0.3f;
        barSpace = 0f;
        groupSpace = 0.4f;

        chart = (BarChart)findViewById(R.id.barChartB);
        chart.setDescription(null);

        /*chart.setPinchZoom(false);
        chart.setScaleEnabled(false);
        chart.setDrawBarShadow(false);
        chart.setDrawGridBackground(false);


         */

        int groupCount = 5;

        ArrayList xVals = new ArrayList();

        xVals.add("Tierra");
        xVals.add("Aceite");
        xVals.add("Recipientes");
        xVals.add("Estopa");
        xVals.add("Otros");


        ArrayList yVals1 = new ArrayList();
        ArrayList yVals2 = new ArrayList();

        yVals1.add(new BarEntry (1, (float) 80));
        yVals2.add(new BarEntry(1, (float) 70));
        yVals1.add(new BarEntry(2, (float) 70));
        yVals2.add(new BarEntry(2, (float) 60));
        yVals1.add(new BarEntry(3, (float) 30));
        yVals2.add(new BarEntry(3, (float) 35));
        yVals1.add(new BarEntry(4, (float) 20));
        yVals2.add(new BarEntry(4, (float) 8));
        yVals1.add(new BarEntry(5, (float) 50));
        yVals2.add(new BarEntry(5, (float) 10));


        BarDataSet set1, set2;
        set1 = new BarDataSet(yVals1, "Límite");
        set1.setColor( Color.RED);
        set2 = new BarDataSet(yVals2, "Actual");
        set2.setColor(Color.BLUE);
        BarData data = new BarData (set1, set2);

        data.setValueFormatter(new LargeValueFormatter ());
        chart.setData(data);
        chart.getBarData().setBarWidth(barWidth);
        chart.getXAxis().setAxisMinimum(0);
        chart.getXAxis().setAxisMaximum(0 + chart.getBarData().getGroupWidth(groupSpace, barSpace) * groupCount);
        chart.groupBars(0, groupSpace, barSpace);
        chart.getData().setHighlightEnabled(false);
        chart.invalidate();

        Legend l = chart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(true);
        l.setYOffset(20f);
        l.setXOffset(0f);
        l.setYEntrySpace(0f);
        l.setTextSize(8f);

        //X-axis
        XAxis xAxis = chart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisMaximum(6);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IndexAxisValueFormatter (xVals));
//Y-axis
        chart.getAxisRight().setEnabled(false);
        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.setValueFormatter(new LargeValueFormatter());
        leftAxis.setDrawGridLines(true);
        leftAxis.setSpaceTop(35f);
        leftAxis.setAxisMinimum(0f);


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


        ArrayList<BarEntry> entries = new ArrayList<> ();

        for (int i = 0; i < 5; i++) {
            entries.add(new BarEntry(i, (float) (Math.random() * 70) + 30));



        }

        BarDataSet d = new BarDataSet(entries, "Residuos peligrosos ");
        d.setColors( ColorTemplate.VORDIPLOM_COLORS);
        d.setBarShadowColor( Color.rgb(203, 203, 203));


        ArrayList<IBarDataSet> sets = new ArrayList<>();
        sets.add(d);

        BarData cd = new BarData(sets);
        cd.setBarWidth(0.9f);

        mChart.setData(cd);
*/




    }
/*
    public class LabelFormatter extends ValueFormatter {
        @SuppressWarnings("deprecation")
        @Override
        public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
            // assuming that getHeader() returned the label
            return (String) entry.getData();
        }
    }

 */
}



