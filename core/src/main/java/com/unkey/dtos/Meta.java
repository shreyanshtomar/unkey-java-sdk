package com.unkey.dtos;
import java.util.Map;

public class Meta {
    private Map<String, String> stringStringMap;

    public Meta(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }
}
