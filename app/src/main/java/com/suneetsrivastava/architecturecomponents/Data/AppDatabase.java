package com.suneetsrivastava.architecturecomponents.Data;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by suneetsrivastava on 09/01/18.
 */
@Database(entities = {DatabaseModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public static AppDatabase getInstacnce(Context context){
        if(INSTANCE == null){
            Room.databaseBuilder(context, AppDatabase.class, "todo").build();
        }
        return INSTANCE;
    }

    public static void  destroyInstance(){
        INSTANCE = null;
    }

    public abstract DAO dao();
}
