package com.example.app12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;
    private Object ViewGroup;

    void Adapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.reccard, (android.view.ViewGroup) ViewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //Bind the text view with data received
        String title = data.get(position);
        ViewHolder.textTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        static TextView textTitle;
        TextView textDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textView3);
            textDescription = itemView.findViewById(R.id.textView4);

        }
    }
}
