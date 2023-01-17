package com.bigdata.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bigdata.mybatis.bean.ShuqiUser;
import com.bigdata.mybatis.dto.ShuqiUserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ShuqiUserService extends IService<ShuqiUser> {
    List<ShuqiUserDTO> getUserSexCount();
}
