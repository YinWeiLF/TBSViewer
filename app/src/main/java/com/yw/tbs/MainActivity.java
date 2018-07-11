package com.yw.tbs;

import android.app.Activity;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private String filePath;
    private List<String> datas = new ArrayList<>();
    private List<String> paths = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();
        initPaths();


    }

    private void initPaths() {
    }

    private void initDatas() {


    }


}
