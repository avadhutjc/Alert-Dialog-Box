package com.ajc.alertdialogbox;
//https://www.youtube.com/watch?v=H3wAsORlnrY

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this);
        a.setMessage("Are you sure?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //coming out of main activity
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null);
        AlertDialog c = a.create();
        c.show();

    }
}
















