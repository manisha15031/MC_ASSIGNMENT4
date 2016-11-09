package com.example.hp.todolist_mc;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 09-11-2016.
 */
public class CustomSwipeAdapter extends PagerAdapter {

    Context c;
    //private String[] details;
    //ArrayList<Player> players;
    ArrayList<String> det ;

    /*public CustomSwipeAdapter(Context c, ArrayList<String> det) {
        this.c = c;
        this.det = det;
        Log.v("kk" , det.toString()) ;
    }*/

    /*String array[] = new String[det.size()];

    for (int i = 0; i < names.size(); i++) {
        namesArr[i] = names.get(i);
    }

    array = det.toArray(array);*/

    //String[] mStringArray = new String[det.size()];
    //mStringArray = det.toArray(mStringArray);

//    Object[] detailsArray = det.toArray();

    //for(int i = 0; i < mStringArray.length ; i++){
        //Log.d("string is",(String)mStringArray[i]);

    private String[] details={"a","b","c","d", "e", "f", "g","h", "i", "j", "k", "l", "m", "n"};

    //private String[] details;
    //private List<String> details = new ArrayList<String>();
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context context, ArrayList<String> det)
    {
        this.context=context;
        this.det=det;

    }

    @Override
    public int getCount() {
        //return 0;
        return det.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        //return false;
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       //position=det.size();

        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View item_view= layoutInflater.inflate(R.layout.swipe_layout,container,false);
        //imageview
        TextView textView=(TextView)item_view.findViewById(R.id.textViewS);
        //String descp = getIntent().getExtras().getString("Description");
        //nameTxt = (TextView)findViewById(R.id.textViewDesc);
        //nameTxt.setText(descp);
       // textView.setText(player);
        //textView.setText("Hello!! "+details[position]);
 //       textView.setText("Hello!! "+ detailsArray[position]);
        Log.v("dd" , det.toString()) ;
        //int size=det.size();
        textView.setText("Hello!! "+ det.get(position));

        container.addView(item_view);
        return(item_view);


        //return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
        //super.destroyItem(container, position, object);
    }
}
