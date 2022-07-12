package com.example.helppet.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserVO {
    Long userNum;
    String userId;
    String userName;
    String userPw;
    String userNickName;
    String userEmail;
    String userPhoneNum;
    String userAnimalType;
}
