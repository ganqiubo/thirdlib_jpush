package com.thirdlib.jpush;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

public class JpushManager {

    private static final String TAG = JpushManager.class.getSimpleName();
    private Context applicationContext;
    private static volatile JpushManager instance = null;

    public static JpushManager getInstance() {
        if (instance == null){
            synchronized (JpushManager.class){
                if (instance == null){
                    instance = new JpushManager();
                }
            }
        }
        return instance;
    }

    public void init(Context applicationContext){
        JPushInterface.setDebugMode(true);
        JPushInterface.init(applicationContext);
        this.applicationContext = applicationContext;
    }

    private MyHandler myHandler;
    private String alias;
    public void setAlias(String alias) {
        if(applicationContext==null){
            Log.e(TAG, "jpush has not inited");
            return;
        }
        myHandler = new MyHandler(this);
        this.alias = alias;
        JPushInterface.setAliasAndTags(applicationContext, alias, null, mAliasCallback);
    }

    public void clearAlias() {
        if(applicationContext==null){
            Log.e(TAG, "jpush has not inited");
            return;
        }
        JPushInterface.setAliasAndTags(applicationContext, "", null, mAliasCallback);
    }

    class MyHandler extends Handler {
        private final WeakReference<JpushManager> jpushManagerWeakReference;

        public MyHandler(JpushManager jpushManager) {
            jpushManagerWeakReference = new WeakReference<JpushManager>(jpushManager);
        }

        @Override
        public void handleMessage(Message msg) {
            JpushManager jpushManager = jpushManagerWeakReference.get();
            if (jpushManager != null && alias!=null && msg.what == 100) {
                setAlias(alias);
            }
        }
    }

    private final TagAliasCallback mAliasCallback = new TagAliasCallback() {

        @Override
        public void gotResult(int code, String alias, Set<String> tags) {
            String logs;
            switch (code) {
                case 0:
                    logs = "Set tag and alias success alias:" + alias;
                    break;
                case 6002:
                case 6014:
                    if (alias == null || alias.isEmpty()) {
                        return;
                    }
                    logs = "Failed to set alias and tags due to timeout. Try again after 20s.";
                    Message obtain = Message.obtain();
                    obtain.what = 100;
                    myHandler.sendMessageDelayed(obtain, 1000 * 20);
                    break;
                default:
                    logs = "Failed with errorCode = " + code;
            }
            Log.e(TAG, logs);
        }
    };

}
