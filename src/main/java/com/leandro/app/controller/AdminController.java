package com.leandro.app.controller;

import com.leandro.app.controller.converters.UserConverter;
import com.leandro.app.controller.responses.UserWithLoansListWrapper;
import com.leandro.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/admin")
@RestController
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    @PostMapping("/load")
    @ResponseBody
    public void load(@RequestBody UserWithLoansListWrapper wrapper) {
        userService.save(userConverter.convertToUserWithLoans(wrapper.getUserWithLoans()));
    }

}
