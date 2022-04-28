package com.example.loginform;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Search extends AppCompatActivity {

    ListView listView;
    String[] nameList={"Panadol","Disprin","Risek","Omega","Zopent","Ascard","Myteka","Gaviscon"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        listView=(ListView) findViewById(R.id.myListView);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,nameList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem menuItem=menu.findItem(R.id.action_search);
        SearchView searchView=(SearchView)  menuItem.getActionView();
        searchView.setQueryHint("Type Here To Search");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);

                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}