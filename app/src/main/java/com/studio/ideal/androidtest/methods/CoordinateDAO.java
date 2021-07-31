package com.studio.ideal.androidtest.methods;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CoordinateDAO {
    @Query("SELECT * FROM coordinatemodel")
    List<CoordinateModel> getAll();

    @Query("SELECT * FROM coordinatemodel WHERE uid IN (:coordIds)")
    List<CoordinateModel> loadAllByIds(int[] coordIds);

    @Query("SELECT * FROM coordinatemodel WHERE start_lat LIKE :lat AND " +
            "start_long LIKE :log LIMIT 1")
    CoordinateModel findByName(String lat, String log);

    @Insert
    void insertAll(CoordinateModel... models);

    @Delete
    void delete(CoordinateModel model);
}
