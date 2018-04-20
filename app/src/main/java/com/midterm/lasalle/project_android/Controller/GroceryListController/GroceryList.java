package com.midterm.lasalle.project_android.Controller.GroceryListController;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.midterm.lasalle.project_android.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GroceryList extends AppCompatActivity{

    ArrayList<String> shoppingList = null;
    ArrayAdapter<String> adapter = null;
    ListView listView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_list);
        Initialize();
    }

    private void Initialize() {

        shoppingList = new ArrayList<>();
        //Different ways to adding to the array list
        //Method 1
        Collections.addAll(shoppingList, "Eggs", "Yogurt", "Milk", "Bananas", "Apples");
        //Method 2
        shoppingList.addAll(Arrays.asList("Cake", "Cereal", "Bread"));
        //Method 3
        shoppingList.add("Chicken");
        shoppingList.add("Beef");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, shoppingList);
        listView = findViewById(R.id.groceryListView);
        listView.setAdapter(adapter);
    }

    public void openAddGrocery(View view){

        Intent intent = new Intent(this, AddGrocery.class);
        startActivity(intent);

    }
}
