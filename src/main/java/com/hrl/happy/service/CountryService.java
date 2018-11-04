package com.hrl.happy.service;

import com.hrl.happy.model.Country;
import com.hrl.happy.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryService(@Qualifier("countryRepository") CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country saveCountryInfo(Country country) {
        return countryRepository.save(country);
    }
}