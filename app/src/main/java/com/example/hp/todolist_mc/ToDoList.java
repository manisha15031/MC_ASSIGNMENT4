package com.example.hp.todolist_mc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class ToDoList extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<Details> details = new ArrayList<Details>();

        String title = getIntent().getExtras().getString("Title");
        details.add(new Details(title, "This is description", R.drawable.ic_raw_heart));

        // details.add(new Details(getIntent().getExtras().getString("Title"), "This is description", R.drawable.ic_raw_heart));

        /*for (int i = 0; i < 20; i++) {
            details.add(new Details("Title" + i, "This is description", R.drawable.ic_raw_heart));
        }*/

        //mAdapter = new MyAdapter(details);
        mRecyclerView.setAdapter(mAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info_id:
                Toast.makeText(getApplicationContext(), "Add details here!!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), AddActivity.class));
           /* case R.id.back_id:
                //Toast.makeText(getApplicationContext(),"Thanks for adding item to ToDo list!!",Toast.LENGTH_SHORT).show();
            case R.id.add:
                //Toast.makeText(getApplicationContext(),"Add details here!!",Toast.LENGTH_SHORT).show();
            case R.id.back:
                //Toast.makeText(getApplicationContext(),"Thanks for adding item to ToDo list!!",Toast.LENGTH_SHORT).show();*/
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
