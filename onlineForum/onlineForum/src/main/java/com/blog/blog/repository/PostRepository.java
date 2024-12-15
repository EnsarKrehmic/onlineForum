package com.blog.blog.repository;

import com.blog.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    Optional<Post> findByUrl(String url);
    @Query("SELECT p FROM Post p WHERE LOWER(p.title) LIKE CONCAT('%', LOWER(:query), '%') OR LOWER(p.shortDescription) LIKE CONCAT('%', LOWER(:query), '%')")
    List<Post> searchPosts(String query);
    @Query(value = "select * from posts p where p.created_by=:userId",nativeQuery = true)
    List<Post> findPostsByUser(Long userId);
}
