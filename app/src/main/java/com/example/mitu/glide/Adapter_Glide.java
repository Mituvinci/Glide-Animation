package com.example.mitu.glide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitu on 4/12/16.
 */
public class Adapter_Glide  extends RecyclerView.Adapter<Adapter_Glide.DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<AnimationModel> mDataset;

    private Context mcontext;
    private int mdealId;


    public class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView crazyDealImage;

        public DataObjectHolder(View itemView) {
            super(itemView);

            crazyDealImage = (ImageView) itemView.findViewById(R.id.home_icon);


            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

        }
    }



    public Adapter_Glide(ArrayList<AnimationModel> myDataset, Context applicationContext) {
        mDataset = myDataset;
        mcontext = applicationContext;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_layout, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(final DataObjectHolder holder,final int position) {

        Glide.with(mcontext).load(mDataset.get(position).getImage_animation()).into(holder.crazyDealImage);
        // Picasso.with(mcontext).load("http://www.ajkerdeal.com/Images/Deals/" + data.getFolderName() + "/1.jpg").placeholder(R.drawable.placeholder).into(holder.crazyDealImage);
        //  Log.e("FolderName " , mDataset.get(position).getFolderName());

      /*  Glide.with( mcontext )
                .load( mDataset.get(position)getImage_animation()).placeholder(R.drawable.placeholder)
                .into( imageViewGif );*/

    }

    @Override
    public int getItemCount() {
        /*if(mDataset != null) {
            return mDataset.size();
        } else {
            return 0;
        }*/
        return mDataset.size();
    }
}
