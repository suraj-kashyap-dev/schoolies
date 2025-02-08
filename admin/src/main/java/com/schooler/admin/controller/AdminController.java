package com.schooler.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schooler.core.util.CommonUtil;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private CommonUtil commonUtil;
    @GetMapping
    public String testAdmin() {
        return this.commonUtil.formatMessage("Great suraj you did it, congratulations");
    }
}
