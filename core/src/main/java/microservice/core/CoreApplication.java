package microservice.core;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import microservice.core.entity.User;
import microservice.core.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan("microservice.core.mapper")
public class CoreApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CoreApplication.class, args);
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> users = userMapper.selectList(new QueryWrapper<User>().lambda().eq(User::getUserName, "xh"));
        users.stream().forEach(System.out::println);
    }

}
