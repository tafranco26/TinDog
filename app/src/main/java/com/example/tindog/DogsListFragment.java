package com.example.tindog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tindog.model.Dog;
import com.example.tindog.model.Model;

import java.util.List;


public class DogsListFragment extends Fragment {
List<Dog> dogList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_dogs_list, container, false);
         Model.instance.getAllDogs(new Model.GetAllDogsListener() {
             @Override
             public void onComplete(List<Dog> data) {
                dogList = data;
                 for (Dog d:data) {
                     Log.d("TAG","dog id:"+d.getId());
                 }
             }
         });


        return view;
    }
}