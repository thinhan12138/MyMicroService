package microservice.auth.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import microservice.auth.entity.User;
import microservice.auth.mapper.UserMapper;
import microservice.auth.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: x18266
 * @Description:
 * @Date: Created in 20:41 2020/9/27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User findByUsername(String username) {
        final User user = this.baseMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUserName, username));
        return user;
    }

    @Override
    public Set<String> findPermissions(String username) {
        Set<String> perms = new HashSet<>();
        perms.add("test");
        return perms;
    }
}
