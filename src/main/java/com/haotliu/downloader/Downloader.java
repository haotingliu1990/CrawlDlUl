package com.haotliu.downloader;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class Downloader {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private URL url;
    public void setURL(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    public File download(String fileName) throws IOException, NoFileException {
        // Store the content of the specific url to tmp tile
        File tmpPicFile = null;
        FileUtils.copyURLToFile(url, tmpPicFile);
        if(null == tmpPicFile){
            logger.error("No file for url :" +  url.toString());
            throw new NoFileException(url);
        }
        logger.info("Stored file :" + fileName);
        return tmpPicFile;
    }
}
