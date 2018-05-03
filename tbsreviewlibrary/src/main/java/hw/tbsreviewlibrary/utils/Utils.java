package hw.tbsreviewlibrary.utils;

import android.content.Context;

import com.tencent.smtt.sdk.QbSdk;

import hw.tbsreviewlibrary.ExceptionHandler;

/**
 * Created on 2018/3/5.
 *
 * @author yinWei
 */

public class Utils {

    /**
     * 初始化x5 和工具类
     * @param context
     */
    public static void initX5Environment(Context context){

        QbSdk.initX5Environment(context,null);
        com.blankj.utilcode.util.Utils.init(context);
        ExceptionHandler.getInstance().initConfig(context);

    }
}
