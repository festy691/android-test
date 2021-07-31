package com.studio.ideal.androidtest.methods;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CoordinateModel {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "start_lat")
    public double start_lat;

    @ColumnInfo(name = "start_long")
    public double start_long;

    @ColumnInfo(name = "end_lat")
    public double end_lat;

    @ColumnInfo(name = "end_long")
    public double end_long;

    public CoordinateModel(double start_lat, double start_long, double end_lat, double end_long) {
        this.start_lat = start_lat;
        this.start_long = start_long;
        this.end_lat = end_lat;
        this.end_long = end_long;
    }
}
