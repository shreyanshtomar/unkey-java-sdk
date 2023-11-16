package com.unkey.dtos;

public class KeyRateLimit {
    private String type;
    private int limit;
    private int refillRate;
    private int refillInterval;

    public KeyRateLimit() {
    }

    public KeyRateLimit(String type, int limit, int refillRate, int refillInterval) {
        this.type = type;
        this.limit = limit;
        this.refillRate = refillRate;
        this.refillInterval = refillInterval;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getRefillRate() {
        return refillRate;
    }

    public void setRefillRate(int refillRate) {
        this.refillRate = refillRate;
    }

    public int getRefillInterval() {
        return refillInterval;
    }

    public void setRefillInterval(int refillInterval) {
        this.refillInterval = refillInterval;
    }
}
