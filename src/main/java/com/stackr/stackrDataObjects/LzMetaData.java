package com.stackr.stackrDataObjects;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lzMetaData")
public class LzMetaData {
    private String lzId;
    private String lzName;
    private String subscriptionId;

    public LzMetaData() {
        super();
    }

    public LzMetaData(String lzName, String subscriptionId) {
        super();
        this.lzId = UUID.randomUUID().toString();
        this.lzName = lzName;
        this.subscriptionId = subscriptionId;
    }

    @Override
    public String toString() {
        return "LzMetaData [lzId=" + lzId + ", lzName=" + lzName + ", subscriptionId=" + subscriptionId + "]";
    }

    public String getLzName() {
        return lzName;
    }

    public void setLzName(String lzName) {
        this.lzName = lzName;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getLzId() {
        return lzId;
    }

    public void setLzId(String lzId) {
        this.lzId = lzId;
    }
}
