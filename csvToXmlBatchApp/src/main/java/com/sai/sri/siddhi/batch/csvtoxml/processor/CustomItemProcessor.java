package com.sai.sri.siddhi.batch.csvtoxml.processor;

import com.sai.sri.siddhi.batch.csvtoxml.pojo.Tutorial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {

    private Logger logger = LogManager.getLogger(getClass());
    @Override
    public Tutorial process(Tutorial tutorial) throws Exception {
        logger.info("start processing, tutorial:" + tutorial);
        return tutorial;
    }
}
