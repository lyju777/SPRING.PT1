package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;
import com.koreait.day2.model.entity.AdminUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.time.LocalDateTime;

public class AdminUserRepositoryTest extends Day2ApplicationTests {

    @Autowired  // 아까 만든 repository를 가져다 쓸 수 있게 함
    private AdminUserRepository adminUserRepository;

    @Test // 단위 테스트로 사용
    public void create(){
        AdminUser adminUser = AdminUser.builder()
                .userid("admin")    // setter()
                .userpw("1234")
                .name("관리자")
                .status("use")
                .regDate(LocalDateTime.now())
                .build();
        // builder를 이용해 메소드 체이닝 방식으로 setter를 사용해 줄 수 있음.
        AdminUser newAdminUser = adminUserRepository.save(adminUser);
    }
}
