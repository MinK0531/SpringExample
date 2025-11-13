package com.mink.springexamlpe.mybatis.repository;

import com.mink.springexamlpe.mybatis.domain.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface ReviewRepository {

    //new_review 테이블에소 전달받은 id와 일치하는 행 조회
    public Review selectReview(@Param("id") int id);


    // 하나의 행을 insert하는 기능
    public int insertReview(
            @Param("storeId") int storeId
            ,  @Param("menu") String menu
            , @Param("userName") String userName
            , @Param("point") double point
            , @Param("review") String review);

    public int insertReviewByObject(Review review);
}
