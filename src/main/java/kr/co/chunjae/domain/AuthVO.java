package kr.co.chunjae.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuthVO {
    private String userid;
    private String auth;
}
