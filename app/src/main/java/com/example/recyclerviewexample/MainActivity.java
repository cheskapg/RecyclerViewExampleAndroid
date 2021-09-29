package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Student> studentsList;
    RecyclerView recyclerViewList;
    StudentsAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewList = findViewById(R.id.recyclerViewStudentList);
        studentsList = new ArrayList<>();

        studentsList.add( new Student("palma", "monik",32,"BSIT", 2));
        studentsList.add(new Student("PalRJTma", "GFSG", 1, "BSIT", 2 ));
        studentsList.add(new Student("PalRTJRma", "FDFS", 1, "BSIT", 2 ));
//        studentsList.add(new Student("JRJ", "SDFDS", 1, "BSIT", 2 ));
//        studentsList.add(new Student("PalRJTJma", "SDF", 1, "BSIT", 2 ));
//        studentsList.add(new Student("PalTTJRma", "SDFDF", 1, "BSIT", 2 ));
//        studentsList.add(new Student("Palma", "SDFSDF", 1, "BSIT", 2 ));
//        studentsList.add(new Student("WETEW", "aerew", 1, "BSIT", 2 ));
//        studentsList.add(new Student("WETW", "TEEWT", 1, "BSIT", 2 ));
//        studentsList.add(new Student("PaJRJlma", "WTWE", 1, "BSIT", 2 ));

        recyclerAdapter = new StudentsAdapter(studentsList);
        // connect view to adapter
        recyclerViewList.setAdapter(recyclerAdapter);
        //set linear
        recyclerViewList.setLayoutManager( new LinearLayoutManager(this));
    }
}