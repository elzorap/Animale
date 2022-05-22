package com.example.animale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ImageView iv_caini;
    ImageView iv_pisici;
    String API_BASE_URL ="https://run.mocky.io/";
    Toolbar toolbar;

    ArrayList<Caini> listaCaini;

    ArrayList<Pisici> listaPisici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getAnimaleResponse();

        iv_caini = findViewById(R.id.ivCaini);
        iv_pisici = findViewById(R.id.ivPisici);


        iv_caini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CainiActivity.class);
                intent.putExtra("listaCaini", listaCaini);
                startActivity(intent);


            }
        });

        iv_pisici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PisiciActivity.class);
                intent.putExtra("listaPisici", listaPisici);
                startActivity(intent);
            }
        });

    }

    private void getAnimaleResponse() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimaleApi animaleApi = retrofit.create(AnimaleApi.class);
        Call<Response> call = animaleApi.getAnimale();

        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                if (response.body() != null) {
                    Response animale = response.body();
                    listaCaini = new ArrayList<>(animale.getAnimale().getCaine());
                    listaPisici = new ArrayList<>(animale.getAnimale().getPisica());
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });

    }
}