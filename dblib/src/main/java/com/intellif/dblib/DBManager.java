package com.intellif.dblib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.google.gson.Gson;
import com.intellif.dblib.bean.DBPerson;
import com.intellif.dblib.db.DBPersonDao;
import com.intellif.dblib.db.DaoMaster;
import com.intellif.dblib.db.DaoSession;
import com.intellif.ifai.common.AccessRule;
import com.intellif.utils.AppGlobals;
import com.intellif.utils.Constants;


import org.greenrobot.greendao.query.QueryBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 人脸数据库,写再/sdcard/Intellif_Data/data/person_db
 */
public class DBManager {

    @SuppressLint("StaticFieldLeak")
    private static DBManager dbManager;

    public static DBManager getInstance() {
        if (dbManager == null) {
            dbManager = new DBManager(AppGlobals.getApplication(), Constants.DATA_PATH);
        }

        return dbManager;
    }

    private DBManager(Context context, String dbPath) {
        mContext = context;
        mDbPath = dbPath + File.separatorChar + dbName;
        setDatabase();
    }

    private String mDbPath;
    private final String dbName = "person_db";
    private Context mContext;
    private DBPersonDao personDao;
    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    public static final String TAG = DBManager.class.getSimpleName();

    private void setDatabase() {
        if (mDaoSession == null) {
            mHelper = new MyDbPersonHelper(mContext, mDbPath, null);
            db = mHelper.getWritableDatabase();
            mDaoMaster = new DaoMaster(db);
            mDaoSession = mDaoMaster.newSession();
            personDao = mDaoSession.getDBPersonDao();
        }
    }

    private DaoSession getDaoSession() {
        if (mDaoSession == null) {
            setDatabase();
        }
        return mDaoSession;
    }

