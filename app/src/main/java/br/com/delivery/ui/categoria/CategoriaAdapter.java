package br.com.delivery.ui.categoria;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import br.com.delivery.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.MyViewHolder> {

    private String[] mDataset;
    List<Integer> images = new ArrayList<Integer>();


    @Override
    public CategoriaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MaterialCardView v = (MaterialCardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.itens_categoria, parent, false);
        CategoriaAdapter.MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder( CategoriaAdapter.MyViewHolder holder, int position) {
        holder.materialCardView.setTooltipText(mDataset[position]);
        holder.imageView.setBackgroundResource(images.get(position));
    }

    public void imageadd()
    {
        images.add(R.drawable.pizza);
        images.add(R.drawable.entrada);
        images.add(R.drawable.pratos);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MaterialCardView materialCardView;
        public AppCompatImageView imageView;

        public MyViewHolder(MaterialCardView itemView) {
            super(itemView);
            materialCardView = itemView;
            imageView = itemView.findViewById(R.id.imagem_categoria);

        }
    }
}
