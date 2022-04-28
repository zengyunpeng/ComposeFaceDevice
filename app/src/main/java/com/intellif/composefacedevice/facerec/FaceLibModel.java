//package com.intellif.composefacedevice.facerec;
//
//import static com.intellif.ifai.facedb.AddPersonState.AddPersonState_OK;
//
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.text.TextUtils;
//
//import androidx.annotation.NonNull;
//
//import com.intellif.arctern.FaceUtils;
//import com.intellif.arctern.base.ArcternFeatureResult;
//import com.intellif.arctern.base.ArcternImage;
//import com.intellif.arctern.base.ArcternRect;
//import com.intellif.arctern.base.AttributeCallBack;
//import com.intellif.arctern.base.DetectCallBack;
//import com.intellif.arctern.base.ExtractCallBack;
//import com.intellif.arctern.base.SearchCallBack;
//import com.intellif.arctern.base.TrackCallBack;
//import java.io.File;
//import java.util.List;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * 这个调用SDK 的类后续对入参进行判断和打印,增强健壮性  TODO
// */
//public class FaceLibModel {
//    public static final String TAG = "FaceLibModel";
//    private static FaceLibModel instance = new FaceLibModel();
//    private ExecutorService mSingleThreadExecutor;//
//
//    private FaceLibModel() {
//        mSingleThreadExecutor = Executors.newSingleThreadExecutor();
//    }
//
//    public static FaceLibModel getInstance() {
//        return instance;
//    }
//
//    public String getSignature() {
//        LogUtil.e(TAG, "getSignature");
//        return FaceUtils.getInstance().arcternsdk_about();
//    }
//
//    public int arcternsdk_access_run(String confile_path) {
//        LogUtil.e(TAG, "arcternsdk_access_run");
//        return FaceUtils.getInstance().arcternsdk_access_run(confile_path);
//    }
//
//    public long arcternsdk_access_database_size() {
//        LogUtil.e(TAG, "arcternsdk_access_database_size");
//        return FaceUtils.getInstance().arcternsdk_access_database_size();
//    }
//
//
//    public static int arcternsdk_access_delivery(ArcternImage img_rgb, ArcternImage img_ir) {
//        return FaceUtils.getInstance().arcternsdk_access_delivery(img_rgb, img_ir);
//    }
//
//    public static void arcternsdk_deinit() {
//        FaceUtils.getInstance().arcternsdk_deinit();
//    }
//
//    public static void arcternsdk_access_stop() {
//        FaceUtils.getInstance().arcternsdk_access_stop();
//    }
//
//    public static int arcternsdk_access_set_detect_cbf(DetectCallBack detectCallBack) {
//        return FaceUtils.getInstance().arcternsdk_access_set_detect_cbf(detectCallBack);
//    }
//
//    public static int arcternsdk_access_set_track_cbf(TrackCallBack trackCallBack) {
//        return FaceUtils.getInstance().arcternsdk_access_set_track_cbf(trackCallBack);
//    }
//
//    public static int arcternsdk_access_set_search_cbf(SearchCallBack searchCallBack) {
//        return FaceUtils.getInstance().arcternsdk_access_set_search_cbf(searchCallBack);
//    }
//
//    public static int arcternsdk_access_set_filt_cbf(AttributeCallBack attributeCallBack) {
//        return FaceUtils.getInstance().arcternsdk_access_set_filt_cbf(attributeCallBack);
//    }
//
//    public int getLicense(String path, String apiKey, String apiSecret) {
//        return FaceUtils.getInstance().arcternsdk_fetch_license(apiKey, apiSecret, path);
//    }
//
//    public static int access_database_add(long id, byte[] feature) {//这里有个NDK 崩溃  TODO
//        if (feature == null) {
//            CrashReport.postCatchedException(new Exception("人脸库特征值为空"));
//            return -1000;
//        }
//        LogUtil.e(TAG, "access_database_add(" + id + " , " + feature + ")");
//        return FaceUtils.getInstance().arcternsdk_access_database_add(id, feature);
//    }
//
//    public static int access_database_update(long id, byte[] feature) {
//        return FaceUtils.getInstance().arcternsdk_access_database_update(id, feature);
//    }
//
//    public static int access_database_delete(long id) {
//        return FaceUtils.getInstance().arcternsdk_access_database_delete(id);
//    }
//
//    public static int access_clear_database() {
//        return FaceUtils.getInstance().arcternsdk_access_database_clear();
//    }
//
//    //直接获取特征值实体,这个方法会发生不明原因的提取特征值失败,建议采用getFeature
//    //FaceUtils.getInstance().arcternsdk_access_extract_feature_data_directly相关这个api有bug,尽量避免调用
//    @Deprecated
//    public static ArcternFeatureResult getFeatureDir(Bitmap bitmap) {
//        return FaceUtils.getInstance().arcternsdk_access_extract_feature_data_directly(bitmap);
//    }
//
//    //FaceUtils.getInstance().arcternsdk_access_extract_feature_data_directly相关这个api有bug,尽量避免调用
//    @Deprecated
//    private ArcternFeatureResult getFeatureDir(String bitmapPath, final DBPerson personInfo) {
//        Bitmap faceBitmap = BitmapFactory.decodeFile(bitmapPath);
//        ArcternFeatureResult arcternFeatureResult = FaceUtils.getInstance().arcternsdk_access_extract_feature_data_directly(faceBitmap);
//        if (faceBitmap != null) {
//            faceBitmap.recycle();
//        }
//        return arcternFeatureResult;
//    }
//
//    public static final int OK = 0;
//    public static final int NULL_BMP = -1;
//    public static final int BIG_BMP = -2;
//    public static final int FILE_NO_EXIST = -3;
//    public static final int FILE_EMPTY = -4;
//    public static final int OTHER_ERROR = -5;
//
//
//    public static int getFeatureWithBmp(String bitmapPath, final DBPerson dbPerson) {
//        File file = new File(bitmapPath);
//        if (!file.exists()) {
//            return FILE_NO_EXIST;
//        }
//
//        if (file.length() == 0)
//            return FILE_EMPTY;
//
//        Bitmap faceBitmap = BitmapFactory.decodeFile(bitmapPath);
//        if (faceBitmap == null) {
//            return NULL_BMP;
//        }
//
//        if (faceBitmap.getWidth() > 3000 || faceBitmap.getHeight() > 3000) {
//            return BIG_BMP;
//        }
//
////        int i = FaceUtils.getInstance().arcternsdk_access_extract_feature(faceBitmap, (arcternImage, features, arcternRects) -> {
////            dbPerson.setFeature(features[0].clone());//C代码会很快释放特征值这里clone一份保存下来
////        });
//        ArcternFeatureResult arcternFeatureResult = FaceUtils.getInstance().arcternsdk_access_extract_feature_data_directly(faceBitmap);
//        faceBitmap.recycle();
//        if (arcternFeatureResult != null && arcternFeatureResult.feature != null) {
//            dbPerson.setFeature(arcternFeatureResult.feature);
//            return OK;
//        } else {
//            return OTHER_ERROR;
//        }
//    }
//
////    private static int getFeatureWithBmp(String bitmapPath, final DBPerson personInfo) {
////        Bitmap faceBitmap = BitmapFactory.decodeFile(bitmapPath);
////        if(faceBitmap.getWidth()>3000||faceBitmap.getHeight()>3000){
////            return BIG_BMP;
////        }
////        ArcternFeatureResult arcternFeatureResult = FaceUtils.getInstance().arcternsdk_access_extract_feature_data_directly(faceBitmap);
////        if(faceBitmap!=null){
////            faceBitmap.recycle();
////        }
////        return 1;
////    }
//
//
//    //图片不存在可能引发NDK崩溃  TODO
//    @Deprecated
//    public static int getFeature(@NonNull String bitmapPath, @NonNull final DBPerson dbPerson) {
//        LogUtil.e("getFeature(@NonNull String bitmapPath, @NonNull final DBPerson dbPerson): " + bitmapPath + "***" + dbPerson);
//        File file = new File(bitmapPath);
//        if (!file.exists()) {
//            return -1;
//        }
//
//        if (file.length() == 0)
//            return -2;
//        LogUtil.e(TagConstants.TAG_1054, "提取特征值: FaceUtils.getInstance().arcternsdk_access_extract_feature");
//        LogUtil.e(TagConstants.TAG_1054, "提取特征值的图片路径: " + bitmapPath);
//        return FaceUtils.getInstance().arcternsdk_access_extract_feature(bitmapPath, new ExtractCallBack() {
//            @Override
//            public void onExtractFeatureListener(ArcternImage arcternImage, byte[][] features, ArcternRect[] arcternRects) {
//                LogUtil.e(TagConstants.TAG_1054, "设置特征值的线程: " + Thread.currentThread().getName());
//                LogUtil.e(TagConstants.TAG_1054, "提取到的特征值: : " + features[0]);
//                dbPerson.setFeature(features[0].clone());//C代码会很快释放特征值这里clone一份保存下来
//                LogUtil.e(TagConstants.TAG_1054, "设置完后dbPerson的特征值: " + dbPerson.getFeature());
//            }
//        });
//    }
//
//
//    public int access_reload_confile() {
//        return FaceUtils.getInstance().arcternsdk_access_reload_confile(Constants.FILE_CONFIG_PATH);
//    }
//
//
//    public AddPersonByFeatureResponse addPersonByFeatureWithResult(AddPersonByFeatureRequest addPersonByFeatureRequest) {
//        List<AddPersonByFeatureRequest.AddPersonByFeature> personsList = addPersonByFeatureRequest.getPersonsList();
//
//        AddPersonByFeatureResponse.Builder builder = AddPersonByFeatureResponse.newBuilder();
//
//
//        for (int i = 0; i < personsList.size(); i++) {
//            AddPersonByFeatureRequest.AddPersonByFeature addPersonByFeature = personsList.get(i);
//            ByteString feature = addPersonByFeature.getFeature();
//            DBPerson dbPerson = new DBPerson();
//            dbPerson.setFeature(feature.toByteArray());
//            WSInterface.generateDbPersonFromInformation(dbPerson, addPersonByFeature.getInformation(), true);
//            //载入SDK
//            int result = access_database_add(dbPerson.getId(), dbPerson.getFeature());
//            if (result != 0) {//入库失败
//                builder.addSuccessResult(
//                        AddPersonByFeatureResponse.AddPersonByFeatureResult.newBuilder()
//                                .setPersonId(dbPerson.getPersonId())
//                                .setName(dbPerson.getName())
//                                .setCustomerId(dbPerson.getCustomerId())
//                                .setState(AddPersonState.AddPersonState_InvalidFeature)//提示无效特征值
//                                .build());
//            } else {//等于0入库成功
//                //插入人脸数据库
//                long l = DeviceApplication.getInstance().getDbManager().insertPerson(dbPerson);
//                builder.addSuccessResult(
//                        AddPersonByFeatureResponse.AddPersonByFeatureResult.newBuilder()
//                                .setPersonId(dbPerson.getPersonId())
//                                .setName(dbPerson.getName())
//                                .setCustomerId(dbPerson.getCustomerId())
//                                .setState(AddPersonState.AddPersonState_OK)//入库成功
//                                .build());
//            }
//
//        }
//
//        return builder.build();
//    }
//
//
//    //通过图片提取特征值入库
//    public AddPersonResponse addPerson(final AddPersonRequest addPersonRequest) {
//        LogUtil.e(TagConstants.TAG_1054, " addPerson(final MessageHeader header, final AddPersonRequest addPersonRequest) {");
//        return addDbByImageWithResult(addPersonRequest);
//    }
//
//
//    private AddPersonResponse addDbByImageWithResult(AddPersonRequest addPersonRequest/*, boolean isResponsePlatform*/) {
//        AddPersonResponse.Builder builder = AddPersonResponse.newBuilder();
//        AddPersonState addPersonState = AddPersonState_OK;
//        //1.加入过本地人脸库,直接返回入库成功,防止重复入库
//        String personId = addPersonRequest.getInformation().getPersonId();
//        List<DBPerson> list = DeviceApplication.getInstance().getDbManager().queryPersonByPersonId(personId);//Cursor window allocation of 2048 kb failed.
//        if (list != null && !list.isEmpty()) {
//            DBPerson dbPerson = list.get(0);
//            LogUtil.e(TagConstants.TAG_1054, "该人员之前已经入库,直接返回入库成功");
//            LogUtil.e(TagConstants.TAG_DUPLICATE_FACE, "该人员之前已经入库,直接返回入库成功:" + personId);
//            LogUtil.e(TagConstants.TAG_DUPLICATE_FACE, "该人员之前已经入库,直接返回入库成功:" + addPersonRequest.getInformation().getName());
//            return builder
//                    .setPersonId(dbPerson.getPersonId())
//                    .setFaceId(dbPerson.getFaceId())
//                    .setName(dbPerson.getName())
//                    .setState(addPersonState)
//                    .build();
//        }
//        //2.没有加入过本地人脸库
//        DBPerson dbPerson;
//        //sik对象转换成本地对象  这里直接转换成db对象
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员身份证号123445: " + addPersonRequest.getInformation().getIdNumber());
//        dbPerson = WSInterface.receiveAddPersonRequest(addPersonRequest, Constants.IMAGE_SAVE_PATH + File.separatorChar);
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员名: " + dbPerson.getName());
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员hashCode: " + dbPerson.hashCode());
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员: " + dbPerson);
//        LogUtil.e(TagConstants.TAG_1054, "下发的图片地址: " + dbPerson.getImgUrl());
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员生日: " + dbPerson.getBornDate());
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员入职日期: " + dbPerson.getOffice_date());
//        LogUtil.e(TagConstants.TAG_1054, "下发的人员身份证号: " + dbPerson.getIdCardNo());
//        File file = new File(dbPerson.getImgUrl());  //这个文件可能写入失败 导致识别SDK Crash   TODO
//        if (file.exists()) {
//            LogUtil.e(TagConstants.TAG_1054, "图片文件存在 ");
//            long length = file.length();
//            LogUtil.e(TagConstants.TAG_1054, "图片文件大小: " + length);
//            if (length != 0) {
//                //提取特征值
//
//
//                int result = getFeatureWithBmp(dbPerson.getImgUrl(), dbPerson);//这个又一个NDK 的 Crash TODO
//                if (result == 0) {//提取特征值成功
//                    LogUtil.e(TagConstants.TAG_1054, "11111 addperson ");
//                    //插入本地数据库
//                    LogUtil.e(TagConstants.TAG_1054, "入库的线程: " + Thread.currentThread().getName());
//                    LogUtil.e(TagConstants.TAG_1054, "入库的dbPerson: " + dbPerson.hashCode());
//                    LogUtil.e(TagConstants.TAG_1054, "入库的数据特征值: " + dbPerson.getFeature());
//                    long rowID = DeviceApplication.getInstance().getDbManager().insertPerson(dbPerson);
//                    LogUtil.e(TagConstants.TAG_1054, "4444 addperson ");
//                    //查出数据库中的对象
//                    dbPerson = DeviceApplication.getInstance().getDbManager().loadByRowId(rowID);
//                    LogUtil.e(TagConstants.TAG_1054, "查询出的数据特征值: " + dbPerson.getFeature());
//                    LogUtil.e(TagConstants.TAG_1054, "5555 addperson ");
//                    //添加到sdk数据库
//                    result = access_database_add(dbPerson.getId(), dbPerson.getFeature());
//                    LogUtil.e(TagConstants.TAG_1054, "6666 addperson ");
//                    String office_date = dbPerson.getOffice_date();
//                    if (result != 0) { //入库失败
//                        LogUtil.e(TagConstants.TAG_1054, "22222 addperson ");
//
//                        DeviceApplication.getInstance().getDbManager().deletePerson(dbPerson);
//                        LogUtil.e(TagConstants.TAG_1054, "arcternsdk add person is fail. result=" + result + " Person: " + dbPerson);
//                        dbPerson.setId(DBPerson.ID_INVALID);
//                        addPersonState = AddPersonState.AddPersonState_OtherError;
//                    }
//                } else { //提取特征值失败
//                    LogUtil.e(TagConstants.TAG_1054, "添加人脸, 提取特征值失败");
//                    if (!dbPerson.deleteImageFile()) {
//                        LogUtil.e(TagConstants.TAG_1054, "33333 addperson ");
//                    }
//                    dbPerson.setId(DBPerson.ID_INVALID);
//                    addPersonState = AddPersonState.AddPersonState_InvalidFeature;
//                }
//            }
//        } else {
//            LogUtil.e(TagConstants.TAG_1054, "图片文件不存在 ");
//            addPersonState = AddPersonState.AddPersonState_PullFailed;//拉取图片失败暂时先用这个值
//        }
//
//
//        EventBusUtil.sendEvent(new Event<>(Event.SIK_ADD_PERSON_RESULT, dbPerson));
//        PersonInformation information = addPersonRequest.getInformation();
//        LogUtil.e(TagConstants.TAG_1054, "添加人员的状态: " + addPersonState + "\n"
//                + "information.getPersonId(): " + information.getPersonId() + "\n"
//                + "dbPerson.getFaceId(): " + dbPerson.getFaceId() + "\n"
//                + "information.getName(): " + information.getName() + "\n"
//
//        );
//        LogUtil.e(TagConstants.TAG_DUPLICATE_FACE, "该人员没有入库,返回入库结果:" + personId);
//        LogUtil.e(TagConstants.TAG_DUPLICATE_FACE, "该人员没有入库,返回入库结果:" + addPersonRequest.getInformation().getName());
//        return builder
//                .setPersonId(information.getPersonId())
//                .setFaceId(dbPerson.getFaceId())
//                .setName(information.getName())
//                .setState(addPersonState)
//                .build();
//
//    }
//
//
//    /**
//     * 删除人脸库并返回对应结果
//     *
//     * @param deletePersonRequest 删除人脸的请求
//     */
//    public DeletePersonResponse deleteFaDbWithResult(DeletePersonRequest deletePersonRequest) {
//        List<ByteString> personIds = WSInterface.receiveDeletePersonRequest(deletePersonRequest);
//        DeletePersonResponse.Builder builder = DeletePersonResponse.newBuilder();
//        for (ByteString byteString : personIds) {
//            List<DBPerson> dbPeople = DeviceApplication.getInstance().getDbManager().queryPersonByPersonId(byteString.toStringUtf8());
//            LogUtil.e(TagConstants.TAG_1054, "删除人员信息: " + dbPeople);
//            if (dbPeople == null || dbPeople.isEmpty()) {//如果查出的数据为空,那也认为是删除成功了
//                LogUtil.e(TagConstants.TAG_1054, "未从本地查出人员,认为是以及删除了人脸,设置状态为删除成功");
//                builder.addResults(
//                        DeletePersonResponse.DeletePersonResult.newBuilder()
//                                .setPersonId(byteString.toStringUtf8())
//                                .setState(DeletePersonState.DeletePersonState_OK)
//                                .build());
//            } else {
//                for (DBPerson dbPerson : dbPeople) {
//                    int result = access_database_delete(dbPerson.getId());
//                    if (result == 0) {
//                        String url = dbPerson.getImgUrl();
//                        if (!dbPerson.deleteImageFile()) {
//                            LogUtil.w(TagConstants.TAG_1054, "Delete DBPerson.ImgFile is fail , ImgUrl:" + url);
//                        }
//                        //最后删除
//                        DeviceApplication.getInstance().getDbManager().deletePerson(dbPerson);
//                        LogUtil.i(TagConstants.TAG_1054, "Delete Person: " + dbPerson);
//                        EventBusUtil.sendEvent(new Event<>(Event.SIK_DELETE_PERSON_RESULT, dbPerson));
//                        builder.addResults(
//                                DeletePersonResponse.DeletePersonResult.newBuilder()
//                                        .setPersonId(dbPerson.getPersonId())
//                                        .setCustomerId(dbPerson.getCustomerId())
//                                        .setFaceId(dbPerson.getFaceId())
//                                        .setState(DeletePersonState.DeletePersonState_OK)
//                                        .build()
//                        );
//
//
//                    } else {
//                        LogUtil.e("arcternsdk delete id is fail. Person: " + dbPerson);
//                        builder.addResults(
//                                DeletePersonResponse.DeletePersonResult.newBuilder()
//                                        .setPersonId(dbPerson.getPersonId())
//                                        .setCustomerId(dbPerson.getCustomerId())
//                                        .setFaceId(dbPerson.getFaceId())
//                                        .setState(DeletePersonState.DeletePersonState_Error)
//                                        .build()
//                        );
//                    }
//
//                }
//            }
//
//        }
//        return builder.build();
//    }
//
//    /**
//     * 清库功能
//     */
//    public void clearFaceDbAndRestart() {
//        mSingleThreadExecutor.execute(FaceLibModel::clearPersonDb);
//    }
//
//    /**
//     * 恢复设备出厂设置,清除数据库等等
//     */
//    public void resetMachine() {
//        mSingleThreadExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//                //删除识别记录
//                RecordService service = new RecordService(DeviceApplication.getContext());
//                service.deleteAll();
//                //还原本地SP配置
////                SPUtils.clearSp();
//                //删除人员库中所有数据
//                DeviceApplication.getInstance().getDbManager().deleteAll();
//                //直接删除Intellif_Data文件夹,里面包含人脸数据库
//                File file = new File(Constants.APP_PATH);
//                if (file.exists() && file.delete()) {
//                    LogUtil.e(TagConstants.RESET_SETTING, "删除Intellif_Data成功");
//                } else {
//                    LogUtil.e(TagConstants.RESET_SETTING, "删除Intellif_Data失败");
//                }
//                //删除Intellif文件夹里的文件,这些文件是再DeviceApplication中通过copyModelandLicense()方法拷贝到本地的,这些文件再assets文件夹下有初始备份
//                File configDir = new File(Constants.INTELLIF_NAME);
//                if (configDir.exists() && configDir.delete()) {
//                    LogUtil.e(TagConstants.RESET_SETTING, "删除Intellif成功");
//                } else {
//                    LogUtil.e(TagConstants.RESET_SETTING, "删除Intellif失败");
//                }
//                EventBus.getDefault().post(new ResetMachineCompleteBean());
//                //序列化到本地的数据清空
//                ObjSerialize.clearCache();
////                EventBus.getDefault().post(new ResetMachineBean());
//            }
//        });
//
//    }
//
//
//    public static void clearPersonDb() {
//        DeviceApplication.getInstance().getDbManager().deleteAll();
//        FaceLibModel.access_clear_database();
//        //清空缓存的人脸库图片
//        FileUtils.deleteAllInDir(Constants.IMAGE_SAVE_PATH);
//        EventBus.getDefault().post(new Event<>(Event.SIK_DELETE_PERSON_RESULT));
//    }
//
//    /**
//     * 更新人员信息
//     *
//     * @param setPersonRequest
//     * @return
//     */
//    public SetPersonResponse updatePersonInfo(SetPersonRequest setPersonRequest) {
//        LogUtil.e(TagConstants.PLATFORM_TAG, "ProcessTextPush");
//        //既可以通过face_id来修改人员信息，也可以通过person_id来修改人员信息，还可以通过customer_ids来修改人员信息，三者者选其一
//        String personId = setPersonRequest.getInformation().getPersonId();
//        PersonInformation information = setPersonRequest.getInformation();
//        List<MessagePush> pushList = information.getPushList();
////        MessagePush messagePush = pushList.get(0);
////        MessagePushType type = messagePush.getType();
////        //推送类型  1.常规消息推送,需要提供起始时间和结束时间来显示
////        //          2.纪念日消息推送，如生日、周年庆等，可循环显示
////        String messageContent = messagePush.getMessageContent();
//        LogUtil.e(TagConstants.PLATFORM_TAG, "personId: " + personId);
//        SetPersonResponse.Builder builder = SetPersonResponse.newBuilder();
//        LogUtil.e(TagConstants.PLATFORM_TAG, "ProcessTextPush2");
//        String officeDate = setPersonRequest.getInformation().getOfficeDate();
//        LogUtil.e(TagConstants.PLATFORM_TAG, "officeDate: " + officeDate);
//
//        if (!TextUtils.isEmpty(personId)) {
//            LogUtil.e(TagConstants.TAG_1054, "根据personId更新人员库: " + personId);
//            List<DBPerson> dbPeoples = DeviceApplication.getInstance().getDbManager().queryPersonByPersonId(personId);
//            if (updateDb(information, dbPeoples)) {//更新成功
//                return builder.setResult(SetPersonResponse.SetPersonResult.newBuilder()
//                        .setPersonId(personId)
//                        .setState(SetPersonState.SetPersonState_OK)
//                        .build()).build();
//
//            }
//        }
//        int faceId = setPersonRequest.getFaceId();
//        LogUtil.e(TagConstants.PLATFORM_TAG, "faceId: " + faceId);
//        if (faceId > 0) {
//            LogUtil.e(TagConstants.TAG_1054, "根据faceId更新人员库: " + faceId);
//            List<DBPerson> dbPeoples = DeviceApplication.getInstance().getDbManager().queryPersonByFaceId(faceId);
//            if (updateDb(information, dbPeoples)) {
//                return builder.setResult(SetPersonResponse.SetPersonResult.newBuilder()
//                        .setFaceId(faceId)
//                        .setState(SetPersonState.SetPersonState_OK)
//                        .build()).build();
//            }
//        }
//
//
//        String customerId = setPersonRequest.getInformation().getCustomerId();
//        LogUtil.e(TagConstants.TAG_1054, "customerId: " + faceId);
//        if (!TextUtils.isEmpty(customerId)) {
//            LogUtil.e(TagConstants.TAG_1054, "根据customerId更新人员库: " + faceId);
//            List<DBPerson> dbPeoples = DeviceApplication.getInstance().getDbManager().queryPersonByCustomId(customerId);
//            if (updateDb(information, dbPeoples)) {
//                return builder.setResult(SetPersonResponse.SetPersonResult.newBuilder()
//                        .setCustomerId(customerId)
//                        .setState(SetPersonState.SetPersonState_OK)
//                        .build()).build();
//            }
//        }
//        LogUtil.e(TagConstants.PLATFORM_TAG, "ProcessTextPush3");
//        //否则就是入库失败
//        return builder.setResult(SetPersonResponse.SetPersonResult.newBuilder()
//                .setCustomerId(customerId == null ? "" : customerId)
//                .setState(SetPersonState.SetPersonState_Error)
//                .setPersonId(personId == null ? "" : personId)
//                .setFaceId(faceId)
//                .setCustomerId(customerId)
//                .build())
//                .build();
//    }
//
//
//    private static boolean updateDb(PersonInformation information, List<DBPerson> dbPeoples) {
//        DBPerson dbPeople;
//        if (dbPeoples == null || dbPeoples.isEmpty()) {//如果没有就不更新,因为更新数据中没有图片
//            LogUtil.e(TagConstants.PLATFORM_TAG, "查询不到人员更新失败");
//            return false;
//        } else {
//            LogUtil.e(TagConstants.PLATFORM_TAG, "查询到人员");
//            dbPeople = dbPeoples.get(0);
//        }
//
//        String idNumber = information.getIdNumber();
//        LogUtil.e(TagConstants.TAG_1054, "身份证号: " + idNumber);
//        WSInterface.generateDbPersonFromInformation(dbPeople, information, false);
//        DeviceApplication.getInstance().getDbManager().upDatePerson(dbPeople);
//        LogUtil.e(TagConstants.PLATFORM_TAG, "查询到人员,更新成功");
//        return true;
//    }
//
//
//}
