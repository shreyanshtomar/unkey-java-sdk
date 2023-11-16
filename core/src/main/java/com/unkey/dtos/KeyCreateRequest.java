package com.unkey.dtos;

public class KeyCreateRequest {
    private String apiId;
    private String prefix;
    private String name;
    private int byteLength;
    private String ownerId;
    private Meta meta;
    private int expires;
    private int remaining;
    private KeyRateLimit ratelimit;

    public KeyCreateRequest() {
    }

    public KeyCreateRequest(String apiId, String prefix, int byteLength, String ownerId, long expires, Meta meta, KeyRateLimit ratelimit, int remaining) {
        this.apiId = apiId;
        this.prefix = prefix;
        this.byteLength = byteLength;
        this.ownerId = ownerId;
        this.expires = expires;
        this.meta = meta;
        this.ratelimit = ratelimit;
        this.remaining = remaining;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getByteLength() {
        return byteLength;
    }

    public void setByteLength(int byteLength) {
        this.byteLength = byteLength;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public long getExpires() {
        return expires;
    }

    public void setExpires(long expires) {
        this.expires = expires;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public KeyRateLimit getRatelimit() {
        return ratelimit;
    }

    public void setRatelimit(KeyRateLimit ratelimit) {
        this.ratelimit = ratelimit;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }
}
