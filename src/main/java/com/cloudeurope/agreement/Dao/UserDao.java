package com.cloudeurope.agreement.Dao;

import com.cloudeurope.agreement.Dao.IBaseDao;
import com.cloudeurope.agreement.Models.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserDao extends IBaseDao<User> {

    int countByUsername(String uname);
}
