package com.ideas2it.ism.service.impl;

//import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas2it.ism.entity.Role;
import com.ideas2it.ism.entity.User;
import com.ideas2it.ism.repository.UserRepository;
import com.ideas2it.ism.service.RoleService;
import com.ideas2it.ism.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleService roleService;
	
    /**
     * Get the Role object by user name
     *
     * @param userId - A key to check existance of user
     */
    public User getUserByName(String userName) {
		System.out.println("get user"+userName);
        User user = userRepository.findByName(userName);
        return user;
    }

	public void create(User user, String[] roleIds) {
        //user.setCreatedDate(new Date());
		System.out.println("user create");
        assignRole(roleIds, user);
        userRepository.save(user);
	}

	public User getUserById(int userId) {
		return (User) userRepository.findById(userId);
		//return user;
	}

	public void update(User user) {
		User existingUser = userRepository.findById(user.getId());
        existingUser.setName(user.getName());
        existingUser.setPassword(user.getPassword());
        userRepository.save(existingUser);
	}

	public void delete(int userId) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getUser() {
		return userRepository.findAll();
	}

    /**
     * Assign roles to particular user by roleId
     *
     * @param roleIds - A array of role id ehich is to be assigned to the user
     * @param user - Object to hold user details
     */
    public void assignRole(String[] roleIds, User user) {
        Set<Role> roles = new HashSet<Role>();
        for(String id : roleIds) {
            int roleId = Integer.parseInt(id);
            Role role = roleService.getRoleById(roleId);
            roles.add(role);
        }
        user.setRoles(roles);
    }

	public void assignassignRole(String[] roleIds, User user) {
		// TODO Auto-generated method stub
		
	}

	public void create(User user, String roleIds) {
		// TODO Auto-generated method stub
		
	}
}