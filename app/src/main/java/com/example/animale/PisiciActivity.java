package com.example.animale;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

public class PisiciActivity extends AppCompatActivity {

    Toolbar toolbar;
    PisiciAdapter adapter;
    RecyclerView pisici_recyclerview;
    ArrayList<Pisici> listaPisici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pisici);

        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true); // Adds an up button to the toolbar
        getSupportActionBar().setTitle("Pisici");

        pisici_recyclerview = findViewById(R.id.rvPisici);
        pisici_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        pisici_recyclerview.setHasFixedSize(true);

        Intent intent = getIntent();
        listaPisici = (ArrayList<Pisici>) intent.getSerializableExtra("listaPisici");

        adapter = new PisiciAdapter(listaPisici);
        pisici_recyclerview.setAdapter(adapter);


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

