package edu.miu.waaassign2.repo;

import edu.miu.waaassign2.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<Users, Long> {


    @Query("SELECT e FROM Users e WHERE size(e.posts) >1")
    public List<Users> findAllByPostsGreaterThan();
}
