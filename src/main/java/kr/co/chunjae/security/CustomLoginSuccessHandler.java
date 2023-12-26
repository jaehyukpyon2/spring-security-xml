package kr.co.chunjae.security;

import lombok.extern.log4j.Log4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log4j
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        log.warn("Login Success");
        List<String> roleNames = new ArrayList<>();
        authentication.getAuthorities()
                .forEach(authority -> {
                    roleNames.add(authority.getAuthority());
                    System.out.println("Role: " + authority.getAuthority());
                    // ROLE_ADMIN, ROLE_MEMBER 이런식으로 출력...
                });
        if (roleNames.contains("ROLE_ADMIN")) {
            response.sendRedirect("/sample/admin");
            return;
        }
        if (roleNames.contains("ROLE_MEMBER")) {
            response.sendRedirect("/sample/member");
            return;
        }
        response.sendRedirect("/");
    }
}
