package edu.miu.waaassign2.service;

import edu.miu.waaassign2.entity.Users;

import java.util.List;

public interface UserService {
    public void save(Users users);
    public void delete(long id);
    public Users getById(long id);
    public List<Users> findAllUser();
   // public List<Users> findAllByPostsGreaterThan(Integer n);
   public List<Users> findAllByPostsGreaterThan();
}
