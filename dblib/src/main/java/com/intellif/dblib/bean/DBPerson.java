package com.intellif.dblib.bean;

import com.intellif.ifai.common.AccessRule;
import com.intellif.ifai.common.MessagePush;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 对应Sik协议中的message PersonInformation
 */
@Entity
public class DBPerson {
    public static final Long ID_INVALID = -1L;
    public static int mIndex = 0;//自增的字段,每接收到一个入库信息就自增并且把这个值赋给faceId

    public static void initIndex(int index) {
        mIndex = index;
    }

    public static void increaseIndex() {
        mIndex++;
    }

    @Id(autoincrement = true)
    private Long id;
    private int faceId;//人脸id
    /*---------协议中包含的字段 start-----------*/
    private String personId;//人员ID，这个只有平台或PC工具下发的人员,才有值,本地导入的无需设置这个值,也没有意义

    private String bornDate;//出生日期 出生日期，格式：YYYYMMDD
    private int gender;//性别 0 男 1 女 2 未指定
    private String name;

    private String nation;
    private String telNo;//电话号码
    private String address;//住址
    private String customerId;//用户自定义Id，设备只是做保存
    private String accessRule;
    private int personType;//人员类型  参看@{Constants.PersonType}
    private String push;//精准推送的字符串形式，包含事件推送(最多3条)和固定推送(最多4条)    //0常规消息推送  1纪念日消息推送，如生日、周年庆等，可循环显示
    private String work_number;
    private String department;//所属部门
    private String icCardNo;//ic卡号
    private String qr_code;//二维码信息
    private String office_date;//入职日期
    private String idCardNo;//身份证号
    /*---------协议中包含的字段 end-----------*/


    /*---------平台配置中有,协议中没有的字段 start----------*/
    private String mailbox;//邮箱
    private String position;//职务
    private String staffGroup;//人员组
    private String hint;//提示语
    private String remarks;//备注
    /*---------平台配置中有,协议中没有的字段 end----------*/


    private String imgUrl, simpleImageUrl;//图片全路径  图片名称
    private byte[] feature;
    private long storageTime;

    //保留几个字段,以后不想升级数据库可以直接用
    private String reserved_1;
    private String reserved_2;
    private String reserved_3;
    private String reserved_4;
    private String reserved_5;
    private String reserved_6;


    @Transient
    private AccessRule accessRuleObj;//通行规则对象
    @Transient
    private List<MessagePush> messagePushList;//精准推送，包含事件推送(最多3条)和固定推送(最多4条)
    @Transient
    public boolean isSelect;
    @Transient
    public boolean isWriteSuccess = true;//特征值图片是否写入成功

    public DBPerson() {
    }

    @Generated(hash = 1305442702)
    public DBPerson(Long id, int faceId, String personId, String bornDate, int gender, String name, String nation, String telNo, String address,
                    String customerId, String accessRule, int personType, String push, String work_number, String department, String icCardNo, String qr_code,
                    String office_date, String idCardNo, String mailbox, String position, String staffGroup, String hint, String remarks, String imgUrl,
                    String simpleImageUrl, byte[] feature, long storageTime, String reserved_1, String reserved_2, String reserved_3, String reserved_4,
                    String reserved_5, String reserved_6) {
        this.id = id;
        this.faceId = faceId;
        this.personId = personId;
        this.bornDate = bornDate;
        this.gender = gender;
        this.name = name;
        this.nation = nation;
        this.telNo = telNo;
        this.address = address;
        this.customerId = customerId;
        this.accessRule = accessRule;
        this.personType = personType;
        this.push = push;
        this.work_number = work_number;
        this.department = department;
        this.icCardNo = icCardNo;
        this.qr_code = qr_code;
        this.office_date = office_date;
        this.idCardNo = idCardNo;
        this.mailbox = mailbox;
        this.position = position;
        this.staffGroup = staffGroup;
        this.hint = hint;
        this.remarks = remarks;
        this.imgUrl = imgUrl;
        this.simpleImageUrl = simpleImageUrl;
        this.feature = feature;
        this.storageTime = storageTime;
        this.reserved_1 = reserved_1;
        this.reserved_2 = reserved_2;
        this.reserved_3 = reserved_3;
        this.reserved_4 = reserved_4;
        this.reserved_5 = reserved_5;
        this.reserved_6 = reserved_6;
    }


    public String getAccessRule() {
        return accessRule;
    }

