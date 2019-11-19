package com.example.assurex.database;

import android.provider.ContactsContract;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.assurex.model.User;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void insertUser(User user);

    @Query("SELECT * FROM User ORDER BY Username desc")
    LiveData<List<User>> fetchAllUsers();

    @Query("SELECT * FROM User WHERE username =:un")
    LiveData<User> getUser(String un);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);
}