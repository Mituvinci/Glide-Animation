package com.example.mitu.glide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mitu on 4/9/16.
 */
public class SecondFragment extends Fragment {

    private RecyclerView mRecyclerViewAnimation;
    private Adapter_Glide mAdapterAnimation;
    private RecyclerView.LayoutManager mLayoutManagerAnimation;

    public static ArrayList<AnimationModel> dataSetanimation;
   // public static ArrayList<AnimationModel> animationmodelArray = new ArrayList<>();
    // Store instance variables
    private String[] gif_link = {"http://gifgifs.com/animations/nature/flowers/Bouque_of_pink_rosses.gif",
                                "http://gifgifs.com/animations/nature/waterfalls/Waterfall_4.gif" ,
                                "http://gifgifs.com/animations/nature/flowers/Blue_flower.gif",
                                "http://gifgifs.com/animations/nature/weather/Sun_reflection.gif",
                                "http://gifgifs.com/animations/nature/weather/Rain_in_grey_cloud.gif",
                                "http://gifgifs.com/animations/nature/weather/Very_windy.gif",
                                "http://gifgifs.com/animations/nature/stars/Yellow_stars_2.gif"};


    // newInstance constructor for creating fragment with arguments
    public static SecondFragment newInstance(int page, String title) {
        SecondFragment fragmentSecond = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentSecond.setArguments(args);
        return fragmentSecond;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLayoutManagerAnimation = new LinearLayoutManager(getActivity());
        mRecyclerViewAnimation = (RecyclerView) getActivity().findViewById(R.id.recycleSearch2);
        mRecyclerViewAnimation.setHasFixedSize(true);
        mRecyclerViewAnimation.setLayoutManager(mLayoutManagerAnimation);
        mAdapterAnimation = new Adapter_Glide(getDataSet(), getActivity());

        mRecyclerViewAnimation.setAdapter(mAdapterAnimation);



    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom_layout, container, false);

        return view;
    }

    private ArrayList<AnimationModel> getDataSet() {
        dataSetanimation = new ArrayList<>();

        for (int i = 0; i <gif_link.length ; i++) {
            dataSetanimation.add(i,new AnimationModel(gif_link[i]));
            Log.d("Second Fragment",gif_link[i]);

        }

        return  dataSetanimation;
    }
}
