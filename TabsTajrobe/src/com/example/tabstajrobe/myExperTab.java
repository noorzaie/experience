package com.example.tabstajrobe;

import android.R.bool;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Transformation;

public class myExperTab extends Fragment  {
	private View mview;

 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.my_exper_view, container, false);        
        return V;
    }
}