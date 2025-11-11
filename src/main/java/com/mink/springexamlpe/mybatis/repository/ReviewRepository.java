package com.mink.springexamlpe.mybatis.repository;

import com.mink.springexamlpe.mybatis.domain.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReviewRepository {

    //new_review 테이블에소 전달받은 id와 일치하는 행 조회
    public Review selectReview(@Param("id") int id);

}
