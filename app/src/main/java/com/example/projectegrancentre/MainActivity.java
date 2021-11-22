package com.example.projectegrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ibHotels,ibParking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Codi Gerard
        ibHotels=findViewById(R.id.ib_hotels);
        ibParking=findViewById(R.id.ib_parking);
        ibHotels.setOnClickListener(this);
        ibParking.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Al fer un implements podem arribar aqui a partir de qualsevol boto. Tenim que filtrar quin hem clickat.
        int idRebuda = view.getId(); // Per fer el codi mes llegible a tots els ifs, guardem la id rebuda en una variable.
        if (ibHotels.getId()==idRebuda){
            Intent hotels = new Intent(this,hotels.class);
            startActivity(hotels);
        }
        else if (ibParking.getId()==idRebuda){
            Intent parking = new Intent(this,parking.class);
            startActivity(parking);
        }
    }
}