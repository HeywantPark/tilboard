package com.example.tilboard;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepoTest {
    @Autowired
    MemberRepo memberRepo;

    @Test
    @Transactional
//    @Rollback(value = false)
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUserName("memberA");

        //when
        Long saveId = memberRepo.save(member);
        Member member1 = memberRepo.find(saveId);

        //then
        Assertions.assertThat(member1.getId()).isEqualTo(member.getId());
        Assertions.assertThat(member1.getUserName()).isEqualTo(member.getUserName());
    }

}