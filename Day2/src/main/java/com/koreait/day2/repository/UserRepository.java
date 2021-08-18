package com.koreait.day2.repository;


import com.koreait.day2.model.entity.TbTbuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TbTbuser, Long> {
}
