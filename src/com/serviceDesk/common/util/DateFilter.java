/*
 * @(#)DateFilter.java 0.1 2009.10.04
 * 
 * Copyright 2010 Peerless Feng, Inc. All rights reserved.
 */
package com.serviceDesk.common.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期过滤接口
 * @since JDK1.6.0_20
 */
public class DateFilter {
    /** 日期格式,值为{@value} */
    public static final String DATEFORMAT       = "yyyy-MM-dd";
    /** 日期格式,值为{@value} */
    public static final String DATEFORMAT_YM    = "yyyy-MM";
    /** 日期格式,值为{@value} */
    public static final String DATEFORMAT2      = "MM/dd/yyyy";
    /** 日期格式,值为{@value} */
    public static final String DATEFORMAT_ZH    = "yyyy年MM月dd日";
    /** 日期格式,值为{@value} */
    public static final String DATEFORMAT_YM_ZH = "yyyy年MM月";
    /** 时间格式,值为{@value} */
    public static final String TIMEFORMAT_HMS   = "HH:mm:ss";
    /** 时间格式,值为{@value} */
    public static final String TIMEFORMAT_HM    = "HH:mm";
    /** 日期格式,值为{@value} */
    public static final String DATETIMEFORMAT   = "yyyy-MM-dd HH:mm:ss";
    /** 日期格式,值为{@value} */
    public static final String DATETIMEFORMAT2  = "MM/dd/yyyy HH:mm";
    /** 日期格式,值为{@value} */
    public static final String DATETIMEFORMAT3  = "yyyy-MM-dd HH:mm";
    /** 日期格式,值为{@value} */
    public static final String DATETIMEFORMAT4  = "MM/dd/yyyy HH:mm:ss";
    /** 年,值为{@value} */
    public static final String YYYY             = "yyyy";
    /** 月,值为{@value} */
    public static final String MM               = "MM";
    /** 日,值为{@value} */
    public static final String DD               = "dd";
    /** 小时,值为{@value} */
    public static final String HH               = "HH";
    /** 分,值为{@value} */
    public static final String MI               = "mm";
    /** 秒,值为{@value} */
    public static final String SS               = "ss";
    /** 两位年 两位月,值为{@value} */
    public static final String YYMM               = "yyMM";
    /** 用来全局控制 上一周，本周，下一周的周数变化 */
    public static int          WEEKS            = 0;

    /**
     * 获取当前日期
     * @return Date
     */
    public static Date getDate() {
        return Calendar.getInstance().getTime();
    }

    /**
     * 获取当前日期
     * @return Timestamp
     */
    public static java.sql.Timestamp getCurrentTimestamp() {
        return new java.sql.Timestamp(getDate().getTime());
    }

    /**
     * 获取当前日期,格式：yyyy-MM-dd
     * @return String
     */
    public static String getCurrentDate() {
        return formatDate(getDate(), DATEFORMAT);
    }
    /**
     * 获取当前日期,格式：yyyy-MM-dd
     * @return Date
     */
    public static Date getCurrentDateDT() {
        return formatDate(formatDate(getDate(), DATEFORMAT),DATEFORMAT);
    }

    /**
     * 获取当前时间,格式：HH:mm:ss
     * @return String
     */
    public static String getCurrentTime() {
        return formatDate(getDate(), TIMEFORMAT_HMS);
    }

    /**
     * 获取当前日期,格式：yyyy-MM-dd HH:mm:ss
     * @return String
     */
    public static String getCurrentDateTime() {
        return formatDate(getDate(), DATETIMEFORMAT);
    }
    
    /**
     * 获取当前日期 指定格式化日期
     * 
     * @param formatStr - 格式化字符，可取全局常量
     * @return
     */
    public static String getCurrentFormatDate(String formatStr) {
    	return formatDate(getDate(), formatStr);
    }

    /**
     * 格式化指定日期 Date 2 String
     * @param date Date - 日期型
     * @param formatStr String - 日期格式化字符串 如：yyyy-MM-dd等
     * @return String
     */
    public static String formatDate(Date date, String formatStr) {
        String dateStr = "";
        if (date != null) {
            formatStr = (formatStr == null && "".equals(formatStr)) ? DATEFORMAT
                    : formatStr;
            SimpleDateFormat bdf = new SimpleDateFormat(formatStr);
            dateStr = bdf.format(date);
        }
        return dateStr;
    }

    /**
     * 格式化指定日期 String 2 Date
     * @param dateStr String - 日期字符串
     * @param formatStr String - 日期格式化字符串 如：yyyy-MM-dd等
     * @return String
     */
    public static Date formatDate(String dateStr, String formatStr) {
        Date date = null;
        try {
            if (null != dateStr && !"".equals(dateStr)) {
                formatStr = (formatStr == null && "".equals(formatStr)) ? DATEFORMAT
                        : formatStr;
                SimpleDateFormat bdf = new SimpleDateFormat(formatStr);
                date = bdf.parse(dateStr);
            }
        } catch (ParseException e) {
            throw new RuntimeException("日期格式化出错！");
        }

        return date;
    }

