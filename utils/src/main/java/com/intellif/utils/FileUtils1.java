package com.intellif.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * className：FileUtils1
 * packageName：com.intellif.utils.utils
 * createTime：2021/9/10 9:00
 * author： haoran
 * descrioption：FileUtils1
 **/
public class FileUtils1 {
    private String SDPATH="";

    public String getSDPATH() {
        return SDPATH;
    }
    public FileUtils1() {
        //SDPATH =this.getApplicationContext().getFilesDir()+"/";
        //得到当前外部存储设备的目录
        // /SDCARD
        //SDPATH =Environment.getRootDirectory()+"/";
        //SDPATH = Environment.getDataDirectory()+"/";
        //SDPATH = Environment.getExternalStorageDirectory() + "/";
    }
    /**
     * 在SD卡上创建文件
     *
     * @throws IOException
     */
    public File creatSDFile(String fileName) throws IOException {
        File file = new File(SDPATH + fileName);
        file.createNewFile();
        return file;
    }

    /**
     * 在SD卡上创建目录
     *
     * @param dirName
     */
    public File creatSDDir(String dirName) {
        File dir = new File(SDPATH + dirName);
        dir.mkdir();
        return dir;
    }

    /**
     * 判断SD卡上的文件夹是否存在
     */
    public boolean isFileExist(String fileName){
        File file = new File(SDPATH + fileName);
        return file.exists();
    }

    /**
     * 将一个InputStream里面的数据写入到SD卡中
     */
    public File write2SDFromInput(String path, String fileName, InputStream input){
        File file = null;
        OutputStream output = null;
        try{
//            creatSDDir(path);
            //file = creatSDFile(path + fileName);
            file = creatSDFile(fileName);
            output = new FileOutputStream(file);
            byte buffer [] = new byte[4 * 1024];
            while((input.read(buffer)) != -1){
                output.write(buffer);
            }
            output.flush();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                output.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return file;
    }

}
