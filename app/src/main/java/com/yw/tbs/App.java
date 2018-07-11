package com.yw.tbs;

/**
 * Created by 12457 on 2017/8/2.
 */

import android.app.Application;

import hw.tbsreviewlibrary.utils.Utils;


/**
 * Created by ljh
 * on 2016/12/22.
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

//        MultiDex.install(this);
        //增加这句话
        Utils.initX5Environment(this);

    }


}
