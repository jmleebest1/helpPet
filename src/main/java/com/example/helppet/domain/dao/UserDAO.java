package com.example.helppet.domain.dao;

import com.example.helppet.domain.vo.UserVO;
import com.example.helppet.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserDAO {
    private final UserMapper userMapper;

    //아이디 중복확인
    public int idCheck(String userId){return userMapper.idCheck(userId);}

    //회원 등록
    public int join (UserVO userVO){return userMapper.join(userVO);}
}
