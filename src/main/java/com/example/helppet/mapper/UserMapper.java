package com.example.helppet.mapper;

import com.example.helppet.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //아이디 중복확인
    public int idCheck(String userId);

    //회원 등록
    public int join(UserVO userVO);
}
