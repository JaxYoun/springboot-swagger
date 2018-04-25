package com.yang.springbootswagger.rest;

import com.yang.springbootswagger.domain.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * @param id
     * @param name
     * @return
     */
    @PostMapping("/getUser")
    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "name", value = "用户姓名", required = true, dataType = "String")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功！", response = User.class)
    })
    public User getUser(Long id, String name) {
        User user1 = new User();
        user1.setId(id);
        user1.setName(name);
        return user1;
    }

    /**
     * @param user
     * @return
     */
    @PostMapping("/getUserBy")
    @ApiOperation(value = "条件查询用户", notes = "根据条件查询用户信息")
    public User getUserBy(@RequestBody @ApiParam(value = "用户", name = "user", required = true) User user) {
        User user1 = new User();
        user1.setId(user.getId());
        user1.setName(user.getName());
        return user1;
    }

}
