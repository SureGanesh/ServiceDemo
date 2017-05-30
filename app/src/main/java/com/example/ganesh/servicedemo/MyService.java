package com.example.ganesh.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by kvana on 5/29/17.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service is Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent,  int flags, int startId) {
        Toast.makeText(this, "Service is started", Toast.LENGTH_SHORT).show();
        //stopSelf();
        String message;
        message =intent.getStringExtra("message");
        Toast.makeText(this, "message = "+message, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service is Stopped", Toast.LENGTH_SHORT).show();
    }
}
