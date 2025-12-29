package com.basic1.service;

import com.basic1.dto.*;
import com.basic1.entity.Member;
import com.basic1.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberCreateResponse save(MemberCreateRequest request) {
        Member member = new Member(request.getName());
        Member savedMember = memberRepository.save(member);
        return new MemberCreateResponse(
                savedMember.getId(),
                savedMember.getName(),
                savedMember.getCreatedAt(),
                savedMember.getModifiedAt()
        );
    }

    @Transactional(readOnly = true)
    public List<MemberGetResponse> findAll() {
        List<Member> members = memberRepository.findAll();
        List<MemberGetResponse> dtos = new ArrayList<>();
        for (Member member : members) {
            MemberGetResponse response = new MemberGetResponse(
                    member.getId(),
                    member.getName(),
                    member.getCreatedAt(),
                    member.getModifiedAt()
            );
            dtos.add(response);
        }
        return dtos;
    }

    @Transactional(readOnly = true)
    public MemberGetResponse findOne(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new IllegalStateException("없는 멤버입니다.")
        );
        return new MemberGetResponse(
                member.getId(),
                member.getName(),
                member.getCreatedAt(),
                member.getModifiedAt()
        );
    }

    @Transactional
    public MemberUpdateResponse update(Long memberId, MemberUpdateRequest request) {
        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new IllegalStateException("없는 멤버입니다.")
        );
        member.update(request.getName());
        return new MemberUpdateResponse(
                member.getId(),
                member.getName(),
                member.getCreatedAt(),
                member.getModifiedAt()
        );
    }

    @Transactional
    public void delete(Long memberId) {
        boolean existence = memberRepository.existsById(memberId);
        // 존재하지 않으면
        if (!existence) {
            throw new IllegalStateException("없는 멤버임. 찾지 말아주셈!");
        }
        // 존재하면
        memberRepository.deleteById(memberId);
    }
}
