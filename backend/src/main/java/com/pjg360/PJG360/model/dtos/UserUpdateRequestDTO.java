package com.pjg360.PJG360.model.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateRequestDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
}