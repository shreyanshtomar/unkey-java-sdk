package com.unkey;

import com.unkey.dtos.KeyCreateRequest;

public class Main {
    public static void main(String[] args) {
        String apiKey = "api_RwgrGsw4AYsKXHb5P9JmHV";
        KeyCreateRequest keyCreateRequest = new KeyCreateRequest();
        keyCreateRequest.setApiId(apiKey);
        keyCreateRequest.setPrefix("test");
        keyCreateRequest.setByteLength(32);
        keyCreateRequest.setOwnerId("owner_1");
        keyCreateRequest.setExpires(0);
        keyCreateRequest.setMeta(null);
        keyCreateRequest.setRatelimit(null);
        keyCreateRequest.setRemaining(4);

        System.out.println("Hello world!");
    }
}