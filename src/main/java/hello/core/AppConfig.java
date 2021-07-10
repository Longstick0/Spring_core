package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

/*애플리케이션의 전체 동작 방식을 구성(config)하기 위해,
구현 객체를 생성하고, 연결하는 책임을 가지는
별도의 설정 클래스를 만듦, 어플리케이션 전체 구성이 한 눈에 들어오고 역할이 무엇인지 확인할 수 있음
※가장 중요한 클래스라 할 수 있음*/
public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy(); // 만약 이 부분을 FixDiscountPolicy로 바꾸면 다른 부분을 손대지 않아도 할인 정책을 바꿀 수 있음
    }
}

