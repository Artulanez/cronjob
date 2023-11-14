package job;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.TimeZone;

@Service
public class JobOne implements SchedulingConfigurer {

    public void task(){
        System.out.println(LocalDateTime.now());
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar ){
        System.out.println("Config started");
        var cronExperssion = "* * * * * *";
        var timeZone = "America/Fortaleza";
        var cronTrigget = new CronTrigger(cronExperssion, TimeZone.getTimeZone(timeZone));
        taskRegistrar.addCronTask(new CronTask(this::task,cronTrigget));
        System.out.println("Config end");

    }
}
