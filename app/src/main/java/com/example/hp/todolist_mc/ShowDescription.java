package com.example.hp.todolist_mc;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ShowDescription extends AppCompatActivity {
    TextView nameTxt;
    ViewPager viewPager;
    CustomSwipeAdapter csa;
    ArrayList<String> details=new ArrayList<>();

    //awesomePager = (ViewPager) findViewById(R.id.awesomepager);
    //awesomePager.setAdapter(awesomeAdapter);
    //awesomePager.setCurrentItem(CurrentPosition)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_description);
        viewPager=(ViewPager) findViewById(R.id.view_pager);
        details = getIntent().getStringArrayListExtra("details");
        csa=new CustomSwipeAdapter(this,details);
        viewPager.setAdapter(csa);

        int descp = getIntent().getIntExtra("Description",0);
        //int intValue = getIntent().getIntExtra("intVariableName", 0);
        viewPager.setCurrentItem(descp);
        //nameTxt = (TextView)findViewById(R.id.textViewDesc);
        //nameTxt.setText(descp);



    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.nav_back:
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"Thanks for adding item to ToDo list!!",Toast.LENGTH_SHORT).show();
               // startActivity(new Intent(getApplicationContext(),MainActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
        //  int id=item.getItemId();
        //if(id==R.id.action_settings){
        //  return true;
        //}

    }
}