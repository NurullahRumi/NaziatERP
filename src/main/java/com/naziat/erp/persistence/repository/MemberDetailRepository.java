package com.naziat.erp.persistence.repository;

import com.naziat.erp.persistence.entity.MemberDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberDetailRepository extends JpaRepository<MemberDetailEntity, UUID> {
}
