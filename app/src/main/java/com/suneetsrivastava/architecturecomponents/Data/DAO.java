package com.suneetsrivastava.architecturecomponents.Data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import java.util.List;

/**
 * Created by suneetsrivastava on 09/01/18.
 */

@Dao
@TypeConverters({DateConverter.class})
public interface DAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DatabaseModel databaseModels);

    @Query("Select *from todoitem")
    LiveData<List<DatabaseModel>> getAllTask();

    @Query("Select * from todoitem where id = :id")
    LiveData<DatabaseModel> getTaskById(int id);

    @Query("Select * from todoitem where tag = :tag")
    LiveData<List<DatabaseModel>> getTaskByTag(String tag);

    @Query("Select * from todoitem where priority = :priority")
    LiveData<List<DatabaseModel>> getTaskByPriority(String priority);

    @Query("Select * from todoitem where isTaskDone = :isDone")
    LiveData<List<DatabaseModel>> getTaskByStatus(Boolean isDone);

    @Query("Delete from todoitem where id = :id")
    void deleteById(int id);

    @Delete
    void delete(DatabaseModel databaseModel);


}
