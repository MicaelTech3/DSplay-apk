package Micael.Bardim.Dsplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class StartupOnBootUpReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Intent activityIntent = new Intent(context, MainActivity.class);
           activityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
           context.startActivity(activityIntent);
        }
    }
}
