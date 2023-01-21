package edu.miu.waaassign2.service;

import edu.miu.waaassign2.entity.Post;

public interface PostService {

    public void save(Post post);
    public void delete(long id);
    public Post getById(long id);
    public Iterable<Post> findAllPost();
}
