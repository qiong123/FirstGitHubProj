package com.bdqn.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
	public static void main(String[] args) throws ParseException {
		String time1 = "2018-10-11";
		String time2= "2018-10-05";
		//�������ַ���ת����Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1= sdf.parse(time1);
		Date d2 = sdf.parse(time2);
		//��ʱ���
		//�����  long ������  getTime():��ȡ1970-1-1�����ڵ�ǰʱ��ĺ�����
		int day =(int) ((d1.getTime()-d2.getTime())/1000/60/60/24);
		System.out.println(day);
	}
}
