package com.example.practica3b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class medicosAdapter extends RecyclerView.Adapter<medicosAdapter.viewHolder> {

    Personal personal=MySingleton.getPersonal();
    private ArrayList<Medico> yourList;
    private medicosAdapter.OnItemClickListener onItemClickListener;
    String especialidad=personal.getEspecialidades().get(personal.getIndexEspecialidad());

    public medicosAdapter(ArrayList<Medico>yourList, medicosAdapter.OnItemClickListener listener){
        this.yourList=yourList;
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public medicosAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_consulta,parent,false);

        return new medicosAdapter.viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull medicosAdapter.viewHolder holder, int position) {
        String medicoNombre=yourList.get(position).getNombres()+" "+yourList.get(position).getApellidos();
        holder.texto.setText(medicoNombre);

        holder.value.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(yourList.get(position).getId()-1);
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