package com.onestep.entities.responses;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import io.swagger.annotations.ApiModel;
/**
 * @Author: Wu YiMin
 * @Description:
 * @Data:Created in 11:48 2023/2/20
 * @Modified By:
 */
@Data
@Builder
@ApiModel
public class UserResponse {
    @ApiModelProperty(name = "userName", notes = "用户名")
    private String userName;
//    @ApiModelProperty(name = "userName", notes = "用户邮箱")
//    private String userEmail;
    @ApiModelProperty(name = "userName", notes = "用户电话号码")
    private String phoneNumber;
    @ApiModelProperty(name = "userName", notes = "用户地址")
    private String address;
}
