package edu.miu.waaassign2.service.postServiceImp;

import edu.miu.waaassign2.entity.Post;
import edu.miu.waaassign2.entity.Users;
import edu.miu.waaassign2.repo.PostRepo;
import edu.miu.waaassign2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService {

    @Autowired
    private PostRepo postRepo;


    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public void delete(long id) {
   postRepo.deleteById(id);
    }

    @Override
    public Post getById(long id) {
        return postRepo.findById(id).get();
    }
}
