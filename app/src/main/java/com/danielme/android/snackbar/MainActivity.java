package com.danielme.android.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author danielme.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void simpleSnackbar(View view) {
        Snackbar.make(view, getString(R.string.hello), Snackbar.LENGTH_SHORT)
                .show();
    }

    public void actionSnackbar(View view) {
        Snackbar.make(view, getString(R.string.hello), Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.toast), new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, getText(R.string.action), Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

    public void styleSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(view, getString(R.string.hello), Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.toast), new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, getText(R.string.action), Toast.LENGTH_SHORT).show();
                    }
                });

        //ACTION
        snackbar.setActionTextColor(getResources().getColor(R.color.snackbar_action));
        View snackBarView = snackbar.getView();
        //BACKGROUND
        snackBarView.setBackgroundColor(getResources().getColor(R.color.snackbar_background));
        //MESSAGE
        TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextColor(getResources().getColor(R.color.snackbar_message));

        snackbar.show();
    }

}
