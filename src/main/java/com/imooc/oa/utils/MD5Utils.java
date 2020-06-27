package com.imooc.oa.utils;


import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
    public static String md5Digest(String source){
        return DigestUtils.md5Hex(source);
    }

    /**
     * 对原数据加盐混淆后生成MD5摘要
     * @param source 原数据
     * @param salt 盐值
     * @return MD5 摘要
     */
    public static String md5Digest(String source, Integer salt){
        char[] ca = source.toCharArray();
        for(int i=0; i<ca.length;i++){
            ca[i] = (char)(ca[i] + salt);
        }
        String target = new String(ca);
//        System.out.println(target);
        return DigestUtils.md5Hex(target);
    }
}
