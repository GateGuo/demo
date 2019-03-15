package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.UserInfoDO;
import com.example.demo.entity.dto.ResponseDTO;
import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author changyuan.guo@hand-china.com
 * @Title UserController
 * @Description
 * @date 2019/03/12
 */
@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/queryUserInfo/{userId}")
    public ResponseDTO queryUserInfo(@PathVariable("userId") String userId) {
        QueryWrapper<UserInfoDO> userInfoDOQueryWrapper = new QueryWrapper<>();
        QueryWrapper<UserInfoDO> eq = userInfoDOQueryWrapper.eq(UserInfoDO.COL_USER_ID, userId);
        UserInfoDO userInfoDO = userInfoService.getOne(eq);
        List<Object> list = new ArrayList<>();
        list.add(userInfoDO);
        return new ResponseDTO(list);
    }
}
