package com.example.microservico.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
    @NotBlank(message = "Owner Ref is required.")
    private String ownerRef;
    @NotBlank(message = "Email From is required.")
    @Email
    private String emailFrom;
    @NotBlank(message = "Email To is required.")
    @Email
    private String emailTo;
    @NotBlank(message = "Subject is required.")
    private String subject;
    @NotBlank(message = "Text is required.")
    private String text;
}
