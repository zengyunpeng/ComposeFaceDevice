package com.intellif.dblib;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.intellif.dblib.bean.DBPerson;
import com.intellif.dblib.db.DBPersonDao;
import com.intellif.dblib.db.DaoMaster;

import org.greenrobot.greendao.database.Database;

/**
 * 用于DbPerson数据库升级的类,因为这个数据库路径在/sdcard/Intellif_Data下面,其他数据库在APP私有目录,所以使用不同的升级类
 */
public class MyDbPersonHelper extends DaoMaster.DevOpenHelper {

    public MyDbPersonHelper(Context context, String name) {
        super(context, name);
    }

    public MyDbPersonHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        super.onCreate(db);
    }

    @Override
    @SuppressWarnings("all")
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.e("MyGreenDaoDbHelper", "onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)");
        super.onUpgrade(db, oldVersion, newVersion);
        Log.e("MyGreenDaoDbHelper", "----" + oldVersion + "---先前和更新之后的版本---" + newVersion + "----");

    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        Log.e("MyGreenDaoDbHelper", "onUpgrade(Database db, int oldVersion, int newVersion)");
        if (oldVersion < newVersion) {
            Log.e("MyGreenDaoDbHelper", "进行数据库升级");
            //noinspection unchecked
            new GreenDaoCompatibleUpdateHelper()
                    .setCallBack(
                            new GreenDaoCompatibleUpdateHelper.GreenDaoCompatibleUpdateCallBack() {
                                @Override
                                public void onFinalSuccess() {
                                    Log.e("MyGreenDaoDbHelper", "进行数据库升级 ===> 成功");
                                }

                                @Override
                                public void onFailedLog(String errorMsg) {
                                    Log.e("MyGreenDaoDbHelper", "升级失败日志 ===> " + errorMsg);
                                }
                            }
                    )
                    .compatibleUpdate(db, DBPersonDao.class);
            Log.e("MyGreenDaoDbHelper", "进行数据库升级--完成");
        }
    }
}
