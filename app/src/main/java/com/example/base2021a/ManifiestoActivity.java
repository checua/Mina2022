package com.example.base2021a;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class ManifiestoActivity extends AppCompatActivity {

    // variable for our bar chart
    BarChart barChart;

    // variable for our bar data set.
    BarDataSet barDataSet1, barDataSet2;

    // array list for storing entries.
    ArrayList barEntries;

    // creating a string array for displaying days.
    String[] strLabels = new String[]{ "Tierra", "Aceite", "Recipientes", "Estopa", "Otros" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifiesto);

        // initializing variable for bar chart.
        barChart = findViewById(R.id.barChartM);
/*
        final ArrayList<String> xLabel = new ArrayList<>();
        int i;
        xLabel.add("Tierra");
        xLabel.add("Aceite");
        xLabel.add("Recipientes");
        xLabel.add("Estopa");
        xLabel.add("Otros");


        // or use some other logic to save your data in list. For ex.
        for(i=1; i<50; i+=2)
        {
            xLabel.add(""+3*i);
        }

 */
        int act1 = 70;
        int act2 = 60;
        int act3 = 35;
        int act4 = 8;
        int act5 = 10;

        int lim1 = 80;
        int lim2 = 70;
        int lim3 = 30;
        int lim4 = 20;
        int lim5 = 50;

        String color;
        String color1;
        String color2;
        String color3;
        String color4;
        String color5;

        String Act;
        String Lim;
        float res;

        for(int i=1; i>4; i++)
        {
            Act = "act" + i;
            Lim = "lim" + i;

            res = Integer.parseInt ( Act )  / Integer.parseInt (Lim);

            if (res >= 0 && res <= .5) {

                color = "color" + i;
            }

        }

        // creating a new bar data set.
        barDataSet1 = new BarDataSet(getBarEntriesOne(act1,act2,act3,act4,act5), "Actual");
        //barDataSet1.setColor(getApplicationContext().getResources().getColor(R.color.red));


       // barDataSet1.setColors(new int[] { R.color.black, R.color.purple_500, R.color.teal_200, R.color.red, R.color.purple_200 });
        barDataSet1.setColors(
                ContextCompat.getColor(barChart.getContext(), R.color.black),
                ContextCompat.getColor(barChart.getContext(), R.color.purple_200),
                ContextCompat.getColor(barChart.getContext(), R.color.red),
                ContextCompat.getColor(barChart.getContext(), R.color.teal_200),
                ContextCompat.getColor(barChart.getContext(), R.color.red)
        );

        barDataSet2 = new BarDataSet(getBarEntriesTwo(lim1,lim2,lim3,lim4,lim5), "Límites");
        barDataSet2.setColor( Color.BLUE);
        barChart.animateY (2000);

        // below line is to add bar data set to our bar data.
        BarData data = new BarData(barDataSet1, barDataSet2);

        // after adding data to our bar data we
        // are setting that data to our bar chart.
        barChart.setData(data);

        // below line is to remove description
        // label of our bar chart.
        barChart.getDescription().setEnabled(false);

        // below line is to get x axis
        // of our bar chart.
        XAxis xAxis = barChart.getXAxis();

        // below line is to set value formatter to our x-axis and
        // we are adding our days to our x axis.
        xAxis.setValueFormatter(new IndexAxisValueFormatter (strLabels));
/*
        xAxis.setValueFormatter(new IndexAxisValueFormatter (xLabel) {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return xLabel.get((int)value);
            }
        });

 */

        // below line is to set center axis
        // labels to our bar chart.
        xAxis.setCenterAxisLabels(true);

        // below line is to set position
        // to our x-axis to bottom.
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        // below line is to set granularity
        // to our x axis labels.
        xAxis.setGranularity(1);

        // below line is to enable
        // granularity to our x axis.
        xAxis.setGranularityEnabled(true);

        // below line is to make our
        // bar chart as draggable.
        barChart.setDragEnabled(true);

        // below line is to make visible
        // range for our bar chart.
        barChart.setVisibleXRangeMaximum(3);

        // below line is to add bar
        // space to our chart.
        float barSpace = 0.1f;

        // below line is use to add group
        // spacing to our bar chart.
        float groupSpace = 0.5f;

        // we are setting width of
        // bar in below line.
        data.setBarWidth(0.15f);

        // below line is to set minimum
        // axis to our chart.
        barChart.getXAxis().setAxisMinimum(0);

        // below line is to
        // animate our chart.
        barChart.animate();
        barChart.animateY (2000);

        // below line is to group bars
        // and add spacing to it.
        barChart.groupBars(0, groupSpace, barSpace);

        // below line is to invalidate
        // our bar chart.
        barChart.invalidate();
    }

    // array list for first set
    private ArrayList<BarEntry> getBarEntriesOne(int a,int b,int c,int d,int e) {

        // creating a new array list
        barEntries = new ArrayList<>();

        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        barEntries.add(new BarEntry(1f, a));
        barEntries.add(new BarEntry(2f, b));
        barEntries.add(new BarEntry(3f, c));
        barEntries.add(new BarEntry(4f, d));
        barEntries.add(new BarEntry(5f, e));

        return barEntries;
    }

    // array list for second set.
    private ArrayList<BarEntry> getBarEntriesTwo(int a,int b,int c,int d,int e) {

        // creating a new array list
        barEntries = new ArrayList<>();

        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        barEntries.add(new BarEntry(1f, a));
        barEntries.add(new BarEntry(2f, b));
        barEntries.add(new BarEntry(3f, c));
        barEntries.add(new BarEntry(4f, d));
        barEntries.add(new BarEntry(5f, e));

        return barEntries;
    }
}



    /* Este si jala }

        mChart.setDrawBarShadow(false);
        mChart.getDescription().setEnabled(false);
        mChart.setPinchZoom(false);
        mChart.setDrawGridBackground(false);

        // empty labels so that the names are spread evenly
        String[] labels = {"", "Name1", "Name2", "Name3", "Name4", "Name5", ""};
        LabelFormatter xAxisFormatter = new LabelFormatter(mChart, labels);
        XAxis xAxis = mChart.getXAxis();
        xAxis.setCenterAxisLabels(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1f); // only intervals of 1 day
        xAxis.setTextColor( Color.BLACK);
        xAxis.setTextSize(12);
        xAxis.setAxisLineColor(Color.WHITE);
        xAxis.setAxisMinimum(1f);
        xAxis.setValueFormatter(xAxisFormatter);

        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.setTextColor(Color.BLACK);
        leftAxis.setTextSize(12);
        leftAxis.setAxisLineColor(Color.WHITE);
        leftAxis.setDrawGridLines(false);
        leftAxis.setGranularity(2);
        leftAxis.setLabelCount(8, true);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);

        mChart.getAxisRight().setEnabled(false);
        mChart.getLegend().setEnabled(false);

        float[] valOne = {10, 20, 30, 40, 50};
        float[] valTwo = {60, 50, 40, 30, 20};
        float[] valThree = {20, 10, 30, 60, 40};
        float[] valFour = {40, 10, 60, 30, 10};
        float[] valFive = {60, 50, 40, 30, 50};

        ArrayList<BarEntry> barOne = new ArrayList<>();
        ArrayList<BarEntry> barTwo = new ArrayList<>();
        ArrayList<BarEntry> barThree = new ArrayList<>();
        ArrayList<BarEntry> barFour = new ArrayList<>();
        ArrayList<BarEntry> barFive = new ArrayList<>();
        for (int i = 0; i < valOne.length; i++) {
            barOne.add(new BarEntry(i, valOne[i]));
            barTwo.add(new BarEntry(i, valTwo[i]));
            barThree.add(new BarEntry(i, valThree[i]));
            barFour.add(new BarEntry(i, valFour[i]));
            barFive.add(new BarEntry(i, valFive[i]));
        }

        BarDataSet set1 = new BarDataSet(barOne, "barOne");
        set1.setColor(Color.BLUE);
        BarDataSet set2 = new BarDataSet(barTwo, "barTwo");
        set2.setColor(Color.MAGENTA);
        BarDataSet set3 = new BarDataSet(barThree, "barTwo");
        set3.setColor(Color.RED);
        BarDataSet set4 = new BarDataSet(barFour, "barTwo");
        set4.setColor(Color.GREEN);
        BarDataSet set5 = new BarDataSet(barFive, "barTwo");
        set5.setColor(Color.LTGRAY);

        set1.setHighlightEnabled(false);
        set1.setDrawValues(false);
        set2.setHighlightEnabled(false);
        set2.setDrawValues(false);
        set3.setHighlightEnabled(false);
        set3.setDrawValues(false);
        set4.setHighlightEnabled(false);
        set4.setDrawValues(false);
        set5.setHighlightEnabled(false);
        set5.setDrawValues(false);

        ArrayList<IBarDataSet> dataSets = new ArrayList<> ( );
        dataSets.add(set1);
        dataSets.add(set2);
        dataSets.add(set3);
        dataSets.add(set4);
        dataSets.add(set5);
        BarData data = new BarData (dataSets);
        float groupSpace = 0.2f;
        float barSpace = 0f;
        float barWidth = 0.16f;
        // (barSpace + barWidth) * 5 + groupSpace = 1
        // multiplied by 5 because there are 5 five bars
        // labels will be centered as long as the equation is satisfied
        data.setBarWidth(barWidth);
        // so that the entire chart is shown when scrolled from right to left
        xAxis.setAxisMaximum(labels.length - 1.1f);
        mChart.setData(data);
        mChart.setScaleEnabled(false);
        mChart.setVisibleXRangeMaximum(2f);
        mChart.groupBars(1f, groupSpace, barSpace);
        mChart.invalidate();

    }


    private class LabelFormatter extends ValueFormatter implements IAxisValueFormatter {

        String[] labels;
        BarLineChartBase<?> chart;

        LabelFormatter(BarChart chart, String[] labels) {
            this.chart = chart;
            this.labels = labels;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            return labels[(int) value];
        }
    }

     */