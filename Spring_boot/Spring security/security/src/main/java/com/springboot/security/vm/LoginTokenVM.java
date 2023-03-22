package com.springboot.security.vm;

import com.springboot.security.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginTokenVM {

    private User user;

    private String accessToken;

    private String refreshToken;

}
