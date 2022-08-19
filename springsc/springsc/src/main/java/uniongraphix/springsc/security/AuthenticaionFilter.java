package uniongraphix.springsc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticaionFilter extends UsernamePasswordAuthenticationFilter {
    //Todo 유저서비스가 필요합니다.

    private Environment env;
    @Autowired
    public AuthenticaionFilter(AuthenticationManager authenticationManager){

        super.setAuthenticationManager(authenticationManager);
        setFilterProcessesUrl("*/user/login");

    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        return null;
        //todo 인증정보조회
        // 유저아이디를 통해서 유저가 있는지 없는지?
        // 유저 패스워드가 리퀘스트 패스워드와 일치하는지?
        //todo 예외처리(유저가 없는 경우)
        //todo 토큰발행
    }

    public void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException {
        //todo
    }
}
