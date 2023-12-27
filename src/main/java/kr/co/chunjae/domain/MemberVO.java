package kr.co.chunjae.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class MemberVO {
    private String userid;
    private String userpw;
    private String userName;
    private Boolean enabled;
    private LocalDate regDate;
    private LocalDate updateDate;
    private List<AuthVO> authList;
}
