package com.oldshell.serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oldshell.dao.UserDao;
 
@Service("userService")
public class UserService implements ServiceFacade {
	
    @Autowired
    private UserDao userDao;
     
    public Object doService(Object... args) throws Exception {
        Assert.notNull(args[0]);
        if(args[0].equals("insert")){
            userDao.insertBatch();
            return true;
        } else{
            return userDao.getUsers();
        }
    }
}