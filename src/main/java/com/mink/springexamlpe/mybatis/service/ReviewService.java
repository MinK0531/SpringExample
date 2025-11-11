package com.mink.springexamlpe.mybatis.service;

import com.mink.springexamlpe.mybatis.domain.Review;
import com.mink.springexamlpe.mybatis.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    // 전달받은 id와 일치하는  리뷰정보 얻어오기
    public Review getreview(int id){

        Review review = reviewRepository.selectReview(id);
        // new_review 테이블에서 id가 3인 행 조회
        return  review;
    }
}
