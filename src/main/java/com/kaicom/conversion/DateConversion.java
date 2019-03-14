package com.kaicom.conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


public class DateConversion implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
