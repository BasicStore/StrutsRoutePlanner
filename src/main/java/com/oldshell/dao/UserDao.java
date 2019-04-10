package com.oldshell.dao;
import java.util.List;

import com.oldshell.dm.User;

public interface UserDao {

	public List<User> getUsers();
    
	public void insertBatch();
	
}