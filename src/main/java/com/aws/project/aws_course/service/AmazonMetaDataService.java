package com.aws.project.aws_course.service;

import com.amazonaws.util.EC2MetadataUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AmazonMetaDataService {

    private static final String DEFAULT_VERSION = "0";
    private static final String DEFAULT_REGION = "NONE";

    public String getInstanceRegion() {
        return Optional.ofNullable(EC2MetadataUtils.getEC2InstanceRegion())
                .orElse(DEFAULT_VERSION);
    }

    public String getAvailabilityZone() {
        return Optional.ofNullable(EC2MetadataUtils.getAvailabilityZone())
                .orElse(DEFAULT_REGION);
    }
}
