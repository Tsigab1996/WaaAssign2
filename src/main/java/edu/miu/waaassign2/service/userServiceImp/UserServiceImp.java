package edu.miu.waaassign2.service.userServiceImp;

import edu.miu.waaassign2.entity.Users;
import edu.miu.waaassign2.repo.UserRepo;
import edu.miu.waaassign2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
   @Autowired
   private UserRepo userRepo;

    @Override
    public void save(Users users) {
        userRepo.save(users);
    }

    @Override
    public void delete(long id) {
      userRepo.deleteById(id);
    }

    @Override
    public Users getById(long id) {
        return userRepo.findById(id).get();
    }
}
