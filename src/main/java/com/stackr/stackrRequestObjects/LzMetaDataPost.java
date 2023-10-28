package com.stackr.stackrRequestObjects;

public class LzMetaDataPost {
    private String lzName;
    private String subscriptionId;

    public LzMetaDataPost() {
        super();
    }

    public LzMetaDataPost(String lzName, String subscriptionId) {
        super();
        this.lzName = lzName;
        this.subscriptionId = subscriptionId;
    }

    @Override
    public String toString() {
        return "LzMetaDataPost [lzName=" + lzName + ", subscriptionId=" + subscriptionId + "]";
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
}
