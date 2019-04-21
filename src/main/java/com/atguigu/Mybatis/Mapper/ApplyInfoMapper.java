package com.atguigu.Mybatis.Mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplyInfoMapper {

    /**
     * 查询给定的付款计划ID关联的付款单,且在状态为列表中状态的数量
     *
     * @param ids
     *      付款计划ID
     * @param statusList
     *      状态列表
     * @return
     *      计数结果
     */
    /**
     * bychenkai
     * @param codes
     * @param statusList
     * @return
     */
    List<String> getApplyCodeByPaymentPlayCode(@Param("codes") List<String> codes, @Param("statusList") List<Integer> statusList);


}