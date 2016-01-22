package com.gsma.authenticators.model;

import java.io.Serializable;

 
public class MSSResponse implements Serializable {

    public String msisdnNo;
    public String responseStatus;

    public String getMsisdnNo() {
        return msisdnNo;
    }

    public void setMsisdnNo(String msisdnNo) {
        this.msisdnNo = msisdnNo;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }


}