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
        return super.getNotification(context, notificationMessage);
    }

    @Override
    public void onMessage(Context context, CustomMessage customMessage) {
        super.onMessage(context, customMessage);
        Log.e(TAG, "onMessage");
    }

    @Override
    public void onNotifyMessageOpened(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageOpened(context, notificationMessage);
    }

    @Override
    public void onNotifyMessageArrived(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageArrived(context, notificationMessage);
        Log.e(TAG, "onNotifyMessageArrived");
    }

    @Override
    public void onNotifyMessageUnShow(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageUnShow(context, notificationMessage);
    }

    @Override
    public void onNotifyMessageDismiss(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageDismiss(context, notificationMessage);
    }

    @Override
    public void onRegister(Context context, String s) {
        super.onRegister(context, s);
    }

    @Override
    public void onConnected(Context context, boolean b) {
        super.onConnected(context, b);
    }

    @Override
    public void onCommandResult(Context context, CmdMessage cmdMessage) {
        super.onCommandResult(context, cmdMessage);
    }

    @Override
    public void onMultiActionClicked(Context context, Intent intent) {
        super.onMultiActionClicked(context, intent);
    }

    @Override
    public void onTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onTagOperatorResult(context, jPushMessage);
    }

    @Override
    public void onCheckTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onCheckTagOperatorResult(context, jPushMessage);
    }

    @Override
    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onAliasOperatorResult(context, jPushMessage);
    }

    @Override
    public void onMobileNumberOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onMobileNumberOperatorResult(context, jPushMessage);
    }

    @Override
    public void onNotificationSettingsCheck(Context context, boolean b, int i) {
        super.onNotificationSettingsCheck(context, b, i);
    }

    @Override
    public boolean isNeedShowNotification(Context context, NotificationMessage notificationMessage, String s) {
        return super.isNeedShowNotification(context, notificationMessage, s);
    }

    @Override
    public void onInAppMessageArrived(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageArrived(context, notificationMessage);
    }

    @Override
    public void onInAppMessageClick(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageClick(context, notificationMessage);
    }

    @Override
    public void onInAppMessageDismiss(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageDismiss(context, notificationMessage);
    }

    @Override
    public void onInAppMessageUnShow(Context context, NotificationMessage notificationMessage) {
        super.onInAppMessageUnShow(context, notificationMessage);
    }

    @Override
    public boolean isNeedShowInAppMessage(Context context, NotificationMessage notificationMessage, String s) {
        return super.isNeedShowInAppMessage(context, notificationMessage, s);
    }

    @Override
    public byte onCheckInAppMessageState(Context context, String s) {
        return super.onCheckInAppMessageState(context, s);
    }

    @Override
    public boolean onSspNotificationWillShow(Context context, NotificationMessage notificationMessage, String s) {
        return super.onSspNotificationWillShow(context, notificationMessage, s);
    }

    @Override
    public byte onCheckSspNotificationState(Context context, String s) {
        return super.onCheckSspNotificationState(context, s);
    }

    @Override
    public void onPullInAppResult(Context context, JPushMessage jPushMessage) {
        super.onPullInAppResult(context, jPushMessage);
    }

    @Override
    public void onGeofenceRegion(Context context, String s, double v, double v1) {
        super.onGeofenceRegion(context, s, v, v1);
    }

    @Override
    public void onGeofenceReceived(Context context, String s) {
        super.onGeofenceReceived(context, s);
    }
}
