package com.TeamBee.WellbeingTracker.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.TeamBee.WellbeingTracker.R;
import com.TeamBee.WellbeingTracker.util.items;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    //array list for icons and icon names
    private ArrayList<items> itemList;

    public RecyclerAdapter(ArrayList<items> itemList){
        this.itemList = itemList;
    }

    //internal class that establishes the icon and icon name Recycler Ids
    public class MyViewHolder extends  RecyclerView.ViewHolder{
        private ImageView icon1;
        private TextView icon_name;

        public MyViewHolder(final View view){
            super(view);
            icon1 = view.findViewById(R.id.image);
            icon_name = view.findViewById(R.id.image_name);

        }
    }



    @NonNull
    @Override
    //method to inflate the layout in the recycler view
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tracker_view_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //calls the getters and setters in trackerActivity
        int icon1 = itemList.get(position).getImage();
        String icon_name = itemList.get(position).getImage_name();
        holder.icon_name.setText(icon_name);
        holder.icon1.setImageResource(icon1);
    }



    @Override
    //returns the number of items in item list array
    public int getItemCount() {
        return itemList.size();
    }

}
