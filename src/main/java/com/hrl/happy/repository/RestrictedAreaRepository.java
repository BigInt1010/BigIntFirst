package com.hrl.happy.repository;

import com.hrl.happy.model.RestrictedArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("restrictedAreaRepository")
public interface RestrictedAreaRepository extends JpaRepository<RestrictedArea, Long> {
}