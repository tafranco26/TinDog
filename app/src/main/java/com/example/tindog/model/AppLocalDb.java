package com.example.tindog.model;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.tindog.MainActivity;
import com.example.tindog.MyApplication;

@Database(entities = {Dog.class}, version = 1)
abstract class AppLocalDbRepository extends RoomDatabase {
    public abstract DogDao dogDao();

}

public class AppLocalDb{

    static public AppLocalDbRepository db =
            Room.databaseBuilder(MyApplication.context,
                    AppLocalDbRepository.class,
                    "dbFileName.db")
                    .fallbackToDestructiveMigration()
                    .build();
}