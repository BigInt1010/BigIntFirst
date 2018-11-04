package com.hrl.happy.service;

import com.hrl.happy.model.States;
import com.hrl.happy.repository.StatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("statesService")
public class StatesService {

    private StatesRepository statesRepository;

    @Autowired
    public StatesService(@Qualifier(value = "statesRepository") StatesRepository statesRepository){
        this.statesRepository = statesRepository;
    }

    public void saveStates(States states){
        statesRepository.save(states);
    }
}
