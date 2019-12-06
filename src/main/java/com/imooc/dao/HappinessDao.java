package com.imooc.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.imooc.mapper.Happiness;

/**
* @author 作者
* @version 创建时间：2019年1月3日 上午11:50:49
* 类说明
*/
@Mapper
public interface HappinessDao {
    Happiness findHappinessByCity(@Param("city") String city);
    int insertHappiness(HashMap<String, Object> map);
}
