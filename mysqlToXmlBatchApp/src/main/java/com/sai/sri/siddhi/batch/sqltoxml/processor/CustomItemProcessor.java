package com.sai.sri.siddhi.batch.sqltoxml.processor;

import com.sai.sri.siddhi.batch.sqltoxml.pojo.Tutorial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {

    private Logger logger = LogManager.getLogger();

    @Override
    public Tutorial process(Tutorial tutorial) throws Exception {
        logger.info("process()..");
        return tutorial;
    }
}
