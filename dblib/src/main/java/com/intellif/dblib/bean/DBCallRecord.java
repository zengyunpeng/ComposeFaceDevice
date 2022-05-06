package com.intellif.dblib.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class DBCallRecord {
    @Id(autoincrement = true)
    private Long id;
    String callNo;
    String callImagePath;
    String hungUpImagePath;
    int answerType;//0未知 1手机接听 2web接听 3Pad接听 4室内机接听
    int callState;//0 未知,  2 呼叫取消,3 呼叫超时,4 呼叫异常,6通话结束, 7通话超时 8 通话异常 9 拒绝接听
    long answerTime;//通话接听时间
    long endTime;//通话结束时间
    long openTime;//开门时间
    boolean hasUpload;//是否已上传
    int uploadFrequency;//上传次数

    @Generated(hash = 261293528)
    public DBCallRecord(Long id, String callNo, String callImagePath, String hungUpImagePath,
                        int answerType, int callState, long answerTime, long endTime, long openTime,
                        boolean hasUpload, int uploadFrequency) {
        this.id = id;
        this.callNo = callNo;
        this.callImagePath = callImagePath;
        this.hungUpImagePath = hungUpImagePath;
        this.answerType = answerType;
        this.callState = callState;
        this.answerTime = answerTime;
        this.endTime = endTime;
        this.openTime = openTime;
        this.hasUpload = hasUpload;
        this.uploadFrequency = uploadFrequency;
    }

    @Generated(hash = 2071671744)
    public DBCallRecord() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCallNo() {
        return this.callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getCallImagePath() {
        return this.callImagePath;
    }

    public void setCallImagePath(String callImagePath) {
        this.callImagePath = callImagePath;
    }

    public String getHungUpImagePath() {
        return this.hungUpImagePath;
    }

    public void setHungUpImagePath(String hungUpImagePath) {
        this.hungUpImagePath = hungUpImagePath;
    }

    public int getAnswerType() {
        return this.answerType;
    }

    public void setAnswerType(int answerType) {
        this.answerType = answerType;
    }

    public int getCallState() {
        return this.callState;
    }

    public void setCallState(int callState) {
        this.callState = callState;
    }

    public long getAnswerTime() {
        return this.answerTime;
    }

    public void setAnswerTime(long answerTime) {
        this.answerTime = answerTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getOpenTime() {
        return this.openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public boolean getHasUpload() {
        return this.hasUpload;
    }

    public void setHasUpload(boolean hasUpload) {
        this.hasUpload = hasUpload;
    }

    public int getUploadFrequency() {
        return this.uploadFrequency;
    }

    public void setUploadFrequency(int uploadFrequency) {
        this.uploadFrequency = uploadFrequency;
    }

    @Override
    public String toString() {
        return "DBCallRecord{" +
                "id=" + id +
                ", callNo='" + callNo + '\'' +
                ", callImagePath='" + callImagePath + '\'' +
                ", hungUpImagePath='" + hungUpImagePath + '\'' +
                ", answerType=" + answerType +
                ", callState=" + callState +
                ", answerTime=" + answerTime +
                ", endTime=" + endTime +
                ", openTime=" + openTime +
                ", hasUpload=" + hasUpload +
                ", uploadFrequency=" + uploadFrequency +
                '}';
    }
}
