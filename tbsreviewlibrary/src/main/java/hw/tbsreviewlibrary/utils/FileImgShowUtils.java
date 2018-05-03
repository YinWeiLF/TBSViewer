package hw.tbsreviewlibrary.utils;

import android.content.Context;
import android.view.View;

import com.blankj.utilcode.util.ImageUtils;

import hw.tbsreviewlibrary.FileShowView;
import hw.tbsreviewlibrary.view.XFileDisplayView;

/**
 * Created on 2018/5/3.
 *
 * @author yinWei
 */
public class FileImgShowUtils {

    public static View showFile(Context context, String path){

        FileShowView view=null;

        if(ImageUtils.isImage(path)){


        }else {

            view = new XFileDisplayView(context);

        }

        if(view!=null) {
            view.showFile(path);
        }
        return (View) view;
    }

}
