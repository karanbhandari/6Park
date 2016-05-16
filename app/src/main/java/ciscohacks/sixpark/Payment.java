package ciscohacks.sixpark;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void buttonOnClick (View v) {
        Button button = (Button) v;
        Uri uri = Uri.parse("https://api.tropo.com/1.0/sessions?action=create&token=6b6f6d68484170456a476a764a684b7945677874535675514c746856496f616e786a57704d53597250726f6d&id=43e7eaabdbeb413292606dfb71b4b981&numberToDial=16479721697&timeVar=2"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}
