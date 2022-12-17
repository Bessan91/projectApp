package edu.birzeit.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class IntrodutionActivity extends AppCompatActivity {
private Button login;
private Button singup;
    ViewFlipper flip ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdution);

        flip=findViewById(R.id.flip);
        int images[] = {R.drawable.profile1,R.drawable.logo,R.drawable.profile1} ;

        for(int i=0 ; i< images.length ;i++ ){
            flipperImages(images[i]);

        }

    }

    public void flipperImages(int img){
        ImageView imgView = new ImageView(this);
        imgView.setBackgroundResource(img);

        flip.addView(imgView);
        flip.setFlipInterval(4000); //4sec
        flip.setAutoStart(true);

        flip.setInAnimation(this,android.R.anim.slide_in_left);
        flip.setOutAnimation(this,android.R.anim.slide_out_right);

    }

    public void login(View view) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntrodutionActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);



        }

    public void sign(View view) {
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(IntrodutionActivity.this,SignupActivity.class);
                startActivity(intent);
                finish();
            }
        },1000);

    }
}
