package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach // 테스트를 실행하기 전 무조건 실행되는 것(?)
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        // 2L로 되었기 때문에 아래 코드는 실행이 안 됨.
        // Member findMember = memberService.findMember(2L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
