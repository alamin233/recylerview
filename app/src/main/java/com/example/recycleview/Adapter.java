package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
Context context;
String[] reslt,dicrip;
int[] image;

    public Adapter(Context context, String[] reslt,String[] dicrip, int[] image) {
        this.context=context;
        this.reslt=reslt;
        this.dicrip=dicrip;
        this.image=image;



    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        ViewGroup view = (ViewGroup) layoutinflater.inflate(R.layout.recyclerview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titl1.setText(reslt[position]);
        holder.descripton.setText(dicrip[position]);
        holder.image.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {

        return dicrip.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titl1,descripton;
        ImageView image;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titl1 = itemView.findViewById(R.id.txtv);
            descripton = itemView.findViewById(R.id.txtv1);
            image = itemView.findViewById(R.id.pic);
        }
    }
}
