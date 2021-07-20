package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member", //컴포넌트 스캔의 시작 지점을 설정함
        //basePackageClasses = AutoAppConfig.class,
        //지정하지 않는다면 @ComponentScan을 붙인 클래스의 패키지로부터 컴포넌트 스캔을 시작함
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //excludeFilters? : 컴포넌트스캔을 할 때 뺼 것을 정해주는 역할
)
public class AutoAppConfig {
// @Bean(name = "memoryMemberRepository")
// MemberRepository memberRepository() {
//  return new MemoryMemberRepository();
// }
}