    /**
     * 格式化指定日期，格式：yyyy-MM-dd
     * @param date
     * @return String
     */
    public static String withDateFormat(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATEFORMAT);
        return dateStr;
    }

    /**
     * 格式化指定日期，格式：yyyy-MM
     * @param date
     * @return String
     */
    public static String withDateFormat_YM(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATEFORMAT_YM);
        return dateStr;
    }

    /**
     * 格式化指定日期，格式：yyyy年MM月dd日
     * @param date
     * @return String
     */
    public static String withDateFormat_ZH(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATEFORMAT_ZH);
        return dateStr;
    }

    /**
     * 格式化指定日期，格式：yyyy年MM月
     * @param date
     * @return String
     */
    public static String withDateFormat_YM_ZH(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATEFORMAT_YM_ZH);
        return dateStr;
    }

    /**
     * 格式化指定时间，格式：HH:mm:ss
     * @param date
     * @return String
     */
    public static String withTimeFormat(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, TIMEFORMAT_HMS);
        return dateStr;
    }

    /**
     * 格式化指定时间，格式：HH:mm
     * @param date
     * @return String
     */
    public static String withTimeFormat_HM(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, TIMEFORMAT_HM);
        return dateStr;
    }

    /**
     * 格式化指定日期和时间，格式：yyyy-MM-dd HH:mm:ss
     * @param date
     * @return String
     */
    public static String withDateTimeFormat(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATETIMEFORMAT);
        return dateStr;
    }

    /**
     * 格式化指定日期和时间，格式：MM/dd/yyyy HH:mm
     * @param date
     * @return String
     */
    public static String withDateTimeFormat2(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATETIMEFORMAT2);
        return dateStr;
    }

    /**
     * 格式化指定日期和时间，格式：yyyy-MM-dd HH:mm
     * @param date
     * @return String
     */
    public static String withDateTimeFormat3(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = formatDate(date, DATETIMEFORMAT3);
        return dateStr;
    }

	/**
	 * 获取指定日期几天前的日期
	 * 
	 * @param oldDate -
	 *            原日期
	 * @param dayCount -
	 *            天数
	 * @return
	 */
	public static Date getBeforeDayDate(Date oldDate, int dayCount) {
		Date newDate = null;
		if (dayCount > 0) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(oldDate);
			calendar.add(Calendar.DATE, -dayCount);
			newDate = calendar.getTime();
		}
		return newDate;
	}

    /**
     * 获取几天前的日期
     * @param dayCount 天数:正数
     * @return Date
     */
    public static Date getBeforeDayDate(int dayCount) {
        Date date = null;
        if (dayCount > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DATE, -dayCount);
            date = calendar.getTime();
        }
        return date;
    }

    /**
     * 获取几天前的日期 格式：yyyy-MM-dd
     * @param dayCount 天数:正数
     * @return String
     */
    public static String getBeforeDayDateStr(int dayCount) {
        String dateStr = "";
        if (dayCount > 0)
            dateStr = formatDate(getBeforeDayDate(dayCount), DATEFORMAT);
        return dateStr;
    }

	/**
	 * 获取某个日期几天后的日期
	 * @param oldDate - 原日期
	 * @param dayCount - 天数
	 * @return
	 */
    public static Date getAfterDayDate(Date oldDate, int dayCount) {
        Date newDate = null;
        if (dayCount > 0) {
        	Calendar calendar = Calendar.getInstance();
        	calendar.setTime(oldDate);
            calendar.add(Calendar.DATE, dayCount);
            newDate = calendar.getTime();
        }
        return newDate;
    }

    /**
     * 获取几天后的日期
     * @param dayCount 天数:正数，
     * 
     * @return Date
     */
    public static Date getAfterDayDate(int dayCount) {
        Date date = null;
        if (dayCount > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DATE, dayCount);
            date = calendar.getTime();
        }
        return date;
    }

    /**
     * 获取几天后的日期 格式：yyyy-MM-dd
     * @param dayCount 天数:正数
     * @return String
     */
    public static String getAfterDayDateStr(int dayCount) {
        String dateStr = "";
        if (dayCount > 0)
            dateStr = formatDate(getAfterDayDate(dayCount), DATEFORMAT);
        return dateStr;
    }

    /**
     * 获取几个月前的日期
     * @param monthCount 天数:正数
     * @return Date
     */
    public static Date getBeforeMonthDate(int monthCount) {
        Date date = null;
        if (monthCount > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, -monthCount);
            date = calendar.getTime();
        }
        return date;
    }

    /**
     * 获取几个月前的日期 格式：yyyy-MM-dd
     * @param monthCount 天数:正数
     * @return String
     */
    public static String getBeforeMonthDateStr(int monthCount) {
        String dateStr = "";
        if (monthCount > 0)
            dateStr = formatDate(getBeforeMonthDate(monthCount), DATEFORMAT);
        return dateStr;
    }

    /**
     * 获取几个月后的日期
     * @param monthCount 天数:正数
     * @return Date
     */
    public static Date getAfterMonthDate(int monthCount) {
        Date date = null;
        if (monthCount > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, monthCount);
            date = calendar.getTime();
        }
        return date;
    }

    /**
     * 获取几个月后的日期 格式：yyyy-MM-dd
     * @param monthCount 天数:正数
     * @return String
     */
    public static String getAfterMonthDateStr(int monthCount) {
        String dateStr = "";
        if (monthCount > 0)
            dateStr = formatDate(getAfterMonthDate(monthCount), DATEFORMAT);
        return dateStr;
    }

    /**
     * 将日期字符串转换成日期型
     * @param dateStr 日期字符串
     * @return Date
     */
    public static Date str2Date(String dateStr) {
        Date date = null;
        try {
            if (null != dateStr && !"".equals(dateStr))
                date = DateFormat.getDateInstance().parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException("日期格式化出错！");
        }
        return date;
    }

    /**
     * 将时间字符串转换成日期型，必须是时间格式：HH:mm:ss
     * @param timeStr 时间字符串
     * @return Date
     */
    public static Date str2Time(String timeStr) {
        Date date = null;
        try {
            if (null != timeStr && !"".equals(timeStr))
                date = DateFormat.getTimeInstance().parse(timeStr);
        } catch (ParseException e) {
            throw new RuntimeException("时间格式化出错！时间字符串，正确格式：HH:mm:ss。");
        }
        return date;
    }

    /**
     * 将日期时间字符串转换成日期型，必须是日期时间格式：yyyy-MM-dd HH:mm:ss。
     * @param dateTimeStr 日期时间字符串
     * @return Date
     */
    public static Date str2DateTime(String dateTimeStr) {
        Date date = null;
        try {
            if (null != dateTimeStr && !"".equals(dateTimeStr))
                date = DateFormat.getDateTimeInstance().parse(dateTimeStr);
        } catch (ParseException e) {
            throw new RuntimeException(
                    "日期格式化出错！日期时间字符串，正确格式：yyyy-MM-dd HH:mm:ss。");
        }
        return date;
    }

    /**
     * 将日期字符串转换成java.sql.Date（在Linux环境下最好使用此方法 ）
     * @param dateStr 日期字符串
     * @return java.sql.Date
     */
    public static java.sql.Date str2SQLDate(String dateStr) {
        java.sql.Date date = null;
        if (null != dateStr && !"".equals(dateStr))
            date = java.sql.Date.valueOf(dateStr);
        return date;
    }

    /**
     * 将日期字符串转换成java.sql.Time（在Linux环境下最好使用此方法 ）
     * @param timeStr 日期字符串
     * @return java.sql.Time
     */
    public static java.sql.Time str2SQLTime(String timeStr) {
        java.sql.Time date = null;
        if (null != timeStr && !"".equals(timeStr))
            date = java.sql.Time.valueOf(timeStr);
        return date;
    }

    /**
     * 将日期字符串转换成java.sql.Timestamp（在Linux环境下最好使用此方法 ）
     * @param dateTimeStr 日期字符串
     * @return java.sql.Timestamp
     */
    public static java.sql.Timestamp str2SQLDateTime(String dateTimeStr) {
        java.sql.Timestamp date = null;
        if (null != dateTimeStr && !"".equals(dateTimeStr))
            date = java.sql.Timestamp.valueOf(dateTimeStr);
        return date;
    }

    /**
     * 将日期时间字符串转换成日期型,固定格式字符串,格式：MM/dd/yyyy HH:mm
     * @param dateTimeStr 日期时间字符串
     * @return Date
     */
    public static Date str2DateTime2(String dateTimeStr) {
        Date date = null;
        if (null != dateTimeStr && !"".equals(dateTimeStr))
            date = formatDate(dateTimeStr, DATETIMEFORMAT2);
        return date;
    }

    /**
     * 将日期时间字符串转换成日期型,固定格式字符串,格式：MM/dd/yyyy
     * @param dateTimeStr 日期时间字符串
     * @return Date
     */
    public static Date str2DateTime3(String dateTimeStr) {
        Date date = null;
        if (null != dateTimeStr && !"".equals(dateTimeStr))
            date = formatDate(dateTimeStr, DATEFORMAT2);
        return date;
    }

    /**
     * 将日期时间字符串转换成日期型,固定格式字符串,格式：MM/dd/yyyy HH:mm:ss
     * @param dateTimeStr 日期时间字符串
     * @return Date
     */
    public static Date str2DateTime4(String dateTimeStr) {
        Date date = null;
        if (null != dateTimeStr && !"".equals(dateTimeStr))
            date = formatDate(dateTimeStr, DATETIMEFORMAT4);
        return date;
    }

    /**
     * 将日期时间转换成日期
     * @param date
     * @return Date
     */
    public static Date dateTime2Date(Date date) {
        return str2Date(withDateFormat(date));
    }

    /**
     * 将日期型转换成日期字符串
     * @param date 指定日期
     * @return String
     */
    public static String date2Str(Date date) {
        String dateStr = "";
        if (date != null)
            dateStr = date.toString();
        return dateStr;
    }

    /**
     * 将时间字符串转换成时间
     * @param hour 小时
     * @param minute 分钟
     * @param second 秒
     * @return Date
     */
    public static Date str2Time(int hour, int minute, int second) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.HOUR_OF_DAY, hour);
        cld.set(Calendar.MINUTE, minute);
        cld.set(Calendar.SECOND, second);
        return cld.getTime();
    }

    /**
     * 创建日期
     * @param year
     * @param month
     * @param day
     * @return Date
     */
    public static Date createDate(int year, int month, int day) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.YEAR, year);
        cld.set(Calendar.MONTH, month - 1);
        cld.set(Calendar.DATE, day);
        return cld.getTime();
    }

    /**
     * 创建时间
     * @param hour
     * @param minute
     * @param second
     * @return Date
     */
    public static Date createTime(int hour, int minute, int second) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.HOUR_OF_DAY, hour);
        cld.set(Calendar.MINUTE, minute);
        cld.set(Calendar.SECOND, second);
        return cld.getTime();
    }

    /**
     * 创建日期时间
     * @param date
     * @param hour
     * @param minute
     * @param second
     * @return Date
     */
    public static Date createDateTime(Date date, int hour, int minute,
            int second) {
        Date dateTime = null;
        if (date != null) {
            Calendar cld = Calendar.getInstance();
            cld.setTime(date);
            cld.set(Calendar.HOUR_OF_DAY, hour);
            cld.set(Calendar.MINUTE, minute);
            cld.set(Calendar.SECOND, second);
            dateTime = cld.getTime();
        }
        return dateTime;
    }

    /**
     * 创建日期时间
     * @param dateStr
     * @param hour
     * @param minute
     * @param second
     * @return Date
     */
    public static Date createDateTime(String dateStr, int hour, int minute,
            int second) {
        Date dateTime = null;
        if (dateStr != null && !"".equals(dateStr)) {
            Calendar cld = Calendar.getInstance();
            cld.setTime(str2Date(dateStr));
            cld.set(Calendar.HOUR_OF_DAY, hour);
            cld.set(Calendar.MINUTE, minute);
            cld.set(Calendar.SECOND, second);
            dateTime = cld.getTime();
        }
        return dateTime;
    }

    /**
     * 计算两个日期之间的天数,(date2 - date1)
     * @param date1 日期型
     * @param date2 日期型
     * @param isNegative 是否可以返回负数
     * @return long
     */
    public static long getDaysFromTwoDate(Date date1, Date date2,
            boolean isNegative) {
        long days = 0;
        if (date1 != null && date2 != null) {
            long millisecond = date2.getTime() - date1.getTime();
            if (!isNegative) {
                if (millisecond < 0) {
                    millisecond = -millisecond;
                }
            }
            days = (millisecond) / (24 * 60 * 60 * 1000);
        }
        return days;
    }

    /**
     * 计算两个日期之间的小时差,(date2 - date1)
     * @param date1 日期型
     * @param date2 日期型
     * @param isNegative 是否可以返回负数
     * @return double
     */
    public static double getHourFromTwoDate(Date date1, Date date2,
            boolean isNegative) {
        double days = 0;
        if (date1 != null && date2 != null) {
            long millisecond = date2.getTime() - date1.getTime();
            if (!isNegative) {
                if (millisecond < 0) {
                    millisecond = -millisecond;
                }
            }
            days = (millisecond) / (60d * 60d * 1000d);
        }
        return formatNumber(days);
    }
    
    /**
     * 计算两个日期之间的小时差,(date2 - date1)，必须是日期时间格式：yyyy-MM-dd HH:mm:ss。
     * @param date1 日期型
     * @param date2 日期型
     * @param isNegative 是否可以返回负数
     * @return double
     */
    public static double getHourFromTwoDate(String dateStr1, String dateStr2,
            boolean isNegative) {
        double days = 0;
        if (dateStr1 != null && !"".equals(dateStr1) && dateStr2 != null && !"".equals(dateStr2)) {
            long millisecond = str2DateTime(dateStr2).getTime() - str2DateTime(dateStr1).getTime();
            if (!isNegative) {
                if (millisecond < 0) {
                    millisecond = -millisecond;
                }
            }
            days = (millisecond) / (60d * 60d * 1000d);
        }
        return formatNumber(days);
    }

    /**
     * 计算两个日期之间的小时差
     * @param hour1
     * @param minute1
     * @param second1
     * @param hour2
     * @param minute2
     * @param second2
     * @param isNegative
     * @return double
     */
    public static double getHourFromTwoDate(int hour1, int minute1,
            int second1, int hour2, int minute2, int second2, boolean isNegative) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.HOUR_OF_DAY, hour1);
        cld.set(Calendar.MINUTE, minute1);
        cld.set(Calendar.SECOND, second1);
        Date time1 = cld.getTime();

        Calendar cld2 = Calendar.getInstance();
        cld2.set(Calendar.HOUR_OF_DAY, hour2);
        cld2.set(Calendar.MINUTE, minute2);
        cld2.set(Calendar.SECOND, second2);
        Date time2 = cld2.getTime();
        return getHourFromTwoDate(time1, time2, isNegative);
    }

    /**
     * 计算两个日期之间的分钟差,(date2 - date1)
     * @param date1
     * @param date2
     * @param isNegative
     * @return double
     */
    public static double getMinuteFromTwoDate(Date date1, Date date2,
            boolean isNegative) {
        double days = 0;
        if (date1 != null && date2 != null) {
            long millisecond = date2.getTime() - date1.getTime();
            if (!isNegative) {
                if (millisecond < 0) {
                    millisecond = -millisecond;
                }
            }
            days = (millisecond) / (60d * 1000d);
        }
        return formatNumber(days);
    }

    /**
     * 计算两个日期之间的分钟差
     * @param hour1
     * @param minute1
     * @param second1
     * @param hour2
     * @param minute2
     * @param second2
     * @param isNegative
     * @return double
     */
    public static double getMinuteFromTwoDate(int hour1, int minute1,
            int second1, int hour2, int minute2, int second2, boolean isNegative) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.HOUR_OF_DAY, hour1);
        cld.set(Calendar.MINUTE, minute1);
        cld.set(Calendar.SECOND, second1);
        Date time1 = cld.getTime();

        Calendar cld2 = Calendar.getInstance();
        cld2.set(Calendar.HOUR_OF_DAY, hour2);
        cld2.set(Calendar.MINUTE, minute2);
        cld2.set(Calendar.SECOND, second2);
        Date time2 = cld2.getTime();
        return getMinuteFromTwoDate(time1, time2, isNegative);
    }

    /**
     * 比较两个时间，返回较小的时间
     * @param hour1
     * @param minute1
     * @param second1
     * @param hour2
     * @param minute2
     * @param second2
     * @return Date
     */
    public static Date getMinDate(int hour1, int minute1, int second1,
            int hour2, int minute2, int second2) {
        Date time = null;
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.HOUR_OF_DAY, hour1);
        cld.set(Calendar.MINUTE, minute1);
        cld.set(Calendar.SECOND, second1);
        Date time1 = cld.getTime();

        Calendar cld2 = Calendar.getInstance();
        cld2.set(Calendar.HOUR_OF_DAY, hour2);
        cld2.set(Calendar.MINUTE, minute2);
        cld2.set(Calendar.SECOND, second2);
        Date time2 = cld2.getTime();

        double minutes = getHourFromTwoDate(time1, time2, true);
        if (minutes > 0)
            time = time1;
        else
            time = time2;
        return time;
    }

    /**
     * 比较两个时间，返回较大的时间
     * @param hour1
     * @param minute1
     * @param second1
     * @param hour2
     * @param minute2
     * @param second2
     * @return Date
     */
    public static Date getMaxDate(int hour1, int minute1, int second1,
            int hour2, int minute2, int second2) {
        Date time = null;
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.HOUR_OF_DAY, hour1);
        cld.set(Calendar.MINUTE, minute1);
        cld.set(Calendar.SECOND, second1);
        Date time1 = cld.getTime();

        Calendar cld2 = Calendar.getInstance();
        cld2.set(Calendar.HOUR_OF_DAY, hour2);
        cld2.set(Calendar.MINUTE, minute2);
        cld2.set(Calendar.SECOND, second2);
        Date time2 = cld2.getTime();

        double minutes = getHourFromTwoDate(time1, time2, true);
        if (minutes > 0)
            time = time2;
        else
            time = time1;
        return time;
    }

    /**
     * 计算两个日期之间的天数,(dateStr2 - dateStr1)
     * @param dateStr1
     * @param dateStr2
     * @param isNegative
     * @return long
     */
    public static long getDaysFromTwoDate(String dateStr1, String dateStr2,
            boolean isNegative) {
        return getDaysFromTwoDate(str2Date(dateStr1), str2Date(dateStr2),
                isNegative);
    }

    /**
     * 计算两个日期之间的天数,(date - dateStr)
     * @param dateStr
     * @param date
     * @param isNegative
     * @return long
     */
    public static long getDaysFromTwoDate(String dateStr, Date date,
            boolean isNegative) {
        return getDaysFromTwoDate(str2Date(dateStr), date, isNegative);
    }

    /**
     * 判断是否是上午
     * @param dateTime
     * @return boolean
     */
    public static boolean isAM(Date dateTime) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(dateTime);
        int hour = cld.get(Calendar.HOUR_OF_DAY);
        if (hour >= 0 && hour < 12) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是上午
     * @param hour
     * @return boolean
     */
    public static boolean isAM(int hour) {
        if (hour >= 0 && hour < 12) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是下午
     * @param dateTime
     * @return boolean
     */
    public static boolean isPM(Date dateTime) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(dateTime);
        int hour = cld.get(Calendar.HOUR_OF_DAY);
        if (hour >= 12 && hour < 24) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是下午
     * @param hour
     * @return boolean
     */
    public static boolean isPM(int hour) {
        if (hour >= 12 && hour < 24) {
            return true;
        }
        return false;
    }

    /**
     * 获取当前年,4位
     * @return String
     */
    public static String getYYYY() {
        return formatDate(getDate(), YYYY);
    }

    /**
     * 获取指定年份,4位
     * @param date - 日期型参数
     * @return String
     */
    public static String getYYYY(Date date) {
        String yyyy = "";
        if (date != null)
            yyyy = formatDate(date, YYYY);
        return yyyy;
    }

    /**
     * 获取当前年,4位
     * @return int
     */
    public static int getYear() {
        Calendar cld = Calendar.getInstance();
        cld.setTime(getDate());
        return cld.get(Calendar.YEAR);
    }

    /**
     * 获取指定年份,4位
     * @param date - 日期型参数
     * @return int
     */
    public static int getYear(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        return cld.get(Calendar.YEAR);
    }

    /**
     * 获取指定年份,4位
     * @param dateStr - 字符串型参数
     * @return int
     */
    public static int getYear(String dateStr) {
        int year = 0;
        if (dateStr != null && !"".equals(dateStr))
            year = getYear(str2Date(dateStr));
        return year;
    }

    /**
     * 获取当前月份
     * @return String
     */
    public static String getMM() {
        return formatDate(getDate(), MM);
    }

    /**
     * 获取指定月份
     * @param date - 日期型参数
     * @return String
     */
    public static String getMM(Date date) {
        String mm = "";
        if (date != null)
            mm = formatDate(date, MM);
        return mm;
    }

    /**
     * 获取当前月份
     * @return int
     */
    public static int getMonth() {
        Calendar cld = Calendar.getInstance();
        cld.setTime(getDate());
        cld.add(Calendar.MONTH, 1);
        return cld.get(Calendar.MONTH);
    }

    /**
     * 获取指定月份
     * @param date - 日期型参数
     * @return int
     */
    public static int getMonth(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        cld.add(Calendar.MONTH, 1);
        return cld.get(Calendar.MONTH);
    }

    /**
     * 获取指定月份
     * @param dateStr - 字符串型参数
     * @return int
     */
    public static int getMonth(String dateStr) {
        int month = 0;
        if (dateStr != null && !"".equals(dateStr))
            month = getMonth(str2Date(dateStr));
        return month;
    }

    /**
     * 获取当前天
     * @return String
     */
    public static String getDD() {
        return formatDate(getDate(), DD);
    }

    /**
     * 获取指定天
     * @param date - 日期型参数
     * @return String
     */
    public static String getDD(Date date) {
        String dd = "";
        if (date != null)
            dd = formatDate(date, DD);
        return dd;
    }

    /**
     * 获取当前 天
     * @return int
     */
    public static int getDay() {
        Calendar cld = Calendar.getInstance();
        cld.setTime(getDate());
        return cld.get(Calendar.DATE);
    }

    /**
     * 获取指定天
     * @param date - 日期型参数
     * @return int
     */
    public static int getDay(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        return cld.get(Calendar.DATE);
    }

    /**
     * 获取指定天
     * @param dateStr - 字符串型参数
     * @return int
     */
    public static int getDay(String dateStr) {
        int dd = 0;
        if (dateStr != null && !"".equals(dateStr))
            dd = getDay(str2Date(dateStr));
        return dd;
    }

    /**
     * 获取当前小时
     * @return String
     */
    public static String getHour() {
        return formatDate(getDate(), HH);
    }

    /**
     * 获取当前分钟
     * @return String
     */
    public static String getMinute() {
        return formatDate(getDate(), MI);
    }

    /**
     * 获取当前秒
     * @return String
     */
    public static String getSecond() {
        return formatDate(getDate(), SS);
    }

    /**
     * 获取指定小时
     * @param time
     * @return String
     */
    public static String getHour(Date time) {
        String timeStr = "";
        if (time != null)
            timeStr = formatDate(time, HH);
        return timeStr;
    }

    /**
     * 获取指定分钟
     * @param time
     * @return String
     */
    public static String getMinute(Date time) {
        String timeStr = "";
        if (time != null)
            timeStr = formatDate(time, MI);
        return timeStr;
    }

    /**
     * 获取指定秒
     * @param time
     * @return String
     */
    public static String getSecond(Date time) {
        String timeStr = "";
        if (time != null)
            timeStr = formatDate(time, SS);
        return timeStr;
    }

    /**
     * 获得当前日期与本周日相差的天数
     * @return int
     */
    public static int getMondayPlus() {
        Calendar cld = Calendar.getInstance();
        // 获得今天是一周的第几天，星期日是第一天，星期一是第二天......
        int dayOfWeek = cld.get(Calendar.DAY_OF_WEEK) - 1; // 因为按中国礼拜一作为第一天所以这里减1
        if (dayOfWeek == 1) {
            return 0;
        } else {
            return 1 - dayOfWeek;
        }
    }

    /**
     * 获得本周星期一的日期
     * @return String
     */
    public static String getMondayOfThisWeek() {
        WEEKS = 0;
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus);
        return withDateFormat(currentDate.getTime());
    }

    /**
     * 获得本周星期日的日期
     * @return String
     */
    public static String getSundayOfThisWeek() {
        WEEKS = 0;
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
        return withDateFormat(currentDate.getTime());
    }

    /**
     * 获得上周星期一的日期
     * @return String
     */
    public static String getMondayOfPreviousWeek() {
        WEEKS--;
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * WEEKS);
        return withDateFormat(currentDate.getTime());
    }

    /**
     * 获得上周星期日的日期
     * @return String
     */
    public static String getSundayOfPreviousWeek() {
        WEEKS = 0;
        WEEKS--;
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + WEEKS);
        return withDateFormat(currentDate.getTime());
    }

    /**
     * 获得下周星期一的日期
     * @return String
     */
    public static String getMondayOfNextWeek() {
        WEEKS++;
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7);
        return withDateFormat(currentDate.getTime());
    }

    /**
     * 获得下周星期日的日期
     * @return String
     */
    public static String getSundayOfNextWeek() {
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 + 6);
        return withDateFormat(currentDate.getTime());
    }

    /**
     * 获得 当月 第一天 的日期
     * @return String
     */
    public static String getFirstDayOfMonth() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_MONTH, 1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 当月 最后一天 的日期
     * @return String
     */
    public static String getLastDayOfMonth() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_MONTH, 1);
        cld.add(Calendar.MONTH, 1);
        cld.add(Calendar.DAY_OF_MONTH, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 上个月 第一天 的日期
     * @return String
     */
    public static String getFirstDayOfPreviousMonth() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_MONTH, 1);
        cld.add(Calendar.MONTH, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 上个月 最后一天 的日期
     * @return String
     */
    public static String getLastDayOfPreviousMonth() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_MONTH, 1);
        cld.add(Calendar.DAY_OF_MONTH, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 下个月 第一天 的日期
     * @return String
     */
    public static String getFirstDayOfNextMonth() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_MONTH, 1);
        cld.add(Calendar.MONTH, 1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 下个月 最后一天 的日期
     * @return String
     */
    public static String getLastDayOfNextMonth() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_MONTH, 1);
        cld.add(Calendar.MONTH, 2);
        cld.add(Calendar.DAY_OF_MONTH, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 指定年月 第一天 的日期
     * @param year
     * @param month
     * @return String
     */
    public static String getFirstDayByYearMonth(int year, int month) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.YEAR, year);
        cld.set(Calendar.MONTH, month - 1);
        cld.set(Calendar.DATE, 1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 指定年月 最后一天 的日期
     * @param year
     * @param month
     * @return String
     */
    public static String getLastDayByYearMonth(int year, int month) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.YEAR, year);
        cld.set(Calendar.MONTH, month - 1);
        cld.set(Calendar.DATE, 1);

        cld.add(Calendar.MONTH, 1);
        cld.add(Calendar.DATE, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 本年 第一天 的日期
     * @return String
     */
    public static String getFirstDayOfYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 本年 最后一天 的日期
     * @return String
     */
    public static String getLastDayOfYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.add(Calendar.YEAR, 1);
        cld.add(Calendar.DAY_OF_YEAR, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 去年 第一天 的日期
     * @return String
     */
    public static String getFirstDayOfPreviousYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.add(Calendar.YEAR, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 去年 最后一天 的日期
     * @return String
     */
    public static String getLastDayOfPreviousYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.add(Calendar.DAY_OF_YEAR, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得 明年 第一天 的日期
     * @return String
     */
    public static String getFirstDayOfNextYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.add(Calendar.YEAR, 1);
        return withDateFormat(cld.getTime());

    }

    /**
     * 获得 明年 最后一天 的日期
     * @return String
     */
    public static String getLastDayOfNextYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.add(Calendar.YEAR, 2);
        cld.add(Calendar.DAY_OF_YEAR, -1);
        return withDateFormat(cld.getTime());
    }

    /**
     * 获得本年共多少天
     * @return int
     */
    public static int getDaysOfYear() {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.roll(Calendar.DAY_OF_YEAR, -1);
        int days = cld.get(Calendar.DAY_OF_YEAR);
        return days;
    }

    /**
     * 获得指定年共多少天
     * @param year
     * @return int
     */
    public static int getDaysOfYear(int year) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.YEAR, year);
        cld.set(Calendar.DAY_OF_YEAR, 1);
        cld.roll(Calendar.DAY_OF_YEAR, -1);
        int days = cld.get(Calendar.DAY_OF_YEAR);
        return days;
    }

    /**
     * 获得本季度的 第一天
     * @param month
     * @return String
     */
    public static String getFirstDayOfSeason(int month) {
        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        int season = 1;
        if (month >= 1 && month <= 3) {
            season = 1;
        }
        if (month >= 4 && month <= 6) {
            season = 2;
        }
        if (month >= 7 && month <= 9) {
            season = 3;
        }
        if (month >= 10 && month <= 12) {
            season = 4;
        }
        int start_month = array[season - 1][0];

        String years = formatDate(getDate(), YYYY);
        int years_value = Integer.parseInt(years);

        int start_days = 1;
        String seasonDate = years_value + "-" + start_month + "-" + start_days;
        return seasonDate;
    }

    /**
     * 获得本季度的 最后一天
     * @param month
     * @return String
     */
    public static String getLastDayOfSeason(int month) {
        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        int season = 1;
        if (month >= 1 && month <= 3) {
            season = 1;
        }
        if (month >= 4 && month <= 6) {
            season = 2;
        }
        if (month >= 7 && month <= 9) {
            season = 3;
        }
        if (month >= 10 && month <= 12) {
            season = 4;
        }
        int end_month = array[season - 1][2];

        String years = formatDate(getDate(), YYYY);
        int years_value = Integer.parseInt(years);

        int end_days = getLastDayOfMonth(years_value, end_month);
        String seasonDate = years_value + "-" + end_month + "-" + end_days;
        return seasonDate;
    }

    /**
     * 获取某年某月的最后一天
     * @param year
     * @param month
     * @return int
     */
    public static int getLastDayOfMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    /**
     * 获取指定年月的天数
     * @param year
     * @param month
     * @return int
     */
    public static int getLastDayOfMonth(String year, String month) {
        if ("01".equals(month) || "03".equals(month) || "05".equals(month)
                || "07".equals(month) || "08".equals(month)
                || "1".equals(month) || "3".equals(month) || "5".equals(month)
                || "7".equals(month) || "8".equals(month) || "10".equals(month)
                || "12".equals(month)) {
            return 31;
        }
        if ("04".equals(month) || "06".equals(month) || "09".equals(month)
                || "4".equals(month) || "6".equals(month) || "9".equals(month)
                || "11".equals(month)) {
            return 30;
        }
        if ("02".equals(month) || "2".equals(month)) {
            if (isLeapYear(Integer.parseInt(year))) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    /**
     * 获取指定年月的天数
     * @param yearMonth
     * @return int
     */
    public static int getDaysOfMonth(String yearMonth, String regex) {
        if (yearMonth != null && !"".equals(yearMonth)) {
            String[] yearMonths = yearMonth.split(regex);
            String year = yearMonths[0];
            String month = yearMonths[1];
            return getLastDayOfMonth(year, month);
        } else {
            return 0;
        }
    }

    /**
     * 获取当前年月天数
     * @return int
     */
    public static int getDaysOfCurrentMonth() {
        String year = getYYYY();
        String month = getMM();
        return getLastDayOfMonth(year, month);
    }

    /**
     * 是否闰年
     * @param year
     * @return boolean
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * 获取当前日期是星期几
     * @return String
     */
    public static String getWeek() {
        return findWeekStr(findWeek(getDate()));
    }

    /**
     * 获取指定日期是星期几
     * @param date
     * @return String
     */
    public static String getWeek(Date date) {
        return findWeekStr(findWeek(date));
    }

    /**
     * 获取代表星期的数字
     * @param date
     * @return String
     */
    public static int findWeek(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        return cld.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 将代表星期的数字转换成汉字
     * @param week
     * @return String
     */
    private static String findWeekStr(int week) {
        String weekStr = "";
        switch (week) {
            case 1:
                weekStr = "星期日";
                break;
            case 2:
                weekStr = "星期一";
                break;
            case 3:
                weekStr = "星期二";
                break;
            case 4:
                weekStr = "星期三";
                break;
            case 5:
                weekStr = "星期四";
                break;
            case 6:
                weekStr = "星期五";
                break;
            case 7:
                weekStr = "星期六";
                break;
            default:
                weekStr = "";
        }
        return weekStr;
    }

    /**
     * 计算一天内的工作时长(以分钟为单位)
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return double
     */
    public static double calculateTimes_Minute(Date startTime, Date endTime) {
        if (startTime != null && endTime != null) {
            int startHour = startTime.getHours();
            int startMinute = startTime.getMinutes();
            int endHour = endTime.getHours();
            int endMinute = endTime.getMinutes();

            Date dateMin = getMinDate(endHour, endMinute, 0, 12, 0, 0);
            Date dateMax = getMaxDate(startHour, startMinute, 0, 9, 0, 0);
            double am1 = getMinuteFromTwoDate(dateMax.getHours(), dateMax
                    .getMinutes(), 0, dateMin.getHours(), dateMin.getMinutes(),
                    0, true);
            double am = max(0, am1);

            Date dateMin2 = getMinDate(endHour, endMinute, 0, 18, 0, 0);
            Date dateMax2 = getMaxDate(startHour, startMinute, 0, 13, 0, 0);
            double pm1 = getMinuteFromTwoDate(dateMax2.getHours(), dateMax2
                    .getMinutes(), 0, dateMin2.getHours(), dateMin2
                    .getMinutes(), 0, true);
            double pm = max(0, pm1);

            return am + pm;
        }
        return 0;
    }

    /**
     * 计算一天内的工作时长(以小时为单位)
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return double
     */
    public static double calculateTimes_Hour(Date startTime, Date endTime) {
        double times = calculateTimes_Minute(startTime, endTime) / 60;
        return formatNumber(times);
    }

    /**
     * 计算两个日期间的工作时长（以小时为单位）
     * @param startDate 开始日期
     * @param endDate  结束日期
     * @return double
     */
    public static double calculateTimesOfTwoDate(Date startDate, Date endDate) {
        if (startDate != null && endDate != null)
            return calculateTimesOfTwoDate(startDate, endDate, startDate,
                    endDate);
        return 0;
    }

    /**
     * 计算两个日期间的工作时长（以小时为单位）
     * @param startDate 开始日期
     * @param endDate  结束日期
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return double
     */
    public static double calculateTimesOfTwoDate(Date startDate, Date endDate,
            Date startTime, Date endTime) {
        double times = 0;
        if (startDate != null && endDate != null && startTime != null
                && endTime != null) {
            int startHour = startTime.getHours();
            int startMinute = startTime.getMinutes();
            int endHour = endTime.getHours();
            int endMinute = endTime.getMinutes();

            long count = getDaysFromTwoDate(startDate, endDate, false);

            Date dateMin = getMinDate(endHour, endMinute, 0, 12, 0, 0);
            Date dateMax = getMaxDate(startHour, startMinute, 0, 9, 0, 0);
            double am1 = getHourFromTwoDate(dateMax.getHours(), dateMax
                    .getMinutes(), 0, dateMin.getHours(), dateMin.getMinutes(),
                    0, true);
            double am = max(0, am1);

            Date dateMin2 = getMinDate(endHour, endMinute, 0, 18, 0, 0);
            Date dateMax2 = getMaxDate(startHour, startMinute, 0, 13, 0, 0);
            double pm1 = getHourFromTwoDate(dateMax2.getHours(), dateMax2
                    .getMinutes(), 0, dateMin2.getHours(), dateMin2
                    .getMinutes(), 0, true);
            double pm = max(0, pm1);

            double hours9 = getHourFromTwoDate(endHour, endMinute, 0, 9, 0, 0,
                    false);
            double hours12 = getHourFromTwoDate(startHour, startMinute, 0, 12,
                    0, 0, false);
            double hours13 = getHourFromTwoDate(endHour, endMinute, 0, 13, 0,
                    0, false);
            double hours18 = getHourFromTwoDate(startHour, startMinute, 0, 18,
                    0, 0, false);
            // 开始日期
            double starttimes = 0;
            if (startHour < 12) {
                starttimes = hours12 + 5;
            } else if (startHour >= 13 && startHour < 18) {
                starttimes = hours18;
            } else if (startHour == 12) {
                starttimes = hours18 - 1;
            } else {
                starttimes = 0;
            }
            // 结束日期
            double endtimes = 0;
            if (endHour < 12) {
                endtimes = hours9;
            } else if (endHour >= 13 && endHour < 18) {
                endtimes = (3 + hours13);
            } else if (endHour == 12) {
                endtimes = 3;
            } else {
                endtimes = 8;
            }

            if (count == 0) { // 同一天
                times = am + pm;
            } else if (count == 1) { // 相邻的两天
                times = starttimes + endtimes;
            } else if (count > 1) { // 相隔的两个日期
                times += starttimes + (count - 1) * 8 + endtimes;
            }
        }
        return times;
    }

    /**
     * 计算年龄
     * @param birthday
     * @return
     */
    public static int calculateAge(Date birthday) {
        int age = 0;
        if (birthday != null) {
            age = getYear() - getYear(birthday);
        }
        return age;
    }
    
    /**
     * 计算年龄
     * @param birthday
     * @return
     */
    public static int calculateAge(String birthday) {
        int age = 0;
        if (birthday != null && !"".equals(birthday)) {
            age = getYear() - getYear(birthday);
        }
        return age;
    }

    /**
     * 计算从beginDate到endDate的工作日，休息日，自然日(例如要查2个月之间的工作日和休息日)
     * ————work_rest_all("2009-03-01", "2009-04-01");
     * @param beginDate 开始时间(包括——如果开始时间为null，默认开始时间为现在)
     * @param endDate 结束时间(不包括)
     * @return int[] - [0]工作日/[1]休息日/[2]自然日——总天数
     */
    public static int[] work_rest_all(String beginDate, String endDate) {
        // 代表自然日（一天就代表一个自然日）
        int natureDay = 0;
        // 代表休息日，假定周六周日休息
        int restDay = 0;

        // 如果开始时间为空，则为当前日期
        Calendar now = Calendar.getInstance();
        if (beginDate != null) {
            now.setTime(str2Date(beginDate));
        }

        Calendar end = Calendar.getInstance();
        if (endDate != null) {
            end.setTime(str2Date(endDate));
        }

        while (!now.after(end)) {
            if (now.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                    || now.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                restDay++;
            }
            ++natureDay;
            now.add(Calendar.DAY_OF_YEAR, 1);
        }
        int[] result = { natureDay - restDay, restDay, natureDay };
        return result;
    }

    private static double min(double start, double end) {
        return (start < end) ? start : end;
    }

    private static double max(double start, double end) {
        return (start > end) ? start : end;
    }

    private static double formatNumber(double number) {
        double new_number = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        String str = df.format(number);
        if (str != null && !"".equals(str))
            new_number = Double.parseDouble(str);
        return new_number;
    }
}