package com.haotliu.downloader;

import java.net.URL;

public class NoFileException extends Exception {
    public NoFileException(URL url) {
        System.out.print("There is no file for url:" + url.getPath());
    }
}
