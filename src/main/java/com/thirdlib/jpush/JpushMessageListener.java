package com.thirdlib.jpush;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import cn.jpush.android.api.CmdMessage;
import cn.jpush.android.api.CustomMessage;
import cn.jpush.android.api.JPushMessage;
import cn.jpush.android.api.NotificationMessage;

public class JpushMessageListener {

    public Notification getNotification(Context context, NotificationMessage notificationMessage) {
        return null;
    }

    public void onMessage(Context context, CustomMessage customMessage) {}

    public void onNotifyMessageOpened(Context context, NotificationMessage notificationMessage) {}

    public void onNotifyMessageArrived(Context context, NotificationMessage notificationMessage) {}

    public void onNotifyMessageUnShow(Context context, NotificationMessage notificationMessage) {}

    public void onNotifyMessageDismiss(Context context, NotificationMessage notificationMessage) {}

    public void onRegister(Context context, String s) {}

    public void onConnected(Context context, boolean b) {}

    public void onCommandResult(Context context, CmdMessage cmdMessage) {}

    public void onMultiActionClicked(Context context, Intent intent) {}

    public void onTagOperatorResult(Context context, JPushMessage jPushMessage) {}

    public void onCheckTagOperatorResult(Context context, JPushMessage jPushMessage) {}

    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {}

    public void onMobileNumberOperatorResult(Context context, JPushMessage jPushMessage) {}

    public void onNotificationSettingsCheck(Context context, boolean b, int i) {}

    public boolean isNeedShowNotification(Context context, NotificationMessage notificationMessage, String s) {
        return true;
    }

    public void onInAppMessageArrived(Context context, NotificationMessage notificationMessage) {}

    public void onInAppMessageClick(Context context, NotificationMessage notificationMessage) {}

    public void onInAppMessageDismiss(Context context, NotificationMessage notificationMessage) {}

    public void onInAppMessageUnShow(Context context, NotificationMessage notificationMessage) {}

    public boolean isNeedShowInAppMessage(Context context, NotificationMessage notificationMessage, String s) {
        return true;
    }

    public byte onCheckInAppMessageState(Context context, String s) {
        return 0;
    }

    public boolean onSspNotificationWillShow(Context context, NotificationMessage notificationMessage, String s) {
        return true;
    }

    public byte onCheckSspNotificationState(Context context, String s) {
        return 0;
    }

    public void onPullInAppResult(Context context, JPushMessage jPushMessage) {}

    public void onGeofenceRegion(Context context, String s, double v, double v1) {}

    public void onGeofenceReceived(Context context, String s) {}

}
