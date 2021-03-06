package cn.rongcloud.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by weiqinxiao on 2019/3/1.
 */
@ApiModel("房间 ID 参数")
@Data
public class ReqRoomKickData {
    @ApiModelProperty("房间 ID")
    @NotBlank(message = "roomId should not be blank")
    private String roomId;

    @ApiModelProperty("用户 ID")
    @NotBlank(message = "userId should not be blank")
    private String userId;
}
