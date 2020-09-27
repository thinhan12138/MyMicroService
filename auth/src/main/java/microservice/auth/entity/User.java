package microservice.auth.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Authore: x18266
 * @Description:
 * @Date: Created in 22:06 2020/9/20
 */
@TableName("base_user")
@Data
public class User {

    @TableId("user_id")
    private Integer userId = 1;

    @TableField("user_name")
    private String userName;

    @TableField("user_phone")
    private String userPhone;

    @TableField("role_id")
    private Integer roleId;

    @TableField("password")
    private String password;
}
