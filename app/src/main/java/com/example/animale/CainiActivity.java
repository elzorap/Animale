package com.example.animale;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

public class CainiActivity extends AppCompatActivity {

    Toolbar toolbar;
    CainiAdapter adapter;
    RecyclerView caini_recyclerView;
    ArrayList<Caini> listaCaini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_caini);

        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true); // Adds an up button to the toolbar
        getSupportActionBar().setTitle("Caini");


        caini_recyclerView = findViewById(R.id.rvCaini);
        caini_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        caini_recyclerView.setHasFixedSize(true);

        Intent intent = getIntent();
        listaCaini = (ArrayList<Caini>) intent.getSerializableExtra("listaCaini");


        adapter = new CainiAdapter(listaCaini);
        caini_recyclerView.setAdapter(adapter);

    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

