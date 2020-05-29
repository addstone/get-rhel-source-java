package com.soucod.getrhelsourcejava.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description: GetRHELSource 具体实现类
 * @Author: Ludashi
 * Date: 2020-05-29-23:36
 * UpdateDate: 2020-05-29-23:36
 * FileName: GetRHELSourceService
 * Version: 0.0.0.1
 * Since: 0.0.0.1
 */
public class GetRHELSourceService {

    private Properties props = new Properties();


    public static void cd() {
        System.out.println("GetRHELSourceService.cd  启动了");

        // 夺取系统根目录
        File driveFile = new File("/mnt/e/workspace/addstone/get-rhel-source-java");
        System.out.println(driveFile);
        getProperties("pwd");
    }

    public static String getProperties(String key) {
        System.out.println(" 开始读取 properties 文件");
        Properties prop = new Properties();

        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream("/properties/config.properties"));
            prop.load(inputStream);
            String value = prop.getProperty(key);
            System.out.println(key + "        " + value);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }

    /**
     * 获取当前目录所有文件名
     */
    public static void getAllPathFileName() {
    }

    /**
     * 解压 rpm 文件
     */
    public static void getExRPM() {
    }

    /**
     * 获取解压之后的项目名
     */
    public static void getSourceFileName() {
    }
}
