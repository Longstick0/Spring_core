package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request")
public class MyLogger {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public void log(String message) {
        System.out.println("[" + uuid + "]" + "[" + requestURL + "]" + "[" + message + "]");
    }

    @PostConstruct
    public void init() {
        uuid = UUID.randomUUID().toString(); //유니크한 아이디 하나 생성됨(절대로 겹치지 않음)
        System.out.println("[" + uuid + "] request scope create:" + this);
    }

    @PreDestroy //빈 소멸
    public void close() {
        System.out.println("[" + uuid + "] request scope close:" + this);
    }
}
