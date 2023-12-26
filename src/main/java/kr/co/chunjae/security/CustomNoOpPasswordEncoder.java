package kr.co.chunjae.security;

import lombok.extern.log4j.Log4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Log4j
public class CustomNoOpPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        log.warn("matches? rawPassword: " + rawPassword + " => encodedPassword: " + encodedPassword);
        return rawPassword.toString().equals(encodedPassword.toString());
    }
}
