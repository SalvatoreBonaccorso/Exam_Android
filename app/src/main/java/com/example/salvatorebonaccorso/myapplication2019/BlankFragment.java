package com.example.salvatorebonaccorso.myapplication2019;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class BlankFragment extends Fragment {

    public BlankFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_container, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView studentsList = view.findViewById(R.id.student_list);
        studentsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Integer> students = StudentsSingleton.getInstance().getStudentsList();
        StudentAdapter adapter = new StudentAdapter(students);
        studentsList.setAdapter(adapter);
    }
    private class StudentHolder extends RecyclerView.ViewHolder {
        private int resTitle;
        private TextView studentName;
        public StudentHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_list_student, parent, false));
            studentName = itemView.findViewById(R.id.student_name);
        }
        public void bind(int resTitle) {
            this.resTitle = resTitle;
            studentName.setText(resTitle);
        }
    }
    private class StudentAdapter extends RecyclerView.Adapter<StudentHolder> {
        private List<Integer> studentsList;
        public StudentAdapter(List<Integer> studentsList) {
            this.studentsList = studentsList;
        }
        @NonNull
        @Override
        public StudentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new StudentHolder(inflater, viewGroup);
        }
        @Override
        public void onBindViewHolder(@NonNull StudentHolder studentHolder, int i) {
            int resTitle = studentsList.get(i);
            studentHolder.bind(resTitle);
        }
        @Override
        public int getItemCount() {
            return studentsList.size();
        }
    }
}
