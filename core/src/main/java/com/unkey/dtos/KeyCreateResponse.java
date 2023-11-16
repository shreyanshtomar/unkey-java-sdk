package com.unkey.dtos;

public class KeyCreateResponse {
    private String key;
    private String keyId;

    public KeyCreateResponse(String key, String keyId) {
        this.key = key;
        this.keyId = keyId;
    }
    public KeyCreateResponse() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
}
