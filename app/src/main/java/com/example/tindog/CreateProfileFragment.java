package com.example.tindog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.tindog.model.Dog;
import com.example.tindog.model.Model;

import java.util.LinkedList;
import java.util.List;


public class CreateProfileFragment extends Fragment {
    List<Dog> dogList = new LinkedList<Dog>();
    ProgressBar pb;
    Button addBtn;
    MyAdapter adapter;

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            if (dogList == null){
                return 0;
            }
            return dogList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override 
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null){
                view = getLayoutInflater().inflate(R.layout.fragment_dogs_list, null);
            }

            TextView tv = view.findViewById(R.id.dogsListFragment);
            Dog st = dogList.get(i);
            tv.setText(st.getId());
            return view;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dogs_list, container, false);

        ListView list = view.findViewById(R.id.dogsListFragment);
        pb = view.findViewById(R.id.dogsListFragment);
        addBtn = view.findViewById(R.id.Add_Dog);
        pb.setVisibility(View.INVISIBLE);
        adapter = new CreateProfileFragment.MyAdapter();
        list.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewDog();
            }
        });
        reloadData();
        return view;
    }

    private void addNewDog() {
        addBtn.setEnabled(false);
        int id = dogList.size();
        Dog st = new Dog();
        st.setId("" + id);
        st.setName("name " + id);
        pb.setVisibility(View.VISIBLE);
        /*Model.instance.addDog(st, new Model.AddAllDogsListener() {
            @Override
            public void onComplete() {
                reloadData();
            }
        });*/
    }

    void reloadData(){
        pb.setVisibility(View.VISIBLE);
        addBtn.setEnabled(false);
        /*Model.instance.getAllDogs(new Model.GetAllDogsListener() {
            @Override
            public void onComplete(List<Dog> data) {
                dogList = data;
                for (Dog st : data) {
                    Log.d("TAG","dog id: " + st.getId());
                }
                pb.setVisibility(View.INVISIBLE);
                addBtn.setEnabled(true);
                adapter.notifyDataSetChanged();
            }
        });*/
    }



}