    public void setAccessRule(String accessRule) {
        this.accessRule = accessRule;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFeature() {
        return this.feature;
    }

    public void setFeature(byte[] feature) {
        this.feature = feature;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getFaceId() {
        return this.faceId;
    }

    public void setFaceId(int faceId) {
        this.faceId = faceId;
    }

    public String getBornDate() {
        return this.bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getGender() {
        return this.gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public AccessRule getAccessRuleObj() {
        return accessRuleObj;
    }

    public void setAccessRuleObj(AccessRule accessRuleObj) {
        this.accessRuleObj = accessRuleObj;
    }


    public boolean deleteImageFile() {
        File file = new File(imgUrl);
        if (file.exists() && !file.delete()) {
            return false;
        }
        return true;
    }

    public int getPersonType() {
        return this.personType;
    }

    public void setPersonType(int personType) {
        this.personType = personType;
    }

    public String getDepartment() {
        if (department == null)
            return "";
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIcCardNo() {
        if (icCardNo == null)
            return "";
        return this.icCardNo;
    }

    public void setIcCardNo(String icCardNo) {
        this.icCardNo = icCardNo;
    }

    public String getTelNo() {
        return this.telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }


    public String getReserved_1() {
        return this.reserved_1;
    }

    public void setReserved_1(String reserved_1) {
        this.reserved_1 = reserved_1;
    }

    public String getReserved_2() {
        return this.reserved_2;
    }

    public void setReserved_2(String reserved_2) {
        this.reserved_2 = reserved_2;
    }

    public String getReserved_3() {
        return this.reserved_3;
    }

    public void setReserved_3(String reserved_3) {
        this.reserved_3 = reserved_3;
    }

    public String getReserved_4() {
        return this.reserved_4;
    }

    public void setReserved_4(String reserved_4) {
        this.reserved_4 = reserved_4;
    }

    public String getReserved_5() {
        return this.reserved_5;
    }

    public void setReserved_5(String reserved_5) {
        this.reserved_5 = reserved_5;
    }

    public String getReserved_6() {
        return this.reserved_6;
    }

    public void setReserved_6(String reserved_6) {
        this.reserved_6 = reserved_6;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPush() {
        return this.push;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public String getWork_number() {
        if (work_number == null)
            return "";
        return this.work_number;
    }

    public void setWork_number(String work_number) {
        this.work_number = work_number;
    }

    public String getQr_code() {
        if (qr_code == null)
            return "";
        return this.qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getOffice_date() {
        if (office_date == null)
            return "";
        return this.office_date;
    }

    public void setOffice_date(String office_date) {
        this.office_date = office_date;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStaffGroup() {
        return this.staffGroup;
    }

    public void setStaffGroup(String staffGroup) {
        this.staffGroup = staffGroup;
    }

    public String getHint() {
        return this.hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "DBPerson{" +
                "id=" + id +
                ", faceId=" + faceId +
                ", personId='" + personId + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", telNo='" + telNo + '\'' +
                ", address='" + address + '\'' +
                ", customerId='" + customerId + '\'' +
                ", personType=" + personType +
                ", work_number='" + work_number + '\'' +
                ", department='" + department + '\'' +
                ", icCardNo='" + icCardNo + '\'' +
                ", qr_code='" + qr_code + '\'' +
                ", office_date='" + office_date + '\'' +
                ", position='" + position + '\'' +
                ", staffGroup='" + staffGroup + '\'' +
                ", hint='" + hint + '\'' +
                ", remarks='" + remarks + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", reserved_1='" + reserved_1 + '\'' +
                ", reserved_2='" + reserved_2 + '\'' +
                ", reserved_3='" + reserved_3 + '\'' +
                ", reserved_4='" + reserved_4 + '\'' +
                ", reserved_5='" + reserved_5 + '\'' +
                ", reserved_6='" + reserved_6 + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "DBPerson{" +
//                "isSelect=" + isSelect +
//                '}';
//    }

    public String getSimpleImageUrl() {
        return this.simpleImageUrl;
    }

    public void setSimpleImageUrl(String simpleImageUrl) {
        this.simpleImageUrl = simpleImageUrl;
    }

    public String getMailbox() {
        return this.mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getIdCardNo() {
        return this.idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public long getStorageTime() {
        return this.storageTime;
    }

    public void setStorageTime(long storageTime) {
        this.storageTime = storageTime;
    }
}
