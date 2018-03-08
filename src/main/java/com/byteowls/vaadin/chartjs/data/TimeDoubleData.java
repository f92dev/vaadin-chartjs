package com.byteowls.vaadin.chartjs.data;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.byteowls.vaadin.chartjs.utils.JUtils;
import com.byteowls.vaadin.chartjs.utils.JsonBuilder;

import elemental.json.Json;
import elemental.json.JsonObject;

public class TimeDoubleData implements JsonBuilder, Serializable {

	private static final long serialVersionUID = -1976874948565604978L;
	private static final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	private Date x;
	private Double y;

	/**
	 * X Value
	 */
	public TimeDoubleData x(Date x) {
		this.x = x;
		return this;
	}

	/**
	 * Y Value
	 */
	public TimeDoubleData y(Double y) {
		this.y = y;
		return this;
	}

	@Override
	public JsonObject buildJson() {
		JsonObject obj = Json.createObject();
		JUtils.putNotNull(obj, "x", formatter.format(x));
		JUtils.putNotNull(obj, "y", y);
		return obj;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}
