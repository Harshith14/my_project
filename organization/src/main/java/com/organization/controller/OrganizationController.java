package com.organization.controller;

import com.organization.model.TourismModel;
import com.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tourism")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping()
    public TourismModel createTourism(@RequestBody TourismModel tourismModel){
       return organizationService.createTourism(tourismModel);
    }

    public void getTourism(){
    }

}
