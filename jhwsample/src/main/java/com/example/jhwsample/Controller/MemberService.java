package com.example.jhwsample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Member Service", description = "회원 서비스 API")
@RestController
public class MemberService {

    @GetMapping("/members")
    @Operation(summary = "회원조회", description = "모든 회원 정보를 조회합니다.")
    public void get() {
        // 조회 로직
    }

    @PostMapping("/members")
    @Operation(summary = "회원등록", description = "새로운 회원을 등록합니다.")
    public void register() {
        // 등록 로직
    }

    @DeleteMapping("/members")
    @Operation(summary = "회원삭제", description = "회원 정보를 삭제합니다.")
    public void delete() {
        // 삭제 로직
    }
}
