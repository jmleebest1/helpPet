package com.example.helppet.controller;

import com.example.helppet.domain.vo.UserVO;
import com.example.helppet.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    
    @GetMapping("userJoin")
    public void userJoin(){}

    @GetMapping("userLogin")
    public void userLogin(){}

    @GetMapping("userMyPage")
    public void userMyPage(){}
    
    //아이디 중복확인 및 회원 등록
    @PostMapping("userJoin")
    public String join(UserVO userVO){
//        int count = 0;
//        count = userService.idCheck(userVO.getUserId());
//        if(count >= 1){
//            return 300;
//        } else
//            return
            userService.join(userVO);
            return "user/userLogin";
//        log.info(String.valueOf(userService.join(userVO)));
    }

//    @PostMapping("userJoin")
//    public int join(UserVO userVO){
//        userService.join(userVO);
//
//
//    }
}
