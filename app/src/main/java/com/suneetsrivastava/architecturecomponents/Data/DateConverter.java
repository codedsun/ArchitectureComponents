package com.suneetsrivastava.architecturecomponents.Data;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by suneetsrivastava on 09/01/18.
 */

public class DateConverter {

    @TypeConverter
    public static Date toDate(Long date){
        return date == null ? null : new Date(date);
    }

    @TypeConverter
    public static long toTimeStamp(Date date){
        return date == null ? null : date.getTime();
    }

}
