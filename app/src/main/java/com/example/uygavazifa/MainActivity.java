package com.example.uygavazifa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView youtube,instagram,aliexpress;

    @Override
    public void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.activity_main);

        youtube=findViewById(R.id.youtube);
        instagram=findViewById(R.id.instagram);
        aliexpress=findViewById(R.id.aliexpress);


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenURl("https://www.youtube.com/");
            }
        });
      instagram.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              OpenURl("https://www.instagram.com/");
          }
      });
      aliexpress.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              OpenURl("https://aliexpress.ru/?gatewayAdapt=glo2rus");
          }
      });
    }

    private void OpenURl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}

