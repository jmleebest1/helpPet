package com.example.helppet.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
@Slf4j
public class BoardController {

    @GetMapping("showMyPet")
    public void showMyPet(){}

    @GetMapping("showMyPetWrite")
    public void showMyPetWrite(){}
}
