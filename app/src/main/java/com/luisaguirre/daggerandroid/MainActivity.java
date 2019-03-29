package com.luisaguirre.daggerandroid;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.luisaguirre.daggerandroid.networking.NetworkApi;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends DaggerActivity {

    @Inject
    NetworkApi networkApi;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean injected = networkApi != null;
        TextView userAvailable = findViewById(R.id.target);

        userAvailable.setText("Dependency with dagger application injection worked: " + String.valueOf(injected));

        if (networkApi != null) {
            boolean isUserValid = networkApi.validateUser("Luis", "12345");
            TextView connection = findViewById(R.id.connection);

            if (isUserValid) {
                connection.setText("User is valid");
            } else {
                connection.setText("User is not valid");
            }
        }
    }
}
