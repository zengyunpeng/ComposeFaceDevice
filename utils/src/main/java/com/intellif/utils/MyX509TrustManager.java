package com.intellif.utils;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/**
 * className：MyX509TrustManager
 * packageName：com.intellif.facedevice.sik
 * createTime：2021/9/10 8:50
 * author： haoran
 * descrioption：MyX509TrustManager
 **/
public class MyX509TrustManager implements X509TrustManager {
    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    /**
     * @Description: 校验https网址是否安全
     * @param: ""
     * @Return:
     * @Author: supenghui
     * @Date: 2021/4/25 16:21
     */
    public class TrustAnyHostnameVerifier implements HostnameVerifier {
        public boolean verify(String hostname, SSLSession session) {
            // 直接返回true:默认所有https请求都是安全的
            return true;
        }
    }

}

