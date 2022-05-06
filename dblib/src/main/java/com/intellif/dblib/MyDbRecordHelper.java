package com.intellif.dblib;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.intellif.dblib.db.DBCallRecordDao;
import com.intellif.dblib.db.DBRecordDao;
import com.intellif.dblib.db.DaoMaster;

import org.greenrobot.greendao.database.Database;

public class MyDbRecordHelper extends DaoMaster.DevOpenHelper {
   public static final String TAG = "MyGreenDaoDbHelper";

   public MyDbRecordHelper(Context context, String name) {
      super(context, name);
   }

   public MyDbRecordHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
      super(context, name, factory);
   }

   @Override
   public void onCreate(SQLiteDatabase db) {
      super.onCreate(db);
   }

   @Override
   @SuppressWarnings("all")
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      super.onUpgrade(db, oldVersion, newVersion);
      Log.e("MyGreenDaoDbHelper", "----" + oldVersion + "---先前和更新之后的版本---" + newVersion + "----");

   }

   @SuppressWarnings("unchecked")
   @Override
   public void onUpgrade(Database db, int oldVersion, int newVersion) {
      if (oldVersion < newVersion) {
         Log.e("MyGreenDaoDbHelper", "进行数据库升级");
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
                 .compatibleUpdate(db, DBRecordDao.class, DBCallRecordDao.class);
         Log.e("MyGreenDaoDbHelper", "进行数据库升级--完成");
      }
   }
}
