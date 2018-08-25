package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    public static void showToast(Context conext){
        Toast.makeText(conext,"sucess",Toast.LENGTH_LONG).show();
    }
}
