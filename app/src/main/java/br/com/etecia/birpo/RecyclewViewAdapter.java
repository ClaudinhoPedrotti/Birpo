package br.com.etecia.birpo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.etecia.birpo.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>{

    private Context mContext;
    private List<Produtos> mData;

    public RecyclerViewAdapter (Context mContext, List<Produtos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override

    public MyHolder onCreateViewMyHolder( ViewGroup parent, int viewType){
        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_produtos, parent, false);
        return new MyHolder(view);
    }

}
