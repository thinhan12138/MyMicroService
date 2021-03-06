package microservice.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import microservice.auth.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: x18266
 * @Description:
 * @Date: Created in 22:18 2020/9/20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
