package com.my_app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<NameIdPair> groceries;

    public MyAdapter(List<NameIdPair> groceries) {
        this.groceries = groceries;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        NameIdPair pair = groceries.get(position);
        holder.textGrocery.setText(pair.getName());
    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textGrocery;

        public MyViewHolder(@NonNull View view) {
            super(view);
            textGrocery = view.findViewById(R.id.text_grocery);
        }
    }
}
