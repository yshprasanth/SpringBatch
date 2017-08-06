package com.sai.sri.siddhi.batch.csvtoxml.mapper;

import com.sai.sri.siddhi.batch.csvtoxml.pojo.Tutorial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class TutorialFieldSetMapper implements FieldSetMapper<Tutorial>{
    Logger logger = LogManager.getLogger(getClass());

    @Override
    public Tutorial mapFieldSet(FieldSet fieldSet) throws BindException {
        logger.info("start mapping: " + fieldSet);

        Tutorial tutorial = new Tutorial();
        tutorial.setTutorial_id(fieldSet.readInt(0));
        tutorial.setTitle(fieldSet.readString(1));
        tutorial.setAuthor(fieldSet.readString(2));
        tutorial.setDate(fieldSet.readString(3));

        return tutorial;
    }
}
