package com.naziat.erp.controller.memberdetails;

import com.naziat.erp.service.MemberDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member-detail")
@RequiredArgsConstructor
public class MemberDetailController {
    private final MemberDetailService memberDetailService;


}
