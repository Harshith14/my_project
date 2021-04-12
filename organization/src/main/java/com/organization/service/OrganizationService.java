package com.organization.service;

import com.organization.model.TourismModel;
import com.organization.repository.OrganizationRepo;
import mapper.TourismMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    @Autowired
    OrganizationRepo organizationRepo;

    public TourismModel createTourism(TourismModel tourismModel) {
        return TourismMapper.mapToModel(organizationRepo.save( TourismMapper.mapToEntity(tourismModel)));
    }
}
