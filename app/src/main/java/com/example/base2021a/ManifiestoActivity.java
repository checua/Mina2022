package com.example.base2021a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ManifiestoActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_manifiesto );
        barChart = (BarChart) findViewById ( R.id.barChartM );
        barChart.setDrawBarShadow ( false );
        barChart.setDrawValueAboveBar ( false );
        barChart.setMaxVisibleValueCount ( 50 );
        barChart.setPinchZoom ( false );
        barChart.setDrawGridBackground ( false);

        ArrayList<BarEntry> barEntries = new ArrayList<> (  );
        barEntries.add ( new BarEntry ( 1, 40f ) );
        barEntries.add ( new BarEntry ( 2, 44f ) );
        barEntries.add ( new BarEntry ( 3, 30f ) );
        barEntries.add ( new BarEntry ( 4, 36f ) );

        BarDataSet barDataSet = new BarDataSet ( barEntries, "DataSet 1" );
        barDataSet.setColors ( ColorTemplate.COLORFUL_COLORS );
        BarData data = new BarData ( barDataSet);
        data.setBarWidth (0.9f  );
        barChart.setData ( data );



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
    }
}