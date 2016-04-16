package com.example.mitu.glide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mitu on 4/9/16.
 */
public class FirstFragment extends Fragment {
    private RecyclerView mRecyclerViewAnimation;
    private Adapter_Glide mAdapterAnimation;
    private RecyclerView.LayoutManager mLayoutManagerAnimation;

    public static ArrayList<AnimationModel> dataSetanimation;
   // public static ArrayList<AnimationModel> animationmodelArray = new ArrayList<>();

    // Store instance variables
    private String[] gif_link = {"http://gifgifs.com/animations/creatures-cartoons/super-heroes/Batman_symbol_2.gif",
            "http://gifgifs.com/animations/creatures-cartoons/cartoon-characters/disney-flynn-flirt.gif",
            "http://gifgifs.com/animations/creatures-cartoons/cartoon-characters/Elmo_shakes_it.gif",
            "http://gifgifs.com/animations/creatures-cartoons/cartoon-characters/tom-and-jerry.gif",
            "http://gifgifs.com/animations/creatures-cartoons/cartoon-characters/batman-says-no.gif",
            "http://gifgifs.com/animations/creatures-cartoons/cartoon-characters/looney-tunes.gif",
            "http://gifgifs.com/animations/creatures-cartoons/cartoon-characters/disney-aristocats.gif"
    };


    // newInstance constructor for creating fragment with arguments
    public static FirstFragment newInstance(int page, String title) {
        FirstFragment fragmentFirst = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       /* mLayoutManagerAnimation = new LinearLayoutManager(getActivity());
        mRecyclerViewAnimation = (RecyclerView) getActivity().findViewById(R.id.recycleSearch);
        mRecyclerViewAnimation.setHasFixedSize(true);
        mRecyclerViewAnimation.setLayoutManager(mLayoutManagerAnimation);
        mAdapterAnimation = new Adapter_Glide(getDataSet(), getContext());
        mRecyclerViewAnimation.setAdapter(mAdapterAnimation);*/



        mLayoutManagerAnimation = new LinearLayoutManager(getActivity());
        mRecyclerViewAnimation = (RecyclerView) getActivity().findViewById(R.id.recycleSearch);
        mRecyclerViewAnimation.setHasFixedSize(true);
        mRecyclerViewAnimation.setLayoutManager(mLayoutManagerAnimation);
        mAdapterAnimation = new Adapter_Glide(getDataSet(), getActivity());

        mRecyclerViewAnimation.setAdapter(mAdapterAnimation);



    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom1_layout, container, false);

        return view;
    }


    private ArrayList<AnimationModel> getDataSet() {
        dataSetanimation = new ArrayList<>();

        for (int i = 0; i <gif_link.length ; i++) {
            dataSetanimation.add(i,new AnimationModel(gif_link[i]));
            Log.d("First Fragment",gif_link[i]);

        }

        return  dataSetanimation;
    }
}
