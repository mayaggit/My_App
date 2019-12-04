package com.my_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


class GroceriesAdapter extends RecyclerView.Adapter<GroceriesAdapter.MyViewHolder> {

    private List<NameIdPair> groceries;

    public GroceriesAdapter(List<NameIdPair> groceries) {
        this.groceries = groceries;
    }

    @NonNull
    @Override
    public GroceriesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.groceries_row, parent, false);

        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceriesAdapter.MyViewHolder holder, int position) {
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
