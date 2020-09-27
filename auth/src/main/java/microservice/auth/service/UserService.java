package microservice.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import microservice.auth.entity.User;

import java.util.Set;

/**
 * @Author: x18266
 * @Description:
 * @Date: Created in 20:40 2020/9/27
 */
public interface UserService extends IService<User> {
    User findByUsername(String username);

    Set<String> findPermissions(String username);
}
