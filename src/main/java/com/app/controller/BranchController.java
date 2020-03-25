package com.app.controller;

import com.app.model.Branch;
import com.app.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("branch")
public class BranchController {

    @Autowired
    private IDataModelService<Branch, Integer> service;

    @RequestMapping("/add")
    public void addBranch(@RequestBody Branch branch) {
        service.save(branch);
    }

    @RequestMapping("/remove")
    public void removeBranch(@RequestParam Integer id) {
        service.delete(id);
    }

}
