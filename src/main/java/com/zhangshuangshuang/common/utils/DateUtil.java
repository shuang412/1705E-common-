package com.zhangshuangshuang.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//用当前日期获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的变量初始化日历类
		c.setTime(src);
		//天数赋值，代表月初
		c.set(Calendar.DAY_OF_MONTH, 1);
		//小时赋值
		c.set(Calendar.HOUR_OF_DAY, 0);
		//分钟赋值
		c.set(Calendar.MINUTE, 0);
		//秒数赋值
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//用当前日期获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的变量初始化日历类
		c.setTime(src);
		//月份赋值，月份加一
		c.add(Calendar.MONDAY, 1);
		//调用上一个方法回到上个月的第一天
		Date date = getDateByInitMonth(c.getTime());
		//用月初初始化日历
		c.setTime(date);
		//上个月的第一天秒数减一
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

}
