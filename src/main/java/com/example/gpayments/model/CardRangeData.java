package com.example.gpayments.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CardRangeData {

    private String cardBINStartRange;
    private String cardBINEndRange;
    private String actionInd;
    private String acsEndProtocolVersion;
    private String threeDSMessageUrl;
    private String acsStartProtocolVersion;
    private List<String> acsInfoInd;
    // private String primaryAccountNumber;


    public String getCardBINStartRange() {
        return cardBINStartRange;
    }

    public void setCardBINStartRange(String cardBINStartRange) {
        this.cardBINStartRange = cardBINStartRange;
    }

    public String getCardBINEndRange() {
        return cardBINEndRange;
    }

    public void setCardBINEndRange(String cardBINEndRange) {
        this.cardBINEndRange = cardBINEndRange;
    }

    public String getThreeDSMessageUrl() {
        return threeDSMessageUrl;
    }

    public void setThreeDSMessageUrl(String threeDSMessageUrl) {
        this.threeDSMessageUrl = threeDSMessageUrl;
    }

 /*   public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }*/

    public String getActionInd() {
        return actionInd;
    }

    public void setActionInd(String actionInd) {
        this.actionInd = actionInd;
    }

    public List<String> getAcsInfoInd() {
        return acsInfoInd;
    }

    public void setAcsInfoInd(List<String> acsInfoInd) {
        this.acsInfoInd = acsInfoInd;
    }

    public String getAcsEndProtocolVersion() {
        return acsEndProtocolVersion;
    }

    public void setAcsEndProtocolVersion(String acsEndProtocolVersion) {
        this.acsEndProtocolVersion = acsEndProtocolVersion;
    }

    public String getAcsStartProtocolVersion() {
        return acsStartProtocolVersion;
    }

    public void setAcsStartProtocolVersion(String acsStartProtocolVersion) {
        this.acsStartProtocolVersion = acsStartProtocolVersion;
    }

    public CardRangeData() {
    }

    public CardRangeData(String cardBINStartRange, String cardBINEndRange, String actionInd, String acsEndProtocolVersion, String threeDSMessageUrl, String acsStartProtocolVersion, List<String> acsInfoInd) {
        this.cardBINStartRange = cardBINStartRange;
        this.cardBINEndRange = cardBINEndRange;
        this.actionInd = actionInd;
        this.acsEndProtocolVersion = acsEndProtocolVersion;
        this.threeDSMessageUrl = threeDSMessageUrl;
        this.acsStartProtocolVersion = acsStartProtocolVersion;
        this.acsInfoInd = acsInfoInd;
    }

    public CardRangeData(String cardBINStartRange, String cardBINEndRange, String actionInd, String acsEndProtocolVersion, String acsStartProtocolVersion, List<String> acsInfoInd) {
        this.cardBINStartRange = cardBINStartRange;
        this.cardBINEndRange = cardBINEndRange;
        this.actionInd = actionInd;
        this.acsEndProtocolVersion = acsEndProtocolVersion;
        this.acsStartProtocolVersion = acsStartProtocolVersion;
        this.acsInfoInd = acsInfoInd;
    }

    @Override
    public String toString() {
        return "CardRangeData{" +
                "cardBINStartRange='" + cardBINStartRange + '\'' +
                ", cardBINEndRange='" + cardBINEndRange + '\'' +
                ", actionInd='" + actionInd + '\'' +
                ", acsEndProtocolVersion='" + acsEndProtocolVersion + '\'' +
                ", threeDSMessageUrl='" + threeDSMessageUrl + '\'' +
                ", acsStartProtocolVersion='" + acsStartProtocolVersion + '\'' +
                ", acsInfoInd=" + acsInfoInd +
                '}';
    }

}
