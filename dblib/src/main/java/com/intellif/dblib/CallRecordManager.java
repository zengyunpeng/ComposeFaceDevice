package com.intellif.dblib;

import com.intellif.dblib.bean.DBCallRecord;
import com.intellif.dblib.db.DBCallRecordDao;
import com.intellif.dblib.db.DaoMaster;
import com.intellif.dblib.db.DaoSession;
import com.intellif.utils.AppGlobals;


public class CallRecordManager {
    private DaoMaster.DevOpenHelper helper;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static CallRecordManager greenDaoManager;

    private CallRecordManager() {
        helper = new MyDbRecordHelper(AppGlobals.getApplication(), "person_db");
        daoMaster = new DaoMaster(helper.getWritableDb());
        daoSession = daoMaster.newSession();
    }

    private static CallRecordManager getInstance() {
        if (greenDaoManager == null) {
            greenDaoManager = new CallRecordManager();
        }
        return greenDaoManager;
    }

    private static DBCallRecordDao getDao() {
        return getInstance().daoSession.getDBCallRecordDao();
    }

    public static void init() {
        getInstance();
    }

    /**
     * 初始化
     */
    public static void insertRecord(DBCallRecord record) {
        getDao().insert(record);
    }


    public static void deleteRecord(DBCallRecord record) {
        getDao().delete(record);
    }

    public static void updateRecord(DBCallRecord record) {
        getDao().update(record);
    }

    public static DBCallRecord selectRecord() {
        return getDao().queryBuilder().limit(1).build().unique();
    }


}
