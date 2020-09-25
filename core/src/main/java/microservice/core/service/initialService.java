package microservice.core.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class initialService implements InitializingBean {
    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = name;
    }
}
