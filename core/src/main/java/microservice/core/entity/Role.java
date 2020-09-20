package microservice.core.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Authore: x18266
 * @Description:
 * @Date: Created in 22:06 2020/9/20
 */
@TableName("base_role")
@Data
public class Role {
    @TableId("role_id")
    private Integer roleId;

    @TableField("role_name")
    private String roleName;
}
