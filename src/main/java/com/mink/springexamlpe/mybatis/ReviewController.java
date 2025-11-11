package com.mink.springexamlpe.mybatis;

import com.mink.springexamlpe.mybatis.domain.Review;
import com.mink.springexamlpe.mybatis.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // 전달받은 id와 일치하는 리뷰 정보를 response에 담기
    @ResponseBody
    @RequestMapping("/mybatis/review")
    public Review review(@RequestParam("id") int id){
        //request.getParameter("id")

        Review review =  reviewService.getreview(id);
        // id 가 3인 정보리뷰 얻어오기

        return review;
    }

}
