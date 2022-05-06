package com.intellif.dblib;

import android.content.Context;
import android.text.TextUtils;

import com.intellif.dblib.bean.DBRecord;
import com.intellif.dblib.db.DBPersonDao;
import com.intellif.dblib.db.DBRecordDao;
import com.intellif.dblib.db.DaoSession;

import org.greenrobot.greendao.async.AsyncSession;

import java.io.File;
import java.util.List;

/**
 * CREATE BY HAORAN QIN
 * ON 2020/9/1
 * https://github.com/haoran1994
 */
public class RecordService {

    public RecordService(Context context) {
        RecordManager.getInstance().init(context);
    }

    //条件查询
    public static final int PAGE_SIZE = 20;


    public List<DBRecord> queryRecordByCondition(int pageIndex, String str, int personType, long startTime, long endTime) {

        if (startTime <= 0 || endTime <= 0) {
            return queryRecordByCondition(pageIndex, str, personType);
        } else {
            return queryRecordByConditionWithTime(pageIndex, str, personType, startTime, endTime);
        }
    }

    public long queryRecordCountByCondition(int pageIndex, String str, int personType, long startTime, long endTime) {
        if (startTime <= 0 || endTime <= 0) {
            return queryRecordCountByCondition(pageIndex, str, personType);
        } else {
            return queryRecordCountByConditionWithTime(pageIndex, str, personType, startTime, endTime);
        }
    }

