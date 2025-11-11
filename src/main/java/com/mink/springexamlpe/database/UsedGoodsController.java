package com.mink.springexamlpe.database;

import com.mink.springexamlpe.database.domain.UsedGoods;
import com.mink.springexamlpe.database.service.UsedGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// Request, Response 관련 기능 수행

@Controller
public class UsedGoodsController {

    @Autowired
    private UsedGoodsService usedGoodsService;

    // 중고 거래 계시글 모든 정보 response에 담기
    @ResponseBody
    @RequestMapping("/db/usedgoods/list")
    public List<UsedGoods> usedGoodsList(){

        // 즁고 거래 계시글 리스트 얻어오기
        List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();

        return usedGoodsList;
    }
}
