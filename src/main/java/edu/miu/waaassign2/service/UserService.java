package edu.miu.waaassign2.service;

import edu.miu.waaassign2.entity.Users;

public interface UserService {
    public void save(Users users);
    public void delete(long id);
    public Users getById(long id);
}
