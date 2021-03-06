package com.sai.sri.siddhi.batch.xmltosql.main;

import javafx.application.Application;
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

        logger.info("started..");
        String[] springConfig = {"jobConfig.xml"};

        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("xmlToSqlJob");

        JobExecution execution = jobLauncher.run(job, new JobParameters());
        logger.info("Job Execution completed, status: " + execution.getStatus());
    }
}
