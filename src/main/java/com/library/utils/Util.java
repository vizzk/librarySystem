package com.library.utils;

import java.util.Date;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/4/1 16:27
 */
public class Util {
    //获取date到今天相隔天数
    public static int getDaysTtilNow(Date date){
        Date today = new Date();
        long days = (today.getTime() - date.getTime())/(24*60*60*1000);
        return (int)days;
    }
    public static int getRestDay(Date date,int rest){
        return rest - getDaysTtilNow(date);
    }
}
