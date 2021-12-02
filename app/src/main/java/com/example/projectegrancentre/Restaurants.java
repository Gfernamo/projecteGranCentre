package com.example.projectegrancentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        MaterialToolbar toolbar = findViewById(R.id.topAppbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.lateral_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id)
                {
                    case R.id.nav_home:
                        Toast.makeText(Restaurants.this, "Home is clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_business:
                        Toast.makeText(Restaurants.this, "Business is clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_movie:
                        Toast.makeText(Restaurants.this, "Movie is clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_hotels:
                        Toast.makeText(Restaurants.this, "Hotels is clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_parking:
                        Toast.makeText(Restaurants.this, "Parking is clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_restaurants:
                        Toast.makeText(Restaurants.this, "Restaurants is clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_transport:
                        Toast.makeText(Restaurants.this, "Transport is clicked", Toast.LENGTH_SHORT).show();break;
                    default:
                        return true;
                }
                return true;
            }
        });
    }
}