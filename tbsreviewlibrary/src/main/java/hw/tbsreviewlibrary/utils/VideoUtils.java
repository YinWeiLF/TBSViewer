package hw.tbsreviewlibrary.utils;

import android.content.Context;

import com.tencent.smtt.sdk.TbsVideo;

/**
 * Created on 2018/4/23.
 *
 * @author yinWei
 */

public class VideoUtils {

    /**
     * 打开播放视频文件地址，开始播放
     */
    public static void OpenVideo(Context context, String videoPath) {

        if (TbsVideo.canUseTbsPlayer(context)) {

            TbsVideo.openVideo(context, videoPath);

        }

    }
}
