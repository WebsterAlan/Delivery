package br.com.delivery.ui.cardapio;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.com.delivery.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.MyViewHolder> {

    private String[] mDataset;
    List<Integer> images = new ArrayList<Integer>();


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MaterialCardView materialCardView;

        public MyViewHolder(MaterialCardView v) {
            super(v);
            materialCardView = v;
        }
    }

    public CardapioAdapter(String[] myDataset) {
        mDataset = myDataset;
        this.imageadd();
    }


    public void imageadd()
    {
        images.add(R.drawable.pizza);
        images.add(R.drawable.entrada);
        images.add(R.drawable.pratos);


    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MaterialCardView v = (MaterialCardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.itens_cardapio, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.materialCardView.setTooltipText(mDataset[position]);
        holder.materialCardView.setBackgroundResource(images.get(position));
        System.out.println(R.drawable.pizza);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}

