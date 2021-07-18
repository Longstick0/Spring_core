package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//어노테이션 생성 인터페이스(컴포넌트 스캔에 제외)
public @interface MyExcludeComponent {

}
