package tst.project.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils {
	
	/**
	 * 欧联专有方法
	 * @return
	 */
	public static String getAchTime(String cur_time){
		if(cur_time.indexOf("01-01")>=0){
			cur_time=cur_time.replace("01-01", "01-01");
		}else if(cur_time.indexOf("02-01")>=0){
			cur_time=cur_time.replace("02-01", "01-01");
		}else if(cur_time.indexOf("03-01")>=0){
			cur_time=cur_time.replace("03-01", "01-01");
		}else if(cur_time.indexOf("04-01")>=0){
			cur_time=cur_time.replace("04-01", "04-01");
		}else if(cur_time.indexOf("05-01")>=0){
			cur_time=cur_time.replace("05-01", "04-01");
		}else if(cur_time.indexOf("06-01")>=0){
			cur_time=cur_time.replace("06-01", "04-01");
		}else if(cur_time.indexOf("07-01")>=0){
			cur_time=cur_time.replace("07-01", "07-01");
		}else if(cur_time.indexOf("08-01")>=0){
			cur_time=cur_time.replace("08-01", "07-01");
		}else if(cur_time.indexOf("09-01")>=0){
			cur_time=cur_time.replace("09-01", "07-01");
		}else if(cur_time.indexOf("10-01")>=0){
			cur_time=cur_time.replace("10-01", "10-01");
		}else if(cur_time.indexOf("11-01")>=0){
			cur_time=cur_time.replace("11-01", "10-01");
		}else if(cur_time.indexOf("12-01")>=0){
			cur_time=cur_time.replace("12-01", "10-01");
		}
		return cur_time;
	}
	
	
	/**
	 * 获得上几个月时间
	 * @return
	 */
	public static String getLastMonthBegin(String format,int count){
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
  
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - count); // 设置为上一个月
        date = calendar.getTime();
 
        return dateFormat.format(date);
	}
	/**
	 * 由出生日期获得年龄  
	 * @param birthDay
	 * @return
	 * @throws Exception
	 */
    public static int getAge(String birthDay,String formal) throws Exception {  
    	Date date=getDateFromTime(formal,birthDay);
    	
        Calendar cal = Calendar.getInstance();  
        if (cal.before(birthDay)) {  
            throw new IllegalArgumentException(  
                    "The birthDay is before Now.It's unbelievable!");  
        }  
        int yearNow = cal.get(Calendar.YEAR);  
        int monthNow = cal.get(Calendar.MONTH);  
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);  
        cal.setTime(date);  
  
        int yearBirth = cal.get(Calendar.YEAR);  
        int monthBirth = cal.get(Calendar.MONTH);  
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);  
  
        int age = yearNow - yearBirth;  
  
        if (monthNow <= monthBirth) {  
            if (monthNow == monthBirth) {  
                if (dayOfMonthNow < dayOfMonthBirth) age--;  
            }else{  
                age--;  
            }  
        }  
        return age;  
    }  
    
	/**
	 * 根据当前日期获得上周的开始时间
	 * 
	 * @return
	 * @author zhaoxuepu
	 */
	public static String getLastWeekBegin(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar1 = Calendar.getInstance();
		int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK) - 1;
		int offset1 = 1 - dayOfWeek;
		calendar1.add(Calendar.DATE, offset1 - 7);
		String lastBeginDate = sdf.format(calendar1.getTime());
		return lastBeginDate ;
	}
	/**
	 * 根据当前日期获得上周的结束时间
	 * 
	 * @return
	 * @author zhaoxuepu
	 */
	public static String getLastWeekEnd(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK) - 1;
		int offset2 = 7 - dayOfWeek;
		calendar2.add(Calendar.DATE, offset2 - 7);
		String lastEndDate = sdf.format(calendar2.getTime());
		return lastEndDate;
	}
	
	/**
	 * 今天在当前月中的第几天
	 * 
	 * @return
	 */
	public static int getDayWithMonth() {
		Date date = new Date();
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		int a = ca.get(Calendar.DAY_OF_MONTH);
		return a;
	}

	/**
	 * 今天在当前年中的第几天
	 * 
	 * @return
	 */
	public static int getDayWithYear() {
		Date date = new Date();
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		int i = ca.get(Calendar.DAY_OF_YEAR);
		return i;
	}

	/**
	 * 当前月最后一天
	 */
	public static String getCurMonthLastDay(String format) {
		DateFormat df = new SimpleDateFormat(format);
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
		String last = df.format(ca.getTime());
		return last;
	}

	/**
	 * 2个时间比大小
	 * 
	 * @param time1
	 * @param time2
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static int compareDate(String time1, String time2, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		java.util.Date d1 = df.parse(time1);
		java.util.Date d2 = df.parse(time2);

		if (d1.getTime() > d2.getTime()) {
			return 1;
		} else if (d1.getTime() < d2.getTime()) {
			return -1;
		} else {// 相等
			return 0;
		}
	}

	/**
	 * 2个时间相差天数
	 * 
	 * @param time1
	 * @param time2
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static int getDayCompareDate(String time1, String time2, String format) throws ParseException {
		try{
			DateFormat df = new SimpleDateFormat(format);
			java.util.Date d1 = df.parse(time1);
			java.util.Date d2 = df.parse(time2);
	
			long mis=d1.getTime()-d2.getTime();
			return (int) (mis/(24*60*60*1000));
		}catch(Exception e){
			return -1;
		}
	}
	
	/**
	 * 2个时间相差小时
	 * 
	 * @param time1
	 * @param time2
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static int getHourCompareDate(String time1, String time2, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		java.util.Date d1 = df.parse(time1);
		java.util.Date d2 = df.parse(time2);

		long mis=d1.getTime()-d2.getTime();
		return (int) (mis/(60*60*1000));
	}
	
	/**
	 * 2个时间相差分钟
	 * 
	 * @param time1
	 * @param time2
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static int getMinCompareDate(String time1, String time2, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		java.util.Date d1 = df.parse(time1);
		java.util.Date d2 = df.parse(time2);

		long mis=d1.getTime()-d2.getTime();
		return (int) (mis/(60*1000));
	}
	/**
	 * 2个时间相差毫秒数
	 * 
	 * @param time1
	 * @param time2
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static int getSecCompareDate(String time1, String time2, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		java.util.Date d1 = df.parse(time1);
		java.util.Date d2 = df.parse(time2);

		long mis=d1.getTime()-d2.getTime();
		return (int) (mis/1000);
	}
	
	/**
	 * 时间转毫秒数
	 */
	public static String getMsecFromData(String dateTime, String format) {
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(new SimpleDateFormat(format).parse(dateTime));
			return c.getTimeInMillis() + "";
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 毫秒数转时间
	 * 
	 * @param sstime
	 * @param format
	 * @return
	 */
	public static String getDataByMsec(String sstime, String format) {
		try {
			Date date = new Date(sstime);
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}

	/**
	 * 毫秒数转时间
	 * 
	 * @return
	 */
	public static String getTimeFromMis(long mis, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);// 设置日期格式
		String time = df.format(new Date(mis));
		return time;
	}

	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getCurrentTime(String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);// 设置日期格式
		String time = df.format(new Date());
		return time;
	}

	/**
	 * 字符串转date
	 * 
	 * @param formal
	 * @param time
	 * @return
	 */
	public static Date getDateFromTime(String format, String time) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);// 小写的mm表示的是分钟
		Date date = null;
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获得某个时间后几天的时间
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static String getTimeDayAfter(String format, Date date, int day) {
		SimpleDateFormat dft = new SimpleDateFormat(format);// 设置日期格式

		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) + day);

		return dft.format(now.getTime());
	}

	/**
	 * 获得某个时间后几天的时间(毫秒数)
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static long getMisDayAfter(Date date, int day) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) + day);

		return now.getTime().getTime();
	}
	/**
	 * 获得某个时间后几个小时的时间(毫秒数)
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static long getMisHoureAfter(Date date, int houre) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) + houre);

		return now.getTime().getTime();
	}

	/**
	 * 获得某个时间后几个小时的时间
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static String getTimeHoursAfter(String format, Date date, int hour) {
		SimpleDateFormat dft = new SimpleDateFormat(format);// 设置日期格式

		Calendar dar = Calendar.getInstance();
		dar.setTime(date);
		dar.add(java.util.Calendar.HOUR_OF_DAY, hour);

		return dft.format(dar.getTime());
	}
	/**
	 * 获得某个时间后几个小时的时间
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static String getTimeHoursAfter(String format, String time, int hour) {
		Date date=getDateFromTime(format, time);
		SimpleDateFormat dft = new SimpleDateFormat(format);// 设置日期格式
		Calendar dar = Calendar.getInstance();
		dar.setTime(date);
		dar.add(java.util.Calendar.HOUR, hour);

		return dft.format(dar.getTime());
	}

	/**
	 * 获得某个时间后几分钟的时间
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static String getTimeMinuteAfter(String format, Date date, int minute) {
		SimpleDateFormat dft = new SimpleDateFormat(format);// 设置日期格式

		Calendar dar = Calendar.getInstance();
		dar.setTime(date);
		dar.add(java.util.Calendar.MINUTE, minute);

		return dft.format(dar.getTime());
	}
	
	/**
	 * 获得某个时间后几分钟的时间
	 * 
	 * @param format
	 *            时间格式
	 * @param time
	 *            当前时间
	 * @return
	 */
	public static String getTimeMinuteAfter(String format, String time, int minute) {
		Date date=getDateFromTime(format, time);
		SimpleDateFormat dft = new SimpleDateFormat(format);// 设置日期格式
		Calendar dar = Calendar.getInstance();
		dar.setTime(date);
		dar.add(java.util.Calendar.MINUTE, minute);

		return dft.format(dar.getTime());
	}
	
	/**
	 * 时间格式转化
	 * 
	 * @param time
	 *        转化的时间
	 * 
	 * @param format
	 *        转化前的格式
	 *        
	 * @param format1
	 *        转化后的格式
	 * @return
	 * @throws ParseException 
	 */
    public static String dateFormatConversion(String time,String beforeFormat,String afterFormat) throws ParseException {
    	
    	SimpleDateFormat format = new SimpleDateFormat(beforeFormat);
		Date date = format.parse(time);//有异常要捕获
        format = new SimpleDateFormat(afterFormat);
		String newD = format.format(date);
		return newD;
    }
    
}
