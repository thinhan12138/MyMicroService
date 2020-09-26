package microservice.auth.controller;

import microservice.auth.security.JwtAuthenticatioToken;
import microservice.auth.security.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: x18266
 * @Description:
 * @Date: Created in 16:25 2020/9/26
 */
@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口
     */
    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestParam("username") String username, @RequestParam("password") String password,
                                     HttpServletRequest request) throws IOException {
        Map<String, Object> result = new HashMap<>();
        // 系统登录认证
        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);
        result.put("token", token);
        return result;
    }
}
