package com.naziat.erp.service;

import com.naziat.erp.exception.custom.NotFoundException;
import com.naziat.erp.mapper.MemberDetailMapper;
import com.naziat.erp.model.domain.MemberDetail;
import com.naziat.erp.model.dtorequest.CreateMemberDetailRequest;
import com.naziat.erp.persistence.repository.MemberDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class MemberDetailService {

    public static final String MEMBER_NOT_FOUND = "Member not found";
    private final MemberDetailRepository memberDetailRepository;
    private final MemberDetailMapper memberDetailMapper;

    public Page<MemberDetail> getMembersDetails(Pageable pageable){
        return memberDetailRepository.findAll(pageable).map(memberDetailMapper::toDomain);
    }

    public MemberDetail getMemberDetail(UUID id){
        var memberDetailEntity = memberDetailRepository.findById(id).orElseThrow(()->new NotFoundException(MEMBER_NOT_FOUND));
        return memberDetailMapper.toDomain(memberDetailEntity);
    }

    public void createMemberDetail(CreateMemberDetailRequest request){
        var memberDetailEntity = memberDetailMapper.toEntity(request);
        memberDetailRepository.save(memberDetailEntity);
    }

    public void updateMemberDetail(CreateMemberDetailRequest request){
        var memberDetailEntity = memberDetailRepository.findById(request.getId()).orElseThrow(()-> new NotFoundException(MEMBER_NOT_FOUND));
        memberDetailEntity.setFName(request.getFName());
        memberDetailEntity.setMName(request.getMName());
        memberDetailEntity.setLName(request.getLName());
        memberDetailEntity.setJoinDate(request.getJoinDate());
        memberDetailEntity.setPhNo(request.getPhNo());
        memberDetailEntity.setBloodGrp(request.getBloodGrp());
        memberDetailRepository.save(memberDetailEntity);
    }

    public void deleteMemberDetails(UUID id){
        memberDetailRepository.deleteById(id);
    }
}
