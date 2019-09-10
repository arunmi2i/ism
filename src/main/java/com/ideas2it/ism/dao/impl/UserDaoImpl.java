package com.ideas2it.ism.dao.impl;


import com.ideas2it.ism.dao.*;
import com.ideas2it.ism.entity.User;
import com.ideas2it.ism.exception.IsmException;

public class UserDaoImpl implements UserDao {

    /**
     * Get the user details by using their id
     *
     * @param userId - Unique key to represent individual user
     * @retun user - Holds the user informations
     * @HibernateException - Occurs due to unavailability of session
     */
    public User getUserByName(String userName) throws IsmException {
		return null;
	}
}