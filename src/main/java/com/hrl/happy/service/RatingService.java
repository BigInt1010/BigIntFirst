package com.hrl.happy.service;

import com.hrl.happy.model.Rating;
import com.hrl.happy.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ratingService")
public class RatingService {

    private RatingRepository ratingRepository;

    @Autowired
    public RatingService(@Qualifier("ratingRepository") RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Rating saveRating(Rating rating) {

        return ratingRepository.save(rating);
    }
}
