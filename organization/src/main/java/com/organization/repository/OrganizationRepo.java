package com.organization.repository;

import com.organization.entity.TourismEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepo extends JpaRepository<TourismEntity, Long> {

}
