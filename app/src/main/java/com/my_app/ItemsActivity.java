package com.my_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.List;

public class ItemsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private View addItem;
    private ListDAO listItem;
    private Object item;
    private RecyclerView ecyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_items);

        addItem =  findViewById(R.id.add_item_button);

        listItem = new ListDAO();
        item = listItem.getItems();

        ecyclerView = (RecyclerView) findViewById(R.id.recycler_view_grocery);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

    // TODO addItem
}
