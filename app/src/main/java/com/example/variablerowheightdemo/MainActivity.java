package com.example.variablerowheightdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.variablerowheightdemo.utils.ResUtils;
import com.flexicious.nestedtreedatagrid.FlexDataGrid;

public class MainActivity extends AppCompatActivity {

    FlexDataGrid grid;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.dataGrid);
        grid.delegate = this;
        grid.setFocusable(true);
        grid.buildFromXml(ResUtils.getStringFromResource(this, R.raw.test_grid));
        grid.setVerticalScrollPolicy("on");
        enableGridLines(grid);
        grid.setDataProviderJson(ResUtils.getStringFromResource(this, R.raw.test_data));
    }

    private void enableGridLines(FlexDataGrid grid) {
        grid.horizontalGridLines = true;
        grid.horizontalGridLineThickness = 8;
        grid.horizontalGridLineColor=0xff000000;
        grid.verticalGridLines = true;
        grid.verticalGridLineThickness = 4;
        grid.verticalGridLineColor=0xff000000;
        grid.headerVerticalGridLineColor = 0xff000000;
        grid.headerVerticalGridLineThickness = 4;
        grid.headerHorizontalGridLineColor = 0xff000000;
        grid.headerHorizontalGridLineThickness = 8;
        grid.footerVerticalGridLineColor = 0xff000000;
        grid.footerVerticalGridLineThickness = 4;
        grid.footerHorizontalGridLineColor = 0xff000000;
        grid.footerHorizontalGridLineThickness = 8;
    }
}
