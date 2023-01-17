package com.bigdata.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bigdata.mybatis.bean.ShuqiUser;
import com.bigdata.mybatis.dto.ShuqiUserDTO;
import com.bigdata.mybatis.mapper.ShuqiUserMapper;
import com.bigdata.mybatis.service.ShuqiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShuqiUserServiceImpl extends ServiceImpl<ShuqiUserMapper, ShuqiUser> implements ShuqiUserService {

    @Autowired ShuqiUserMapper shuqiUserMapper;
    @Override
    public List<ShuqiUserDTO> getUserSexCount() {
        return shuqiUserMapper.getUserSexCount();
    }
}
