package com.example.email.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {
    @Email
    @NotNull
    private String To;
    @NotNull
    private String Subject;
    @NotNull
    private String product;
    @NotNull
    private String price;
    @NotNull
    private String creation;
}
