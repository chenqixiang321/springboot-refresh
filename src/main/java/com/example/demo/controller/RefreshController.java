package com.example.demo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.demo.config.AutoConfigProperties;
import com.example.demo.config.Config;
import com.example.demo.config.ConfigRefresh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Controller
public class RefreshController {

    @Autowired
    private Config config;

    @Autowired
    private ConfigRefresh configRefresh;

    @Autowired
    private AutoConfigProperties autoConfigProperties;

    @RequestMapping("/sentinel")
    @ResponseBody
    public String sentinel(){

        return "sentinel ....fixValue="+config.foo+"--refreshValue="+configRefresh.getFoo()+"--"+autoConfigProperties.foo;
    }

}
