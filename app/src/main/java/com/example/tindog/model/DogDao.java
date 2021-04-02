package com.example.tindog.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

@Dao
public interface DogDao {
    @Query("select * from Dog")
    List<Dog> getAllDogs();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllDogs(Dog... dogs);

    @Delete
    void deleteDog(Dog dog);
}
