package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;
import com.koreait.day2.model.entity.TbTbuser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends Day2ApplicationTests {

    @Autowired  // 아까 만든 repository를 가져다 쓸 수 있게 함
    private UserRepository UserRepository;

    @Test // 단위 테스트로 사용
    public void create() {
        TbTbuser user = TbTbuser.builder()
                .userid("admin")    // setter()
                .userpw("7777")
                .email("apple@apple.com")
                .regDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
        // builder를 이용해 메소드 체이닝 방식으로 setter를 사용해 줄 수 있음.
        TbTbuser newUser = UserRepository.save(user);
    }
}
