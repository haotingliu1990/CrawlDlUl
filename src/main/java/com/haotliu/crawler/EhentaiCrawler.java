package com.haotliu.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EhentaiCrawler implements Crawler{
    private void crawlTag(){}
    private void crawlImage(){}
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void crawl(String url) {
        try {
            Document document = Jsoup.connect(url).followRedirects(false).timeout(2000/*wait up to 2 sec for response*/).get();
        } catch (IOException e) {

            logger.error("The url:" + url + "is not working.");
            e.printStackTrace();
        }
        
    }
}
