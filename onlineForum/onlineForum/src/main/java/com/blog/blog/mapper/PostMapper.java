package com.blog.blog.mapper;
import com.blog.blog.dto.PostDto;
import com.blog.blog.entity.Post;

import java.util.stream.Collectors;

public class PostMapper {
    public static PostDto mapToPostDto(Post post)
    {
        return PostDto.builder().
                id(post.getId()).
                title(post.getTitle()).
                url(post.getUrl()).
                content(post.getContent()).
                shortDescription(post.getShortDescription()).
                createdOn(post.getCreatedOn()).
                updatedOn(post.getUpdatedOn()).
                comments(post.getComments().stream().
                        map((comment)->CommentMapper.mapToDto(comment)).
                        collect(Collectors.toSet()))
                .build();
    }

    public static Post mapToPost(PostDto postDto)
    {
        return Post.builder().
                id(postDto.getId()).
                title(postDto.getTitle()).
                url(postDto.getUrl()).
                content(postDto.getContent()).
                shortDescription(postDto.getShortDescription()).
                createdOn(postDto.getCreatedOn()).
                updatedOn(postDto.getUpdatedOn()).build();
    }
}
