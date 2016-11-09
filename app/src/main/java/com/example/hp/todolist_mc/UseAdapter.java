package com.example.hp.todolist_mc;

/**
 * Created by HP on 07-11-2016.
 */
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import static android.support.v4.app.ActivityCompat.startActivity;

public class UseAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    private String[] details;
    ArrayList<Player> players;
    ArrayList<String> det;


    public UseAdapter(Context c, ArrayList<Player> players, ArrayList<String> det) {
        this.c = c;
        this.players = players;
        this.det=det;
    }
    //INITIALIZE VIEWHODER
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //VIEW OBJ
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        //HOLDER
        MyHolder holder=new MyHolder(v);
        return holder;
    }
    //BIND VIEW TO DATA
    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.img.setImageResource(R.drawable.images_arr_raw);

        final ImageView imageView=holder.img;

       //final ImageView imageView = (ImageView) holder.img.setImageResource(R.drawable.ic_raw_heart);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.arr_blue);
                Snackbar.make(view,players.get(position).getName()+" "+players.get(position).getPosition(),Snackbar.LENGTH_SHORT).show();
            }
        });


        holder.nametxt.setText(players.get(position).getName());
        holder.posTxt.setText(players.get(position).getPosition());
        //CLICKED
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Snackbar.make(v,players.get(pos).getName(),Snackbar.LENGTH_SHORT).show();

                //Intent intent = new Intent(this, ShowDescription.class);
                //intent.putStringArrayListExtra("details", details);
                //startActivity(intent);

               Intent myIntent = new Intent(v.getContext(),ShowDescription.class);
               // Intent myIntent = new Intent(v.getContext(),CustomSwipeAdapter.class);
                myIntent.putStringArrayListExtra("details", det);
                myIntent.putExtra("Description",pos);
                v.getContext().startActivity(myIntent);




                //startActivity(new Intent(getContext(),ToDoList.class));
            }

        });
    }
    @Override
    public int getItemCount() {
        return players.size();
    }
}
