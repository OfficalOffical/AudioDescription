package org.tensorflow.lite.examples.detection.tflite;

import android.app.Application;
import android.content.Context;


public class TTS extends Application{

    private static TTS instance;
    private static Context mContext;

    public static TTS getInstance() {
        return instance;
    }

    public static Context getContext() {
        //  return instance.getApplicationContext();
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //  instance = this;
        mContext = getApplicationContext();
    }

}
