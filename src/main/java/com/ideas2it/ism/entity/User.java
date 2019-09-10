package com.ideas2it.ism.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ideas2it.ism.entity.Role;

/**
 * Set the values to the corresponding variables for user which is given which includes
 * name, password and role.
 *
 * @author Arunkumar
 * @Date 04/09/19
 */
@Entity
@Table (name = "USER")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private int id;
	
    @Column (name = "NAME")
    private String name;

    @Column (name = "PASSWORD")
    private String password;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (name = "USER_ROLE", joinColumns = {@JoinColumn(name = "USER_ID")},
                inverseJoinColumns = {@JoinColumn(name = "ROLE_ID")})
    @Column (name = "USER_ROLE")
    private Set<Role> roles;
    
    public String toString() {
        return name + password + roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
