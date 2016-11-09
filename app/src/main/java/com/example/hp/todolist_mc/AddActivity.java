package com.example.hp.todolist_mc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editTextTitle, editTextDetails;
    TextView textView;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        textView = (TextView)findViewById(R.id.textView);

        editTextTitle = (EditText) findViewById(R.id.editTextTitle);
        editTextDetails = (EditText) findViewById(R.id.editTextDetails);


        Button add = (Button)findViewById(R.id.buttonAdd);

        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonAdd) {
            String title= editTextTitle.getText().toString();
            String details= editTextDetails.getText().toString();

            if(title==null){//||roll==null||domain==null)
                Toast.makeText(AddActivity.this,"Please enter the details correctly",Toast.LENGTH_LONG).show();}

            else{
              /*  sharedpreferences = getSharedPreferences("prefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("myname",name);
                editor.putString("myroll",roll);
                editor.putString("mydomain",domain);

                editor.commit();

                Toast.makeText(MainActivity.this,"Thanks, your details have been saved using shared preferences!!",Toast.LENGTH_LONG).show();
                editTextName.setText("");
                editTextRoll.setText("");
                editTextDomain.setText("");*/
                startActivity(new Intent(getApplicationContext(),ToDoList.class));
                }

            Intent myIntent = new Intent(view.getContext(),ToDoList.class);
           myIntent.putExtra("Title",title);
            // myIntent.putExtra("intVariableName", title);
            //myIntent.putExtra("mytext",flag2);
            startActivity(myIntent);

        }







    }
}
