package com.blog.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDto {
    private Long id;
    @NotEmpty(message = "Polje za ime ne može biti prazno!")
    private String name;
    @NotEmpty(message = "Polje za e-mail ne može biti prazno!")
    private String email;
    @NotEmpty(message = "Polje za poruku ne može biti prazno!")
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
