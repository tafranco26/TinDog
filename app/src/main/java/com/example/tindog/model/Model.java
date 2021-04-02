package com.example.tindog.model;

import android.os.AsyncTask;

import java.sql.ClientInfoStatus;
import java.util.List;

public class Model {
    public final static Model instance = new Model();
    private Model(){

    }
    public interface GetAllDogsListener{
        void onComplete(List<Dog> data);
    }
   public void getAllDogs(final GetAllDogsListener listener){
        class MyAsyncTask extends AsyncTask{
            List<Dog> data;
            @Override
            protected Object doInBackground(Object[] objects) {
                data = AppLocalDb.db.dogDao().getAllDogs();
                return null;
            }
            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);
                listener.onComplete(data);
            }
        }
       MyAsyncTask task = new MyAsyncTask();
        task.execute();
    }

    public interface AddAllDogsListener{
        void onComplete();
    }
        public void adddDog(final Dog dog, AddAllDogsListener listener){
        class MyAsyncTask extends AsyncTask {
            @Override
            protected Object doInBackground(Object[] objects) {
                AppLocalDb.db.dogDao().insertAllDogs(dog);
                return null;
            }
            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);
                if(listener!= null){
                    listener.onComplete();
                }
            }
        };
            MyAsyncTask task = new MyAsyncTask();
            task.execute();
    }
   }

