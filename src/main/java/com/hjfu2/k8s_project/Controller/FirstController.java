package com.hjfu2.k8s_project.Controller;

import cn.hutool.core.date.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/first")
public class FirstController {

    @RequestMapping("/time")
    public String getTime() {
        return DateUtil.formatDateTime(new Date());
    }
}
