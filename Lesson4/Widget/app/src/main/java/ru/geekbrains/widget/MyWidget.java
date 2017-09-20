package ru.geekbrains.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

public class MyWidget extends AppWidgetProvider {

    public final static String ACTION_WIDGET_RECEIVER = "ACTION_WIDGET_RECEIVER";
    private final static String ExtraMsg = "msg";

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.my_widget);
        // Создаем интент, его будем рассылать
        Intent intent = new Intent(context, MyWidget.class);
        intent.setAction(ACTION_WIDGET_RECEIVER);
        intent.putExtra(ExtraMsg, "Geekbrains!");
        // Создаем широковещание
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        // по кнопке будем отправлять это вещание
        views.setOnClickPendingIntent(R.id.button, pendingIntent);
        // Здесь обновим текст
        views.setTextViewText(R.id.appwidget_text, String.format("%s - %d", widgetText, appWidgetId));
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }
    @Override
    public void onReceive(Context context, Intent intent){

        // получаем сообщение
        String action = intent.getAction();
        if (action == ACTION_WIDGET_RECEIVER){
            String msg = "";
            try {
                msg = intent.getStringExtra(ExtraMsg);
            } catch (NullPointerException e) {
            }
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }


}