    public long queryRecordCountByCondition(int pageIndex, String str, int personType) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        if (personType == -2) {
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" +str + "%")
            ).offset(PAGE_SIZE * pageIndex)
                    .orderDesc(
                            DBRecordDao.Properties.RecogizeTime
                    )
                    .count();
        } else
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" +str + "%"),
                    DBRecordDao.Properties.PersonType.eq(personType)
            ).offset(PAGE_SIZE * pageIndex)
                    .orderDesc(
                            DBRecordDao.Properties.RecogizeTime
                    )
                    .count();
    }


    public List<DBRecord> queryRecordByCondition(int pageIndex, String str, int personType) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        if (personType == -2) {
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" + str + "%")
            ).offset(PAGE_SIZE * pageIndex).limit(20)
                    .orderDesc(
                            DBRecordDao.Properties.RecogizeTime
                    )
                    .list();
        } else
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" + str + "%"),
                    DBRecordDao.Properties.PersonType.eq(personType)
            ).offset(PAGE_SIZE * pageIndex).limit(20)
                    .orderDesc(
                            DBRecordDao.Properties.RecogizeTime
                    )
                    .list();
    }


    public long queryRecordCountByConditionWithTime(int pageIndex, String str, int personType, long startTime, long endTime) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        if (personType == -2) {
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" + str + "%"),
                    DBRecordDao.Properties.RecogizeTime.between(startTime, endTime)
            ).offset(PAGE_SIZE * pageIndex).orderDesc(
                    DBRecordDao.Properties.RecogizeTime
            ).count();
        } else
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" + str + "%"),
                    DBRecordDao.Properties.PersonType.eq(personType),
                    DBRecordDao.Properties.RecogizeTime.between(startTime, endTime)
            ).offset(PAGE_SIZE * pageIndex)
                    .orderDesc(
                            DBRecordDao.Properties.RecogizeTime
                    )
                    .count();
    }


    public List<DBRecord> queryRecordByConditionWithTime(int pageIndex, String str, int personType, long startTime, long endTime) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        if (personType == -2) {
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" + str + "%"),
                    DBRecordDao.Properties.RecogizeTime.between(startTime, endTime)
            ).offset(PAGE_SIZE * pageIndex).limit(20).orderDesc(
                    DBRecordDao.Properties.RecogizeTime
            ).list();
        } else
            return dao.queryBuilder().where(
                    DBRecordDao.Properties.Name.like("%" + str + "%"),
                    DBRecordDao.Properties.PersonType.eq(personType),
                    DBRecordDao.Properties.RecogizeTime.between(startTime, endTime)
            ).offset(PAGE_SIZE * pageIndex).limit(20)
                    .orderDesc(
                            DBRecordDao.Properties.RecogizeTime
                    )
                    .list();
    }


    //查询数据
    public List<DBRecord> selectAll() {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        List<DBRecord> usersList = dao.queryBuilder().build().list();
        return usersList;
    }

    /**
     * 获取识别最新未上传到平台的识别记录
     *
     * @return
     */
    public List<DBRecord> getRecordUploadPlatformLast() {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        List<DBRecord> dbRecords = dao.queryBuilder().where(DBRecordDao.Properties.IsUpload.eq(false)).limit(1).list();
        return dbRecords;
    }

    /**
     * 获取到最新的未上传到PC工具的识别记录
     *
     * @return
     */
    public List<DBRecord> getRecordUploadPCToolLast() {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        List<DBRecord> dbRecords = dao.queryBuilder().where(DBRecordDao.Properties.IsUploadPCTool.eq(false)).limit(1).list();
        return dbRecords;
    }


    public void updateRecord(DBRecord user) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        dao.update(user);
    }

    public long getRecordCount() {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        long count = dao.queryBuilder().count();
        return count;
    }

    /**
     * 获取识别最新记录
     *
     * @return
     */
    public void removeFarData() {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        List<DBRecord> dbRecords = dao.queryBuilder().orderAsc(DBRecordDao.Properties.RecogizeTime).limit(1).list();
        //删除背景图/人脸图  TODO
        removePic(dbRecords);
        deleteByMid(dbRecords.get(0).getId());
    }

    private void removePic(List<DBRecord> dbRecords) {
        if (dbRecords != null && !dbRecords.isEmpty()) {
            DBRecord dbRecord = dbRecords.get(0);
            String faceRecPath = dbRecord.getFaceRecPath();
            String imagePath = dbRecord.getImagePath();
            try {
                File file = new File(faceRecPath);
                if (file.exists()) {
                    file.delete();
                }
                File file2 = new File(imagePath);
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 批量获取识别最新记录
     *
     * @return
     */
    public List<DBRecord> getRecords(int Page) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        List<DBRecord> dbRecords = dao.queryBuilder().orderDesc(DBRecordDao.Properties.RecogizeTime).offset((Page - 1) * 10).limit(10).list();
        return dbRecords;
    }

    //增加数据
    public void addUser(DBRecord user) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        long result = dao.insertOrReplace(user);
    }

    public void addUserList(final List<DBRecord> user) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        final DaoSession daoSession = RecordManager.getInstance().getDaoSession();
        AsyncSession session = new AsyncSession(daoSession);
        session.runInTx(new Runnable() {
            @Override
            public void run() {
                daoSession.getDBRecordDao().insertOrReplaceInTx(user);
            }
        });
    }

    //删除数据
    public void deleteUser(int mid) {
        DBRecordDao dao = RecordManager.getInstance().getDaoSession().getDBRecordDao();
        DBRecord info = dao.queryBuilder().where(DBRecordDao.Properties.Id.eq(mid)).build().unique();
        dao.delete(info);
    }

    public void deleteAlldata(List<Long> mids) {
        DaoSession daoSession = RecordManager.getInstance().getDaoSession();
        daoSession.getDBRecordDao().deleteByKeyInTx(mids);
    }

    /**
     * 通过用户id删除用户
     *
     * @param id
     */
    public void deleteByMid(Long id) {
        RecordManager.getInstance().getDaoSession().getDBRecordDao().deleteByKey(id);
    }

    public boolean deleteByMid_sql(int id) {
        boolean flag = false;
        String sql = "select mid from user where mid =" + id;
        RecordManager.getInstance().getDaoSession().getDatabase().execSQL(sql);
//        RecordManager.getInstance().getDaoSession().
        return flag;
    }

    //清空数据库
    public void deleteAll() {
        RecordManager.getInstance().getDaoSession().getDBRecordDao().deleteAll();
//        RecordManager.getInstance().getDaoSession().deleteAll(DBRecord.class);
    }
}
