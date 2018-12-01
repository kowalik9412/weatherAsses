package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.model;

import java.io.Serializable;

public class ForecastCondition implements Serializable {

    private String val1_temp;
    private String val1_temp_min;
    private String val1_temp_max;
    private String val1_humidity;

    private String val2_temp;
    private String val2_temp_min;
    private String val2_temp_max;
    private String val2_humidity;

    private String val3_temp;
    private String val3_temp_min;
    private String val3_temp_max;
    private String val3_humidity;

    public ForecastCondition() {

    }

    public String getVal1_temp() {
        return val1_temp;
    }

    public void setVal1_temp(String val1_temp) {
        this.val1_temp = val1_temp;
    }

    public String getVal1_temp_min() {
        return val1_temp_min;
    }

    public void setVal1_temp_min(String val1_temp_min) {
        this.val1_temp_min = val1_temp_min;
    }

    public String getVal1_temp_max() {
        return val1_temp_max;
    }

    public void setVal1_temp_max(String val1_temp_max) {
        this.val1_temp_max = val1_temp_max;
    }

    public String getVal1_humidity() {
        return val1_humidity;
    }

    public void setVal1_humidity(String val1_humidity) {
        this.val1_humidity = val1_humidity;
    }

    public String getVal2_temp() {
        return val2_temp;
    }

    public void setVal2_temp(String val2_temp) {
        this.val2_temp = val2_temp;
    }

    public String getVal2_temp_min() {
        return val2_temp_min;
    }

    public void setVal2_temp_min(String val2_temp_min) {
        this.val2_temp_min = val2_temp_min;
    }

    public String getVal2_temp_max() {
        return val2_temp_max;
    }

    public void setVal2_temp_max(String val2_temp_max) {
        this.val2_temp_max = val2_temp_max;
    }

    public String getVal2_humidity() {
        return val2_humidity;
    }

    public void setVal2_humidity(String val2_humidity) {
        this.val2_humidity = val2_humidity;
    }

    public String getVal3_temp() {
        return val3_temp;
    }

    public void setVal3_temp(String val3_temp) {
        this.val3_temp = val3_temp;
    }

    public String getVal3_temp_min() {
        return val3_temp_min;
    }

    public void setVal3_temp_min(String val3_temp_min) {
        this.val3_temp_min = val3_temp_min;
    }

    public String getVal3_temp_max() {
        return val3_temp_max;
    }

    public void setVal3_temp_max(String val3_temp_max) {
        this.val3_temp_max = val3_temp_max;
    }

    public String getVal3_humidity() {
        return val3_humidity;
    }

    public void setVal3_humidity(String val3_humidity) {
        this.val3_humidity = val3_humidity;
    }
}
