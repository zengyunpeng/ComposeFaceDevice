package com.intellif.dblib;

import android.content.Context;
import android.util.Log;

import com.intellif.dblib.db.DaoMaster;
import com.intellif.dblib.db.DaoSession;
import com.intellif.utils.AppGlobals;
//import com.intellif.utils.utils.AppGlobals;

/**
 * CREATE BY HAORAN QIN
 * ON 2020/9/1
 * https://github.com/haoran1994
 * 识别记录的管理类,写在私有目录
 */
public class RecordManager {
    private DaoMaster.DevOpenHelper helper;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static RecordManager greenDaoManager;

    private RecordManager() {
    }

    public static RecordManager getInstance() {
        if (greenDaoManager == null) {
            greenDaoManager = new RecordManager();
        }
        return greenDaoManager;
    }

    /**
     * 初始化
     *
     * @param context
     */
    public void init(Context context) {
        Log.e("上下文", "RecordManager.init(context)  context" + context);
        helper = new MyDbRecordHelper(AppGlobals.getApplication(), "person_db");
        daoMaster = new DaoMaster(helper.getWritableDb());
        daoSession = daoMaster.newSession();
    }

    public DaoMaster.DevOpenHelper getDevOpenHelper() {
        return helper;
    }

    public DaoMaster getDaoMaster() {
        return daoMaster;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    public void closeDB() {
        if (helper != null) {
            helper.close();
        }
    }
}
