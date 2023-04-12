package com.naziat.erp.model.dtorequest;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class CreateMemberDetailRequest {
    private UUID id;
    private String memberId;
    private String userId;
    private String fName;
    private String mName;
    private String lName;
    private Date joinDate;
    private String phNo;
    private String bloodGrp;

}
