package com.schooler.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schooler.core.util.CommonUtil;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private CommonUtil commonUtil;

    @GetMapping
    public String testAdmin() {
        return this.commonUtil.formatMessage("Suraj Kashayp");
    }
}
