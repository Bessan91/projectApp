package edu.birzeit.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

//import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class testActivity extends AppCompatActivity {
    private ImageButton imageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//      getSupportActionBar().setIcon(R.drawable.logo);
//     BottomNavigationView bottom_nav = bottom_nav = findViewById(R.id.navBar);
       // bottom_nav.setSelectedItemId(R.id.mainMenu);
//        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.mainMenu:
//                        return true;
//                    case R.id.fav:
//                        startActivity(new Intent(getApplicationContext(), Favorite.class));
//                        overridePendingTransition(0, 0);
//                        return true;
//                    case R.id.account:
//                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
//                        overridePendingTransition(0, 0);
//                        return true;
//                }
//                return false;
//            }
//        });
       // setupViews();
    }
//    private void setupViews() {
//        imageButton1 = findViewById(R.id.imageButton1);
//        imageButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(testActivity.this, detailsTour.class);
//                startActivity(intent);
//            }
//        });
//
//    }

    public void buttonimage(View view) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(testActivity.this,detailsTour.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}