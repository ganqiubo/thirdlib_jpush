package com.thirdlib.jpush;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import cn.jpush.android.api.CmdMessage;
import cn.jpush.android.api.CustomMessage;
import cn.jpush.android.api.JPushMessage;
import cn.jpush.android.api.NotificationMessage;
import cn.jpush.android.service.JPushMessageReceiver;

public class MyJPushMessageReceiver extends JPushMessageReceiver {

    private static final String TAG = MyJPushMessageReceiver.class.getSimpleName();

    public MyJPushMessageReceiver() {
        super();
    }

    @Override
    public Notification getNotification(Context context, NotificationMessage notificationMessage) {
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            Notification notification = JpushManager.getInstance().getJpushMessageListener().getNotification(context, notificationMessage);
            if(notification!=null)return notification;
        }
        return super.getNotification(context, notificationMessage);
    }

    @Override
    public void onMessage(Context context, CustomMessage customMessage) {
        super.onMessage(context, customMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onMessage(context, customMessage);
        }
        Log.e(TAG, "onMessage");
    }

    @Override
    public void onNotifyMessageOpened(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageOpened(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null)onNotifyMessageOpened(context, notificationMessage);
    }

    @Override
    public void onNotifyMessageArrived(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageArrived(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onNotifyMessageArrived(context, notificationMessage);
        }
        Log.e(TAG, "onNotifyMessageArrived");
    }

    @Override
    public void onNotifyMessageUnShow(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageUnShow(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onNotifyMessageUnShow(context, notificationMessage);
        }
    }

    @Override
    public void onNotifyMessageDismiss(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageDismiss(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onNotifyMessageDismiss(context, notificationMessage);
        }
    }

    @Override
    public void onRegister(Context context, String s) {
        super.onRegister(context, s);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onRegister(context, s);
        }
    }

    @Override
    public void onConnected(Context context, boolean b) {
        super.onConnected(context, b);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onConnected(context, b);
        }
    }

    @Override
    public void onCommandResult(Context context, CmdMessage cmdMessage) {
        super.onCommandResult(context, cmdMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onCommandResult(context, cmdMessage);
        }
    }

    @Override
    public void onMultiActionClicked(Context context, Intent intent) {
        super.onMultiActionClicked(context, intent);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onMultiActionClicked(context, intent);
        }
    }

    @Override
    public void onTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onTagOperatorResult(context, jPushMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onTagOperatorResult(context, jPushMessage);
        }
    }

    @Override
    public void onCheckTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onCheckTagOperatorResult(context, jPushMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onCheckTagOperatorResult(context, jPushMessage);
        }
    }

    @Override
    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onAliasOperatorResult(context, jPushMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onAliasOperatorResult(context, jPushMessage);
        }
    }

    @Override
    public void onMobileNumberOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onMobileNumberOperatorResult(context, jPushMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onMobileNumberOperatorResult(context, jPushMessage);
        }
    }

    @Override
    public void onNotificationSettingsCheck(Context context, boolean b, int i) {
        super.onNotificationSettingsCheck(context, b, i);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onNotificationSettingsCheck(context, b, i);
        }
    }

    @Override
    public boolean isNeedShowNotification(Context context, NotificationMessage notificationMessage, String s) {
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            return JpushManager.getInstance().getJpushMessageListener().isNeedShowNotification(context, notificationMessage, s);
        }
        return super.isNeedShowNotification(context, notificationMessage, s);
    }

    @Override
    public void onInAppMessageArrived(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageArrived(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onInAppMessageArrived(context, notificationMessage);
        }
    }

    @Override
    public void onInAppMessageClick(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageClick(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onInAppMessageClick(context, notificationMessage);
        }
    }

    @Override
    public void onInAppMessageDismiss(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageDismiss(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onInAppMessageDismiss(context, notificationMessage);
        }
    }

    @Override
    public void onInAppMessageUnShow(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageUnShow(context, notificationMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onInAppMessageUnShow(context, notificationMessage);
        }
    }

    @Override
    public boolean isNeedShowInAppMessage(Context context, NotificationMessage notificationMessage, String s) {
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            return JpushManager.getInstance().getJpushMessageListener().isNeedShowInAppMessage(context, notificationMessage, s);
        }
        return super.isNeedShowInAppMessage(context, notificationMessage, s);
    }

    @Override
    public byte onCheckInAppMessageState(Context context, String s) {
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            return JpushManager.getInstance().getJpushMessageListener().onCheckInAppMessageState(context, s);
        }
        return super.onCheckInAppMessageState(context, s);
    }

    @Override
    public boolean onSspNotificationWillShow(Context context, NotificationMessage notificationMessage, String s) {
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            return JpushManager.getInstance().getJpushMessageListener().onSspNotificationWillShow(context, notificationMessage, s);
        }
        return super.onSspNotificationWillShow(context, notificationMessage, s);
    }

    @Override
    public byte onCheckSspNotificationState(Context context, String s) {
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            return JpushManager.getInstance().getJpushMessageListener().onCheckSspNotificationState(context,  s);
        }
        return super.onCheckSspNotificationState(context, s);
    }

    @Override
    public void onPullInAppResult(Context context, JPushMessage jPushMessage) {
        super.onPullInAppResult(context, jPushMessage);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onPullInAppResult(context, jPushMessage);
        }
    }

    @Override
    public void onGeofenceRegion(Context context, String s, double v, double v1) {
        super.onGeofenceRegion(context, s, v, v1);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onGeofenceRegion(context, s, v, v1);
        }
    }

    @Override
    public void onGeofenceReceived(Context context, String s) {
        super.onGeofenceReceived(context, s);
        if(JpushManager.getInstance().getJpushMessageListener()!=null){
            JpushManager.getInstance().getJpushMessageListener().onGeofenceReceived(context, s);
        }
    }
}
