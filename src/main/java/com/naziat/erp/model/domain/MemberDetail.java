package com.naziat.erp.model.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MemberDetail {
    private String memberId;
    private String userId;
    private String fName;
    private String mName;
    private String lName;
    private Date joinDate;
    private String phNo;
    private String bloodGrp;
}
