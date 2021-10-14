package com.example.testing.service;

import com.example.testing.dao.RoleDao;
import com.example.testing.dao.UserDao;
import com.example.testing.model.entity.Role;

import com.example.testing.model.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private  final UserDao userDao;
    private final RoleDao roleDao;

    public UserServiceImpl(UserDao userDao, RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
    }
    public boolean registerNewUser(User user){
        if(userDao.findByUsername(user).isPresent()){
            return false;
        }
        Set<Role> role = new HashSet<Role>();
        role.add(roleDao.getById(2L));
        user.setRoles(role);
        userDao.save(user);
        return true;

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

}
