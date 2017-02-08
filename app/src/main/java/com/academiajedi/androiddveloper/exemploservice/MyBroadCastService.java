package com.academiajedi.androiddveloper.exemploservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by alexsoaresdesiqueira on 08/02/17.
 */

public class MyBroadCastService extends BroadcastReceiver {

    private static final String ACTION_SERVICE = "com.academiajedi.androiddveloper.exemploservice.SERVICO_JEDI";


    @Override
    public void onReceive(Context context, Intent intent) {
        Intent it = new Intent(ACTION_SERVICE);
        it.setPackage(context.getPackageName());
        context.startService(it);

    }
}
