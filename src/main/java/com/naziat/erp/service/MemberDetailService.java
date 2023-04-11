package com.naziat.erp.service;

import com.naziat.erp.mapper.MemberDetailMapper;
import com.naziat.erp.persistence.repository.MemberDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberDetailService {

    public static final String MEMBER_NOT_FOUND = "Member not found";
    private final MemberDetailRepository memberDetailRepository;
    private final MemberDetailMapper memberDetailMapper;
}
