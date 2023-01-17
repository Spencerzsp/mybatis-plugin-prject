package com.bigdata.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bigdata.mybatis.bean.ShuqiUser;
import com.bigdata.mybatis.dto.ShuqiUserDTO;

import java.util.List;

public interface ShuqiUserMapper extends BaseMapper<ShuqiUser> {

    List<ShuqiUserDTO> getUserSexCount();
}
