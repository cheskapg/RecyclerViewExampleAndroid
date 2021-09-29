package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.ViewHolder>{

    private List<Student> studentsList;

    public StudentsAdapter(List<Student> studentsList) {
        this.studentsList = studentsList;
     }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView FirstName, LastName, Course,ID, year;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            LastName = itemView.findViewById(R.id.tvLastName);
            FirstName = itemView.findViewById(R.id.tvFirstName);
            ID = itemView.findViewById(R.id.tvIdNumber);
            Course = itemView.findViewById(R.id.tvCourse);
            year = itemView.findViewById(R.id.tvYear);

        }
    }


    @NonNull
    @Override
    public StudentsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View studentView = layoutInflater.inflate(R.layout.student_list_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(studentView);

        return new ViewHolder(studentView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsAdapter.ViewHolder holder, int position) {
    Student student = studentsList.get(position);


        TextView LastName = holder.LastName;
        TextView FirstName = holder.FirstName;
        TextView ID = holder.ID;
        TextView Course = holder.Course;
        TextView year = holder.year;

    LastName.setText(student.getLastName());

    FirstName.setText(student.getFirstName());
    ID.setText(String.valueOf(student.getIdNumber()));
    Course.setText(student.getCourse());
    year.setText(String.valueOf(student.getYear()));

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}
