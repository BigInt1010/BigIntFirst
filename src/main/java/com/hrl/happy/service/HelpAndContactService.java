package com.hrl.happy.service;

import com.hrl.happy.model.HelpAndContact;
import com.hrl.happy.repository.HelpAndContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("helpAndContactService")
public class HelpAndContactService {

    private HelpAndContactRepository helpAndContactRepository;

    @Autowired
    public HelpAndContactService(@Qualifier("helpAndContactRepository") HelpAndContactRepository helpAndContactRepository) {
        this.helpAndContactRepository = helpAndContactRepository;
    }

    public HelpAndContact saveHelpAndContact(HelpAndContact helpAndContact) {
        return helpAndContactRepository.save(helpAndContact);
    }
}