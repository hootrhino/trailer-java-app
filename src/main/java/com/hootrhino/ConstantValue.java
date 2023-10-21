package com.hootrhino;

import com.google.common.collect.Lists;
import trailer.RulexTrailer;

import java.util.ArrayList;

public class ConstantValue {
    public static ArrayList<ConstantValue> list = Lists.newArrayList();
    static {
        list.add(new ConstantValue("temp", RulexTrailer.ValueType.NUMBER, "温度", "15.34"));
        list.add(new ConstantValue("humi", RulexTrailer.ValueType.NUMBER, "湿度", "65"));
        list.add(new ConstantValue("co2", RulexTrailer.ValueType.NUMBER, "二氧化碳", "13.5"));
        list.add(new ConstantValue("weather", RulexTrailer.ValueType.STRING, "天气", "SUNNY"));
        list.add(new ConstantValue("点位1", RulexTrailer.ValueType.NUMBER, "点位1参数", "23.15"));
        list.add(new ConstantValue("点位2", RulexTrailer.ValueType.NUMBER, "点位2参数", "23.25"));
        list.add(new ConstantValue("点位3", RulexTrailer.ValueType.NUMBER, "点位3参数", "23.35"));
        list.add(new ConstantValue("点位4", RulexTrailer.ValueType.NUMBER, "点位4参数", "23.45"));
        list.add(new ConstantValue("点位5", RulexTrailer.ValueType.NUMBER, "点位5参数", "23.55"));
        list.add(new ConstantValue("点位6", RulexTrailer.ValueType.NUMBER, "点位6参数", "23.65"));
        list.add(new ConstantValue("点位7", RulexTrailer.ValueType.NUMBER, "点位7参数", "23.75"));
        list.add(new ConstantValue("点位8", RulexTrailer.ValueType.NUMBER, "点位8参数", "23.85"));
        list.add(new ConstantValue("点位9", RulexTrailer.ValueType.NUMBER, "点位9参数", "23.95"));
        list.add(new ConstantValue("点位10", RulexTrailer.ValueType.NUMBER, "点位10参数", "65530"));
        list.add(new ConstantValue("点位11", RulexTrailer.ValueType.NUMBER, "点位11参数", "65531"));
        list.add(new ConstantValue("点位12", RulexTrailer.ValueType.NUMBER, "点位12参数", "65532"));
        list.add(new ConstantValue("点位13", RulexTrailer.ValueType.NUMBER, "点位13参数", "65533"));
        list.add(new ConstantValue("点位14", RulexTrailer.ValueType.NUMBER, "点位14参数", "65534"));
        list.add(new ConstantValue("点位15", RulexTrailer.ValueType.NUMBER, "点位15参数", "65535"));
        list.add(new ConstantValue("点位16", RulexTrailer.ValueType.NUMBER, "点位16参数", "65536"));
        list.add(new ConstantValue("点位17", RulexTrailer.ValueType.NUMBER, "点位17参数", "65537"));
        list.add(new ConstantValue("点位18", RulexTrailer.ValueType.NUMBER, "点位18参数", "65538"));
        list.add(new ConstantValue("点位19", RulexTrailer.ValueType.NUMBER, "点位19参数", "65539"));

    }

    private String name;
    private RulexTrailer.ValueType type;
    private String description;
    private String value;

    public ConstantValue(String name, RulexTrailer.ValueType type, String desc, String value) {
        this.name = name;
        this.type = type;
        this.description =desc;
        this.value  = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RulexTrailer.ValueType getType() {
        return type;
    }

    public void setType(RulexTrailer.ValueType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
