package br.com.delivery.ui.cardapio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import br.com.delivery.R;
import com.google.android.material.card.MaterialCardView;


public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.MyViewHolder> {

    private String[] mDataset;


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MaterialCardView materialCardView;

        public MyViewHolder(MaterialCardView v) {
            super(v);
            materialCardView = v;
        }
    }

    public CardapioAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MaterialCardView v = (MaterialCardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.materialCardView.setTooltipText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}

