package com.Climate.PrimeClimateCare.Repository;

import com.Climate.PrimeClimateCare.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

    Optional<Member> findOneByEmailOrPhoneNumberAndPassword(String email, String phoneNumber,String encodedPassword);

    Member findByEmailOrPhoneNumber(String email, String phoneNumber);
}
