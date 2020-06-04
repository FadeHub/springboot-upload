package com.sl.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shuliangzhao
 * @Title: FileProperty
 * @ProjectName springboot-upload
 * @Description: TODO
 * @date 2020/6/3 23:51
 */
@ConfigurationProperties(prefix = "file")
public class FileProperty {

    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
