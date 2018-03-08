package com.byteowls.vaadin.chartjs.options.scale;

import com.byteowls.vaadin.chartjs.utils.And;
import com.byteowls.vaadin.chartjs.utils.JUtils;
import com.byteowls.vaadin.chartjs.utils.JsonBuilder;

import elemental.json.Json;
import elemental.json.JsonObject;

/**
 * 
 * The following display formats are used to configure how different time units are formed into strings for the axis tick marks.
 *  
 */
public class TimeDisplayFormat extends And<TimeScaleOptions> implements JsonBuilder {
    
    private String millisecond;
    private String second;
    private String minute;  
    private String hour;    
    private String day;     
    private String week;    
    private String month;   
    private String quarter; 
    private String year;

    public TimeDisplayFormat(TimeScaleOptions parent) {
        super(parent);
    }
    
    /**
     * Defaults to 'SSS [ms]'
     */
    public TimeDisplayFormat millisecond(String millisecond) {
        this.millisecond = millisecond;
        return this;
    }
    
    /**
     * Defaults to 'h:mm:ss a'
     */
    public TimeDisplayFormat second(String second) {
        this.second = second;
        return this;
    }
    
    /**
     * Defaults to 'h:mm:ss a'
     */
    public TimeDisplayFormat minute(String minute) {
        this.minute = minute;
        return this;
    }
    
    /**
     * Defaults to 'MMM D, hA'
     */
    public TimeDisplayFormat hour(String hour) {
        this.hour = hour;
        return this;
    }
    
    /**
     * Defaults to 'll'
     */
    public TimeDisplayFormat day(String day) {
        this.day = day;
        return this;
    }
    
    /**
     * Defaults to 'll'
     */
    public TimeDisplayFormat week(String week) {
        this.week = week;
        return this;
    }
    
    /**
     * Defaults to 'MMM YYYY'
     */
    public TimeDisplayFormat month(String month) {
        this.month = month;
        return this;
    }
    
    /**
     * Defaults to '[Q]Q - YYYY'
     */
    public TimeDisplayFormat quarter(String quarter) {
        this.quarter = quarter;
        return this;
    }
    
    /**
     * Defaults to 'YYYY'
     */
    public TimeDisplayFormat year(String year) {
        this.year = year;
        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonObject map = Json.createObject();
        JUtils.putNotNull(map, "millisecond", millisecond);
        JUtils.putNotNull(map, "second", second);
        JUtils.putNotNull(map, "minute", minute);
        JUtils.putNotNull(map, "hour", hour);
        JUtils.putNotNull(map, "day", day);
        JUtils.putNotNull(map, "week", week);
        JUtils.putNotNull(map, "month", month);
        JUtils.putNotNull(map, "quarter", quarter);
        JUtils.putNotNull(map, "year", year);
        return map;
    }
    

}