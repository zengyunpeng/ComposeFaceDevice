package com.intellif.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeUtil {
    private Calendar calendar;

    public int year, month, day, hour, minute, second, week;
    public String nowTime,nowDate,todayDate;
    public final String []weekStr = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

    private TimeUtil() {
        updateCurrentDate();
    }

    private static TimeUtil instance = new TimeUtil();

    public static TimeUtil getInstance() {
        return instance;
    }

    public void updateCurrentDate() {
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DATE);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        week = calendar.get(Calendar.DAY_OF_WEEK)-1;
        nowDate = year+String.format(Locale.CHINA,"-%02d-%02d", month, day);
        nowTime = String.format(Locale.CHINA,"%02d:%02d:%02d", hour, minute, second);
        todayDate = year+String.format(Locale.CHINA,"年%02d月%02d日", month, day)+"  "+weekStr[week];
    }

    public String getNowDateTime(){
        return nowDate +" "+nowTime;
    }

    /**
     * 将时间转换为时间戳
     * @param s
     * @return
     * @throws ParseException
     */
    public static String dateToStamp(SimpleDateFormat format, String s) throws ParseException {
        String res;
        Date date = format.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    /**
     * 将时间戳转换为时间
     * @param s
     * @return
     */
    public static String stampToDate(SimpleDateFormat format, String s) {
        String res;
        long lt = new Long(s);
        Date date = new Date(lt);
        res = format.format(date);
        return res;
    }
}
