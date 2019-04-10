package com.routeplanner.dao;
import java.util.List;

import com.routeplanner.dm.User;

public interface UserDao {

	public List<User> getUsers();
    
	public void insertBatch();
	
}