package xyz.open032.multipazzl.dragNdrop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainDrop extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        Intent dnd = new Intent(MainDrop.this, DandDMultiPazl.class);
        startActivity(dnd);
    }
}
