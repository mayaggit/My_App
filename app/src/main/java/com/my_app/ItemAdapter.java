package com.my_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MViewHolder> {
    private List <Item> items;
    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemAdapter.MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mv =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);

        ItemAdapter.MViewHolder vh = new MViewHolder(mv);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.MViewHolder holder, int position) {
        Item i = items.get(position);
        holder.textGrocery.setText(i.getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MViewHolder extends RecyclerView.ViewHolder {
        public TextView textGrocery;

        public MViewHolder(@NonNull View view) {
            super(view);
            textGrocery = view.findViewById(R.id.text_grocery);
        }
    }
}
