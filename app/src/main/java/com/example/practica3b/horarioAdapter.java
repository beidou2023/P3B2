package com.example.practica3b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class horarioAdapter extends RecyclerView.Adapter<horarioAdapter.viewHolder> {

    private ArrayList<String>yourList;
    private horarioAdapter.onItemClickListener1 onItemClickListener1;
    Personal personal=MySingleton.getPersonal();

    public horarioAdapter(ArrayList<String>yourList, horarioAdapter.onItemClickListener1 listener){
        this.yourList=yourList;
        this.onItemClickListener1 = listener;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hora,parent,false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String horaS=yourList.get(position);
        
        holder.hora.setText(horaS);

        holder.hora.setOnClickListener(v -> {
            if (onItemClickListener1 != null) {
                onItemClickListener1.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return yourList.size();
    }

    public interface onItemClickListener1 {
        void onItemClick(int position);
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        public TextView hora;
        public viewHolder(View view){
            super(view);
            hora=view.findViewById(R.id.txv_time);
        }
    }
}
