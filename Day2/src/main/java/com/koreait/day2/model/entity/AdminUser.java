package com.koreait.day2.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // AdminUser JPA기능을 사용해서 DB 테이블과 연결
@SequenceGenerator(
        name="seq_user", // 내 마음대로 이름 작성해도 됨
        sequenceName = "seq_user", // 오라클의 sequenceName 과 동일하게 작성
        initialValue = 1,  // 초기 value값 설정
        allocationSize = 1 // size 설정
)
@Builder // 메소드 체이닝을 사용하게 만들어줌
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user") //  name="seq_user" 과 동일한 이름
    private Long id;        // 일렬번호
    private String userid;  // 아이디
    private String userpw;  // 비밀번호
    private String name;    // 이름
    private String status;  // 상태
    private LocalDateTime lastLoginAt;   // 마지막 접속시간
    private LocalDateTime regDate;       // 가입 날짜
}
