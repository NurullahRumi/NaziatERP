package com.naziat.erp.model.dtorequest;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateMemberDetailRequest {
    private String memberId;
    private String userId;
    private String fName;
    private String mName;
    private String lName;
    private Date joinDate;
    private String phNo;
    private String bloodGrp;

}
