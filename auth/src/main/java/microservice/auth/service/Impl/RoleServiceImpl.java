package microservice.auth.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import microservice.auth.entity.Role;
import microservice.auth.mapper.RoleMapper;
import microservice.auth.service.RoleService;
import org.springframework.stereotype.Service;


/**
 * @Author: x18266
 * @Description:
 * @Date: Created in 20:42 2020/9/27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
