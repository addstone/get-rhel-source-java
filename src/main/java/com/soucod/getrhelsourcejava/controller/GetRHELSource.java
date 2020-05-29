package com.soucod.getrhelsourcejava.controller;

import com.soucod.getrhelsourcejava.service.GetRHELSourceService;

/**
 * Description:  此类描述
 * @Author: Ludashi
 * Date: 2020-05-29-22:50
 * UpdateDate: 2020-05-29-22:50
 * FileName: GetRHELSource
 * Version: 0.0.0.1
 * Since: 0.0.0.1
 */
public class GetRHELSource {

    /**
     * 功能需求: 该项目作用为在 Linux 下获取上级目录的 rhel-source 全部源码文件,解压之后将源码内容上传至 github
     * 1. 进入文件夹 BaseOS\Packages 下
     * 1. 获取当前全部源码文件夹名并存起来
     * 1. 解压 rpm 文件至源目录
     * 2. 判断根据文件名判断项目名与版本号
     * 2. 将源码文件移动并覆盖到相同名字项目的 GitHub 项目中
     * 3. 执行 git push 命令上传项目到 GitHub
     */
    public static void GetRHELSource() {
        System.out.println("GetRHELSource.GetRHELSource 方法启动");

        // 获取目录位置 E:\cache\rhel\rhel8\rpm
//        GetRHELSourceService.cd();
        // 获取当前目录所有文件名
        GetRHELSourceService.getAllPathFileName();
        // 解压 rpm 文件
        GetRHELSourceService.getExRPM();
        // 获取解压之后的项目名
        GetRHELSourceService.getSourceFileName();

    }


}
