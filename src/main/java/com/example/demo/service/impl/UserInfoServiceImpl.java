package com.example.demo.service.impl;

import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.entity.UserInfoDO;
/**
 *
 * @author changyuan.guo@hand-china.com
 * @Title UserInfoServiceImpl
 * @Description TODO
 * @date 2019/03/12
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfoDO> implements UserInfoService {

}
