package com.example.quis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargasArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(keluargasArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargasArrayList = new ArrayList<>();
        keluargasArrayList.add(new Keluarga("Sobari","Bapak",R.drawable.bapak));
        keluargasArrayList.add(new Keluarga("Kusbudiati","Ibu",R.drawable.ibu));
        keluargasArrayList.add(new Keluarga("Abi Tresna Utama","Anak Pertama",R.drawable.abi));
        keluargasArrayList.add(new Keluarga("Ummi Amalia Anggraeni","Anak Kedua",R.drawable.ummi));
        keluargasArrayList.add(new Keluarga("Rahma Suci Suryandari","Anak Ketiga",R.drawable.rahma));
    }
}
