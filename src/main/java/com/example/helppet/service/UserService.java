package com.example.helppet.service;

import com.example.helppet.domain.dao.UserDAO;
import com.example.helppet.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserDAO userDAO;

    //아이디 중복확인
    public int idCheck(String userId){return userDAO.idCheck(userId);}

    //회원 등록
    public int join(UserVO userVO){return userDAO.join(userVO);}
}
