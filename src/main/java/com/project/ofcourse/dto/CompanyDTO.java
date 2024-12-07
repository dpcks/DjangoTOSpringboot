package com.project.ofcourse.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class CompanyDTO {
    private Long id; // 회사 ID
    private String name; // 회사 이름
    private String logo; // 회사 로고 URL
    private String stackInfo; // 스택 관련 요약 정보
    private String companyLink; // 회사 웹사이트 링크
    private String companyRecruitLink; // 채용 링크
    private String category; // 회사 카테고리
    private List<StackDTO> stackList; //스택 리스트
}