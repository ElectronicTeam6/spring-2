package com.oes.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.oes.entity.Review;


@Service
public interface ReviewService {
	
public Review addReview(Review review);
	
	public List<Review> getAllReviewbyUser(String username)throws Exception;

	public List<Review> SortReviewBasedOnRating()throws Exception;

	public List<Review> SortReviewsBasedOnName()throws Exception;

	public List<Review> SortReviewsBasedOnProductName()throws Exception;

	public List<Review> filterAllReviewsByProductName(String productName)throws Exception;

}
