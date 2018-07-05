package com.example.rajivranjan.implicitintentdemoproject;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

EditText etSearchText;
Button btnSearchValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSearchText = (EditText)findViewById(R.id.EdSearch);
        btnSearchValue = (Button)findViewById(R.id.btnSearch);

        btnSearchValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    String findsearch = etSearchText.getText().toString();
                    intent.putExtra(SearchManager.QUERY, findsearch);
                    startActivity(intent);
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }
        });
    }
}
