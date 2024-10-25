package br.com.staff.Staff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staff")
public class StaffController {

    @GetMapping
    public String getStaff(){
        return "Hello Staff";
    }
}
