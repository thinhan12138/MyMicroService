package microservice.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import microservice.core.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: x18266
 * @Description:
 * @Date: Created in 22:18 2020/9/20
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
}