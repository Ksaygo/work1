package cn.sn.service.impl;

import cn.sn.entity.User;
import cn.sn.mapper.UserMapper;
import cn.sn.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 十年
 * @since 2020-03-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
