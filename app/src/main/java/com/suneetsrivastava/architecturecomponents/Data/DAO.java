package com.suneetsrivastava.architecturecomponents.Data;

import android.arch.persistence.room.Insert;

/**
 * Created by suneetsrivastava on 09/01/18.
 */

public interface DAO {

    @Insert
    void insert()
}
