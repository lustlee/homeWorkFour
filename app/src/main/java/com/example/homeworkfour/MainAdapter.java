package com.example.homeworkfour;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> list;

    public MainAdapter() {
        list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add("Рамазан");
            list.add("Мурас");
            list.add("Нуракбар");
            list.add("Илимбек");
            list.add("Нуркыз");
            list.add("Кайрат");
            list.add("Исак");
        }

    }


    public void addText(String person) {
        list.add(person);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

