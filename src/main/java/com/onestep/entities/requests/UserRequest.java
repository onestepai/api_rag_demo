package com.onestep.entities.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: Wu YiMin
 * @Description:
 * @Data:Created in 11:48 2023/2/20
 * @Modified By:
 */
@Data
@ApiModel
public class UserRequest {
    @ApiModelProperty(name = "userName", notes = "用户名")
    private String userName;
    @ApiModelProperty(name = "userId", notes = "用户ID")
    private String userID;
}
