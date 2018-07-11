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

        datas.add("网络获取并打开doc文件");

        datas.add("打开本地doc文件");


        datas.add("打开本地txt文件");

        datas.add("打开本地excel文件");


        datas.add("打开本地ppt文件");


        datas.add("打开本地pdf文件");

        datas.add("打开视频");
    }

    private List<String> getDatas() {

        if (datas != null && datas.size() > 0) {
            return datas;
        } else {
            datas = new ArrayList<>();
            initDatas();
            return datas;
        }

    }

    private String getFilePath(int position) {
        String path = null;
        switch (position) {
            case 0:
                path = "http://www.hrssgz.gov.cn/bgxz/sydwrybgxz/201101/P020110110748901718161.doc";
                break;
            case 1:

                path =  "/storage/emulated/0/test.docx";

                break;


            case 2:
                path = "/storage/emulated/0/test.txt";
                break;

            case 3:
                path = "/storage/emulated/0/test.xlsx";
                break;
            case 4:
                path = "/storage/emulated/0/test.pptx";
                break;

            case 5:
                path = "/storage/emulated/0/test.pdf";
                break;

            case 6:
                path = "/storage/emulated/0/test.pdf";
                break;
        }
        return path;
    }
}
