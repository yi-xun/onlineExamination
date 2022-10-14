package com.launch.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author yixun
 * @create 2022-10-14 18:28
 */
public class UUIDUtils {
    /**
     * 获取一个UUID值
     * @return UUID值[String]
     */
    public  String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    /**
     * 获取多个UUID值
     * @param number 所需个数
     * @return UUID集合
     */
    public List<String> getUUID(Integer number){
        List<String> list = new ArrayList<>();
        while (0 <= (number--)){
            list.add(getUUID());
        }
        return list;
    }

}
