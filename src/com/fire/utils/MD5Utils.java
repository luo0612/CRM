package com.fire.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by admin on 2016/11/9.
 * MD5加密工具类
 */
public class MD5Utils {
    /**
     * MD5加密
     *
     * @return
     */
    public static String md5(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] data = digest.digest(value.getBytes());
            BigInteger bigInteger = new BigInteger(1, data);
            //转换成16进制
            return bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


}
