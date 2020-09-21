package microservice.core;

import microservice.core.entity.User;
import microservice.core.mapper.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CoreApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CoreApplication.class, args);
        User user = (User) applicationContext.getBean("user");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        System.out.println(user);
        userMapper.insert(user);
    }

}
