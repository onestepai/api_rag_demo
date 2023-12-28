package com.onestep.controller;

import com.onestep.entities.requests.UserRequest;
import com.onestep.entities.responses.UserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("api/APIRAGDemo")
@Api(value = "API RAG Demo")
public class DemoController {

    @PostMapping(value = "/getUserInfo")
    @ApiOperation(value = "获得用户信息")
    public UserResponse getUserInfo(@ApiParam(value = "用户名称") @RequestBody
                                   final String userName) throws IOException {
        UserResponse userResponse = UserResponse.builder().userName("顾夏辉")
                //.userEmail("xiahui.gu@1step.ai")
                .address("beijing").phoneNumber("206519").build();
        return userResponse;
    }

    @PostMapping(value = "/getUserEmail")
    @ApiOperation(value = "获得用户邮箱")
    public String getUserEmail(@RequestBody
                                   final UserRequest userRequest) throws IOException {
        return "xiahui.gu@1step.ai";
    }
}
