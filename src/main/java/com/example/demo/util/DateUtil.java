package com.example.demo.util;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateUtil {
    public Date createDateFromString(String stringDate) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        if (StringUtils.hasText(stringDate)) {
            try {
                date = format.parse(stringDate);
            } catch (ParseException e) {
                date = new Date();
            }
        } else date = new Date();

        return date;
    }
}
