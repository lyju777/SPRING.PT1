package com.koreait.day2.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // AdminUser JPA기능을 사용해서 DB 테이블과 연결
@SequenceGenerator(
        name="seq_tbuser", // 내 마음대로 이름 작성해도 됨
        sequenceName = "seq_tbuser", // 오라클의 sequenceName 과 동일하게 작성
        initialValue = 1,  // 초기 value값 설정
        allocationSize = 1 // size 설정
)
@Builder // 메소드 체이닝을 사용하게 만들어줌
public class TbTbuser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbuser") //  name="seq_user" 과 동일한 이름
    private Long id;
    private String userid;
    private String userpw;
    private String email;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;

}
