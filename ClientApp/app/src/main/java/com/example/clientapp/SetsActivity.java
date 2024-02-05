package com.example.clientapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.clientapp.Adapter.GrideAdapter;
import com.example.clientapp.databinding.ActivitySetsBinding;
import com.google.firebase.database.FirebaseDatabase;

public class SetsActivity extends AppCompatActivity {

    ActivitySetsBinding binding;
    FirebaseDatabase database;

    GrideAdapter adapter;

    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();


        database = FirebaseDatabase.getInstance();
        key = getIntent().getStringExtra("key");

        adapter = new GrideAdapter(getIntent().getIntExtra("sets", 0),
                getIntent().getStringExtra("category"));

        binding.gridView.setAdapter(adapter);



    }
}