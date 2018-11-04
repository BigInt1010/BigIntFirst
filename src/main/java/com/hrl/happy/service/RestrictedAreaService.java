package com.hrl.happy.service;

import com.hrl.happy.model.RestrictedArea;
import com.hrl.happy.repository.RestrictedAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("restrictedAreaService")
public class RestrictedAreaService {

    private RestrictedAreaRepository restrictedAreaRepository;

    @Autowired
    public RestrictedAreaService(@Qualifier("restrictedAreaRepository") RestrictedAreaRepository restrictedAreaRepository) {

        this.restrictedAreaRepository = restrictedAreaRepository;
    }

    public RestrictedArea saveRestrictedArea(RestrictedArea restrictedArea) {

        return restrictedAreaRepository.save(restrictedArea);
    }
}
