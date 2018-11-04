package com.hrl.happy.repository;

import com.hrl.happy.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ratingRepository")
public interface RatingRepository extends JpaRepository<Rating, Long> {
}
