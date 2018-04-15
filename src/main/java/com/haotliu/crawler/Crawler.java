package com.haotliu.crawler;

import org.springframework.stereotype.Component;

@Component
public interface Crawler {
    //public void setFileter(String rule);
    public void crawl(String url);
}
