package kr.co.chunjae.mapper;

import kr.co.chunjae.domain.MemberVO;

public interface MemberMapper {
    MemberVO read(String userid);
}
