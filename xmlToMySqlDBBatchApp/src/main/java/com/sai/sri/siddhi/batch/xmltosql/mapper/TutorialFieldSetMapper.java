package com.sai.sri.siddhi.batch.xmltosql.mapper;

import com.sai.sri.siddhi.batch.xmltosql.pojo.Tutorial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class TutorialFieldSetMapper implements FieldSetMapper {

    Logger logger = LogManager.getLogger(getClass());

    @Override
    public Object mapFieldSet(FieldSet fieldSet) throws BindException {
        logger.info("mapFieldSet - start");
        // instantiating the Tutorial class
        Tutorial tutorial = new Tutorial();

        tutorial.setTutorial_id(fieldSet.readInt(0));
        tutorial.setAuthor(fieldSet.readString(1));
        tutorial.setTitle(fieldSet.readString(2));
        tutorial.setDate(fieldSet.readString(3));
        tutorial.setIcon(fieldSet.readString(4));
        tutorial.setDescription(fieldSet.readString(5));

        logger.info("mapFieldSet - end");
        return tutorial;
    }
}
