package edu.birzeit.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_logo  ;
    private Animation top;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_logo = findViewById(R.id.img_logo);
        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        img_logo.setAnimation(top);


        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, IntrodutionActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);


    }


}