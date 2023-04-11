package com.naziat.erp.mapper;


import com.naziat.erp.model.domain.MemberDetail;
import com.naziat.erp.model.dtorequest.CreateMemberDetailRequest;
import com.naziat.erp.persistence.entity.MemberDetailEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberDetailMapper {
    MemberDetail toDomain(MemberDetailEntity memberDetailEntity);
    MemberDetailEntity toEntity(CreateMemberDetailRequest createMemberDetailRequest);
}
