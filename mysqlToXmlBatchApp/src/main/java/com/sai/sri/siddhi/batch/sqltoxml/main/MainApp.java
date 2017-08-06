package com.sai.sri.siddhi.batch.sqltoxml.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    private static Logger logger = LogManager.getLogger(MainApp.class);

    public static void main(String[] args) throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        String[] springConfig = {"jobConfig.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springConfig);
        JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
        Job job = (Job) applicationContext.getBean("sqlToXmlJob");
        JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
        logger.info("job execution completed: " + jobExecution.getStatus());
    }
}
