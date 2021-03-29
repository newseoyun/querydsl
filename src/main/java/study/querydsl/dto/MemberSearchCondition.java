package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    // 회원명, 팀명, 나이(age Greater Or Equal, Lower or Equal)
    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;

}
