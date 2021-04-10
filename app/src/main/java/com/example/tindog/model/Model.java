package com.example.tindog.model;

import android.os.AsyncTask;

import java.sql.ClientInfoStatus;
import java.util.List;

public class Model {
    public final static Model instance = new Model();
    ModelFirebase modelFirebase = new ModelFirebase();
    ModelSql modelSql = new ModelSql();

    private Model(){

    }
    public interface GetAllDogsListener{
        void onComplete(List<Dog> data);
    }
    public void getAllDogs(final GetAllDogsListener listener){
        modelFirebase.getAllDogs(listener);
    }

    public interface AddAllDogsListener{
        void onComplete();
    }
    public void addDog(final Dog dog, AddAllDogsListener listener){
        modelFirebase.addDog(dog,listener );

    }
}