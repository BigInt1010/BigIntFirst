package com.hrl.happy.repository;

import com.hrl.happy.model.HelpAndContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("helpAndContactRepository")
public interface HelpAndContactRepository extends JpaRepository<HelpAndContact, Long> {
}

