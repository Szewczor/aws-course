package com.aws.project.aws_course.controller;

import com.aws.project.aws_course.service.AmazonMetaDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metadata")
public class AmazonMetaDataController {

    private final AmazonMetaDataService amazonMetaDataService;

    public AmazonMetaDataController(AmazonMetaDataService amazonMetaDataService) {
        this.amazonMetaDataService = amazonMetaDataService;
    }

    @GetMapping("/region")
    public String getVersion() {
        return amazonMetaDataService.getInstanceRegion();
    }

    @GetMapping("/availability-zone")
    public String getAvailabilityZone() {
        return amazonMetaDataService.getAvailabilityZone();
    }
}
