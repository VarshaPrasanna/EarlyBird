package com.example.earlybird;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("tslil","onReceiver");
        Intent intent5 = new Intent(context, QuizChallenge.class);
        intent5.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent5);
    }
}