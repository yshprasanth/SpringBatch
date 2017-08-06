package com.sai.sri.siddhi.batch.basic.tasklet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;


public class MyTasklet implements Tasklet {

    private Logger logger = LogManager.getLogger(getClass());

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        logger.info("start of execute method..");

        return RepeatStatus.FINISHED;
    }
}
