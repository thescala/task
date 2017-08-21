package com.mytask.task;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
 * @description： TaskJob
 * @author：zhang
 * @date：2017年8月21日
 */

@Component
public class TaskJob {
	
	@Scheduled(cron="0/5 * *  * * ? ")//每5秒执行一次
	public void print(){
        String time = DateFormat.getDateTimeInstance().format(new Date());
        System.out.println("定时器触发打印"+time);
    }

}
