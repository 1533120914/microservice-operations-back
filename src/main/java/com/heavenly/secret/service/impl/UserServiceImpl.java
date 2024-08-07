package com.heavenly.secret.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heavenly.secret.entity.User;
import com.heavenly.secret.service.UserService;
import com.heavenly.secret.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 15331
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-08-07 09:32:01
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




