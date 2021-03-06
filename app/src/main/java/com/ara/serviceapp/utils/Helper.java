package com.ara.serviceapp.utils;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ara.serviceapp.R;

import java.util.Calendar;

public class Helper {
    public static class ServiceType {
        public static final int PENDING = 1;
        public static final int IN_PROGRESS = 2;
        public static final int COMPLETED = 3;
    }

    public static final String REST_URL = "http://arasoftwares.in/lift-tech/";

    public static final String LOGIN_ACTION = "login";
    public static final String PREFERENCE_NAME = "LiftInfo";
    public static final String DATE_EXTRA = "date_result";
    public static final String USER_INFO = "userInfoPreference";
    public final static String REQUEST_CODE = "requestCode";
    public static final String CUSTOMER_EXTRA = "customer";
    public static final String TRUCK_EXTRA = "Truck";
    public static final String SERVICE_EXTRA = "service";
    public static final String USER_LIST_EXTRA = "user-list";


    public final static int INTERNET_PERMISSION_REQUEST = 101;
    public final static int DATE_REQUEST_CODE = 102;
    public final static int CUSTOMER_SELECT = 103;
    public final static int TRUCK_SELECT = 104;
    public final static int EMPLOYEE_SELECT = 105;

    public static void showSnackBar(View view,String msg){
        final Snackbar snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        TextView snackViewText = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        Button snackViewButton = (Button) sbView.findViewById(android.support.design.R.id.snackbar_action);
        sbView.setBackgroundColor(view.getResources().getColor(R.color.radical_red));
        snackViewText.setTextColor(view.getResources().getColor(R.color.white));
        snackViewButton.setTextColor(view.getResources().getColor(R.color.black));
        snackbar.setAction(R.string.ok, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }


    public static void showSnackBar(View view, int messageId) {
        final Snackbar snackbar = Snackbar.make(view, messageId, Snackbar.LENGTH_LONG);
        snackbar.setAction(R.string.ok, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

    public static String dateToString(Calendar calendar) {
        return calendar.get(Calendar.DATE) + "-"
                + (calendar.get(Calendar.MONTH) + 1) + "-"
                + calendar.get(Calendar.YEAR);
    }

    public static String timeToString(Calendar calendar) {
        return calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
                + " " + calendar.get(Calendar.AM_PM);
    }
}
