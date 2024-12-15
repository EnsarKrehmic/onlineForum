package com.blog.blog.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDto {
    private Long id;
    @NotEmpty(message = "Polje za naziv posta ne može biti prazno!")
    private String title;
    private String url;
    @NotEmpty(message = "Polje za sadržaj posta ne može biti prazno!")
    private String content;
    @NotEmpty(message = "Polje za kratki opis posta ne može biti prazno!")
    private String shortDescription;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private Set<CommentDto> comments;
}
