package com.example.practica3b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class especialidadesAdapter extends RecyclerView.Adapter<especialidadesAdapter.viewHolder> {

    private ArrayList<String>yourList;
    private OnItemClickListener onItemClickListener;
    public especialidadesAdapter(ArrayList<String>yourList,OnItemClickListener listener){
        this.yourList=yourList;this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_consulta,parent,false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String especialidadN=yourList.get(position);
        holder.texto.setText(especialidadN);

        holder.value.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return yourList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        public TextView texto;
        public Button value;
        public viewHolder(View view){
            super(view);
            texto=view.findViewById(R.id.txv_texto);
            value=view.findViewById(R.id.btn_value);
        }
    }
}