package com.aaa;

import java.util.HashMap;

/**
 * @author lmstart
 * @date 2021/9/1 - 18:44
 */
public class lm {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String age = map.get("age");
        System.out.println(age);
        map.remove("msjor");
        System.out.println(map);


    }
}
