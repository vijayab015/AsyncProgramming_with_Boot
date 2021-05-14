package com.example.demo.config;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig extends AsyncConfigurerSupport {
	
	@Autowired
	private AsyncExceptionHandler asyncExcHandeller;

    @Override
    public Executor getAsyncExecutor()
	{
		ThreadPoolTaskExecutor taskExecuter=new ThreadPoolTaskExecutor();
		taskExecuter.setCorePoolSize(5);
		taskExecuter.setMaxPoolSize(10);
		taskExecuter.setQueueCapacity(500);
		taskExecuter.setThreadNamePrefix("Async Example Thread -");
		taskExecuter.initialize();
		return taskExecuter;
	}
    
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler()
    {
    	return asyncExcHandeller;
    }
    
	
}
