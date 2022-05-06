package com.intellif.dblib.bean;

import android.graphics.Bitmap;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * CREATE BY HAORAN QIN
 * ON 2020/9/1
 * https://github.com/haoran1994
 */
@Entity
public class DBRecord {
    public static interface PassType {
        int FACE_PASS = 0;
        int IC_CRD_PASS = 1;
        int IC_CARD_FACE_PASS = 2;
        int QR_CODE_PASS = 3;
        int ID_CARD_FACE_PASS = 4;
        int ID_CARD_PASS = 5;
        int ID_CARD_FACE_INNER_DB_PASS = 6;
    }

    public static final Long ID_INVALID = -1L;
    @Id(autoincrement = true)
    private Long id;
    private String personId;
    private String name;
    private long recogizeTime;
    private float temp;
    private String imagePath;//抓拍照
    private String dbImagePath;//底库照或身份证中提取的照片
    private int faceId;
    private int tempStatus;//0 未开启体温检测  1 正常体温  2 异常体温
    private String customnerId;
    private boolean isRecongize;
    private boolean isUpload;//是否上传到平台
    private boolean isUploadPCTool;//是否上传到PC工具
    private int personType;//识别出来的人员类型
    private int passType;//通行类型,0 表示人脸 1 表示IC卡 2表示人脸+IC卡 3表示二维码  4刷身份证通行  5 人证比对通行 6 人证比对后库内查找
    private String faceRecPath;//从抓拍照截取的人脸图的路径
    //人证识别新增字段
    private int uploadFrequency;//上传到平台的次数,当一条数据上传次数大于3时,还没上传成功时候,丢弃该数据
    private int uploadPCToolsFrequency;//上传到平台的次数,当一条数据上传次数大于3时,还没上传成功时候,丢弃该数据
    private String idCardInfoStr;//身份证信息存储的json值
    @Transient
    public Bitmap idCardFaceBitmap;//身份证中的提取到的人脸图
    @Transient
    public Bitmap captureBitmap;//,人证比对的时候抓拍到的人脸图


    public DBRecord() {
    }




    @Generated(hash = 688808728)
    public DBRecord(Long id, String personId, String name, long recogizeTime, float temp,
            String imagePath, String dbImagePath, int faceId, int tempStatus,
            String customnerId, boolean isRecongize, boolean isUpload, boolean isUploadPCTool,
            int personType, int passType, String faceRecPath, int uploadFrequency,
            int uploadPCToolsFrequency, String idCardInfoStr) {
        this.id = id;
        this.personId = personId;
        this.name = name;
        this.recogizeTime = recogizeTime;
        this.temp = temp;
        this.imagePath = imagePath;
        this.dbImagePath = dbImagePath;
        this.faceId = faceId;
        this.tempStatus = tempStatus;
        this.customnerId = customnerId;
        this.isRecongize = isRecongize;
        this.isUpload = isUpload;
        this.isUploadPCTool = isUploadPCTool;
        this.personType = personType;
        this.passType = passType;
        this.faceRecPath = faceRecPath;
        this.uploadFrequency = uploadFrequency;
        this.uploadPCToolsFrequency = uploadPCToolsFrequency;
        this.idCardInfoStr = idCardInfoStr;
    }




    public String getFaceRecPath() {
        return faceRecPath;
    }

    public void setFaceRecPath(String faceRecPath) {
        this.faceRecPath = faceRecPath;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRecogizeTime() {
        return this.recogizeTime;
    }

    public void setRecogizeTime(long recogizeTime) {
        this.recogizeTime = recogizeTime;
    }

    public float getTemp() {
        return this.temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getFaceId() {
        return this.faceId;
    }

    public void setFaceId(int faceId) {
        this.faceId = faceId;
    }

    public int getTempStatus() {
        return this.tempStatus;
    }

    public void setTempStatus(int tempStatus) {
        this.tempStatus = tempStatus;
    }

    public String getCustomnerId() {
        return this.customnerId;
    }

    public void setCustomnerId(String customnerId) {
        this.customnerId = customnerId;
    }

    public boolean getIsRecongize() {
        return this.isRecongize;
    }

    public void setIsRecongize(boolean isRecongize) {
        this.isRecongize = isRecongize;
    }

    public boolean getIsUpload() {
        return this.isUpload;
    }

    public void setIsUpload(boolean isUpload) {
        this.isUpload = isUpload;
    }


    public boolean getIsUploadPCTool() {
        return this.isUploadPCTool;
    }

    public void setIsUploadPCTool(boolean isUploadPCTool) {
        this.isUploadPCTool = isUploadPCTool;
    }

    public int getPersonType() {
        return this.personType;
    }

    public void setPersonType(int personType) {
        this.personType = personType;
    }

    public int getPassType() {
        return this.passType;
    }

    public void setPassType(int passType) {
        this.passType = passType;
    }

    public String getDbImagePath() {
        return this.dbImagePath;
    }

    public void setDbImagePath(String dbImagePath) {
        this.dbImagePath = dbImagePath;
    }

    @Override
    public String toString() {
        return "DBRecord{" +
                "id=" + id +
                ", personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", recogizeTime=" + recogizeTime +
                ", temp=" + temp +
                ", imagePath='" + imagePath + '\'' +
                ", dbImagePath='" + dbImagePath + '\'' +
                ", faceId=" + faceId +
                ", tempStatus=" + tempStatus +
                ", customnerId='" + customnerId + '\'' +
                ", isRecongize=" + isRecongize +
                ", isUpload=" + isUpload +
                ", isUploadPCTool=" + isUploadPCTool +
                ", personType=" + personType +
                ", passType=" + passType +
                '}';
    }


    public int getUploadFrequency() {
        return this.uploadFrequency;
    }


    public void setUploadFrequency(int uploadFrequency) {
        this.uploadFrequency = uploadFrequency;
    }


    public String getIdCardInfoStr() {
        return this.idCardInfoStr;
    }


    public void setIdCardInfoStr(String idCardInfoStr) {
        this.idCardInfoStr = idCardInfoStr;
    }




    public int getUploadPCToolsFrequency() {
        return this.uploadPCToolsFrequency;
    }




    public void setUploadPCToolsFrequency(int uploadPCToolsFrequency) {
        this.uploadPCToolsFrequency = uploadPCToolsFrequency;
    }

}
