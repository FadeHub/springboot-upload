package com.sl.excepiton;

/**
 * @author shuliangzhao
 * @Title: FileException
 * @ProjectName springboot-upload
 * @Description: TODO
 * @date 2020/6/4 0:04
 */
public class FileException extends RuntimeException {

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }
}
