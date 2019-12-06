package com.imooc.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.dao.HappinessDao;
import com.imooc.mapper.Happiness;

/**
* @author 作者
* @version 创建时间：2019年1月3日 上午11:51:56
* 类说明
*/
@Service
public class HappinessService {
	@Autowired
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("city", "西安");
        map.put("num", 9421);

        happinessDao.insertHappiness(map);
//        int a = 1 / 0; //模拟故障
//        happinessDao.insertHappiness(map);
    }
}
