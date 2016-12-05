package com.elijahdesign.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Elijah on 7/14/2016.
 */
public class RecycleViewManger extends RecyclerView.Adapter<RecycleViewManger.MyViewHolder> {
    List<Square> squares;

    public RecycleViewManger(List<Square> squares) {
        this.squares = squares;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shapes, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Square mySquare = squares.get(position);
        // TODO: Set the data

        holder.thisTextView.setText(mySquare.getColor());
        holder.thisImageView.setImageDrawable(mySquare.getDrawable());

        holder.thisImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Clicked image", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return squares.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView thisImageView;
        TextView thisTextView;

        public MyViewHolder(View itemView) {
            super(itemView);

            thisImageView = (ImageView) itemView.findViewById(R.id.imageView1);
            thisTextView = (TextView) itemView.findViewById(R.id.textView1);

        }


    }

}
