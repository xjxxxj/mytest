package com.xjx.test.crossdomain.dao;

import com.xjx.test.crossdomain.entity.User;

import java.util.*;

/**
 * @program: mytest
 * @description:
 * @author: 谢庆香
 * @create: 2019-05-08 16:09
 **/
public class Depository {

    public static Map<Long , User> userMap = new HashMap<>() ;

    public static void init(int count){
        Random random = new Random();
        for(int i = 0 ; i < count ; i ++){
            User user = new User();
            user.setName("xjx" + i);
            user.setAge(random.nextInt(30));
            List<String> hobbies = new ArrayList<>() ;
            hobbies.add("hobbies-" + i) ;
            user.setHobbies(hobbies);
            userMap.put(new Long(i),user) ;
        }
    }

}