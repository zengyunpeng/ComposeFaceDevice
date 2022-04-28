package com.intellif.utils;

import android.text.TextUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Arrays;

public class QyHardwareHelper {
    public static void write(String path, String value){
        if(TextUtils.isEmpty(path) || TextUtils.isEmpty(value)){
            return;
        }

        try {
            byte[] data = value.getBytes();
            File outFile = new File(path);
            FileOutputStream outputStream = new FileOutputStream(outFile);
            outputStream.write(data);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String read(String path){
        if(TextUtils.isEmpty(path)){
            return "";
        }
        String ret = "";
        try {
            FileReader fileReader = new FileReader(new File(path));
            char[] data = new char[256];
            int len = fileReader.read(data, 0, data.length);
            fileReader.close();
            if(len <= 0) {
                return "";
            }

            String str = new String(Arrays.copyOf(data, len));
            if(TextUtils.isEmpty(str)){
                return "";
            }

            String value = str.trim();
            return value;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void wgWrite(String value, int type){
        if(TextUtils.isEmpty(value)){
            return;
        }

        String prefix = type == 34 ? "A" : "";
        String wgValue = prefix + value;
        write("/proc/driver/wgout", wgValue);
    }

    public static String wgRead(){
        String wgValue = read("/proc/driver/weigen");
        if(TextUtils.isEmpty(wgValue)){
            return wgValue;
        }

        wgValue = wgValue.replace("A", "");
        return wgValue;
    }
}
