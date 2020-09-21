package microservice.core.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Authore: x18266
 * @Description:
 * @Date: Created in 22:06 2020/9/20
 */
@TableName("base_user")
@Data
@Component
public class User implements InitializingBean {

    @TableId("user_id")
    private Integer userId = 1;

    @TableField("user_name")
    private String userName;

    @TableField("user_phone")
    private String userPhone;

    @TableField("role_id")
    private Integer roleId;

    /**
     * 实现InitializingBean接口的bean，spring容器在实例化该bean之后，将会调用bean的afterPropertiesSet方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        this.userId = 1;
        this.userName = "xh";
        this.userPhone = "123456";
        this.roleId = 1;
    }
}