    public DBPersonDao getPersonDao() {
        if (personDao == null) {
            personDao = getDaoSession().getDBPersonDao();
        }
        return personDao;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public long insertPerson(DBPerson dbPerson) {
        dbPerson.setStorageTime(System.currentTimeMillis());
        return getPersonDao().insert(dbPerson);
    }

    public void upDatePerson(DBPerson dbPerson) {
        getPersonDao().update(dbPerson);
    }


    public void deletePerson(Long id) {
        getPersonDao().deleteByKey(id);
    }

    public void deletePerson(DBPerson dbPerson) {
        getPersonDao().delete(dbPerson);
    }

    public void deletePersonAll() {
        getPersonDao().deleteAll();
    }

    public long countPerson() {
        return getPersonDao().count();
    }


    public List<DBPerson> getPersonList() {
        QueryBuilder<DBPerson> qb = getPersonDao().queryBuilder();
        List<DBPerson> list = qb.list();
        Log.e("PERSON_ADD_TAG", "数据库查询出的数据: " + list);
        return list;
    }

    public List<DBPerson> getPersonOffset(int offset) {
        QueryBuilder<DBPerson> qb = getPersonDao().queryBuilder();
        List<DBPerson> list = qb.offset(offset).limit(1).list();
        return list;
    }

    public List<DBPerson> getPersonOffset2(int offset) {
        QueryBuilder<DBPerson> qb = getPersonDao().queryBuilder();
        List<DBPerson> list = qb.offset(offset).limit(1000).list();
        return list;
    }


    public List<DBPerson> getPersonListNoRule() {
        QueryBuilder<DBPerson> qb = getPersonDao().queryBuilder();
        List<DBPerson> list = qb.list();

        return list;
    }

    public List<DBPerson> getPersonListNoRuleWithBound(int start, int end) {
        QueryBuilder<DBPerson> qb = getPersonDao().queryBuilder();
        List<DBPerson> list = qb.offset(start).limit(end - start).list();
        return list;
    }

    public void deleteAll() {
        getPersonDao().deleteAll();
    }


    //条件查询
    public static final int PAGE_SIZE = 1000;

    public List<DBPerson> queryDbByCondition(int pageIndex, String str, int personType) {
        if (personType == -2) {//-2就查询所有人
            return getPersonDao().queryBuilder().where(
                    DBPersonDao.Properties.Name.like("%" + str + "%")
            ).offset(PAGE_SIZE * pageIndex).limit(1000).list();
        } else
            return getPersonDao().queryBuilder().where(
                    DBPersonDao.Properties.Name.like("%" + str + "%"),
                    DBPersonDao.Properties.PersonType.eq(personType)
            ).offset(PAGE_SIZE * pageIndex).limit(1000).list();
    }


    public long queryDbCountByCondition(int pageIndex, String str, int personType) {
        if (personType == -2) {//-2就查询所有人
            return getPersonDao().queryBuilder().where(
                    DBPersonDao.Properties.Name.like("%" + str + "%")
            )/*.offset(PAGE_SIZE * pageIndex)*/.count();
        } else
            return getPersonDao().queryBuilder().where(
                    DBPersonDao.Properties.Name.like("%" + str + "%"),
                    DBPersonDao.Properties.PersonType.eq(personType)
            )/*.offset(PAGE_SIZE * pageIndex)*/.count();
    }


    public List<String> querySameNamePersons() {

        Cursor cursor = getDaoSession().getDatabase().rawQuery("SELECT * FROM DBPerson WHERE name IN (SELECT name FROM DBPerson GROUP BY name HAVING COUNT(*) > 1)", null);
        List<String> names = new ArrayList<>();

        if (cursor.moveToFirst()) {
            String name = cursor.getString(cursor.getColumnIndex("NAME"));
            names.add(name);
        }


        return names;
    }


    //分页加载
//    public List<UserEntity> getTwentyRec(int offset){
//        UserDao dao = openReadableDb().getUserDao();
//        List<UserEntity> listMsg = dao.queryBuilder()
//                .offset(offset * 20).limit(20).list();
//        return listMsg;
//    }


    public List<DBPerson> queryPersonByPersonId(String personId) {
        return getPersonDao().queryBuilder().where(DBPersonDao.Properties.PersonId.eq(personId)).list();
    }


    public DBPerson queryById(String personId) {
        List<DBPerson> list = getPersonDao().queryBuilder().where(DBPersonDao.Properties.Id.eq(personId)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    //通过身份证号查询人员
    public DBPerson queryByIdCardNo(String idCardNum) {
        List<DBPerson> list = getPersonDao().queryBuilder().where(DBPersonDao.Properties.IdCardNo.eq(idCardNum)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }


    public DBPerson queryByICCardNo(String icCardNum) {
        List<DBPerson> list = getPersonDao().queryBuilder().where(DBPersonDao.Properties.IcCardNo.eq(icCardNum)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<DBPerson> queryPersonByFaceId(int faceId) {
        return getPersonDao().queryBuilder().where(DBPersonDao.Properties.FaceId.eq(faceId)).list();
    }

    public List<DBPerson> queryPersonByCustomId(String customId) {
        return getPersonDao().queryBuilder().where(DBPersonDao.Properties.CustomerId.eq(customId)).list();
    }

    public DBPerson loadByRowId(long rowId) {
        return getPersonDao().loadByRowId(rowId);
    }


    public DBPerson queryMaxPersonById() {
        List<DBPerson> dbPeople = getPersonDao().queryBuilder().orderDesc(DBPersonDao.Properties.Id).limit(1).list();
        if (dbPeople.size() > 0) {
            return dbPeople.get(0);
        } else {
            return null;
        }
    }

    public Long queryMaxId() {
        DBPerson dbPerson = queryMaxPersonById();
        if (dbPerson != null) {
            return queryMaxPersonById().getId();
        }
        return 0L;
    }

    /**
     * 通过主键删除数据
     *
     * @param id
     */
    public void deletePersonById(Long id) {
        getPersonDao().deleteByKey(id);
    }
}
