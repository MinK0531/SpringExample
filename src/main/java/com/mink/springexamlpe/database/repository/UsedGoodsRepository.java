package com.mink.springexamlpe.database.repository;

import com.mink.springexamlpe.database.domain.UsedGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// Mvbatis Framework
@Mapper
public interface UsedGoodsRepository {

    // used_goods 모든 행 조회
    public List<UsedGoods> selectUsedGoodsList();



}
