package xyz.open032.multipazzl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import xyz.open032.multipazzl.dragNdrop.MainDrop;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mainDrop = new Intent(MainActivity.this, MainDrop.class);
        startActivity(mainDrop);
    }
}
