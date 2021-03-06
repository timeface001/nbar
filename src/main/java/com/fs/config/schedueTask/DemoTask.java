package com.fs.config.schedueTask;/**
 * Created by fengsong on 2017/3/22.
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author fengsong
 * @description:一句话描述下类的功能
 * @time 2017-03-22 15:54
 **/
@Component
public class DemoTask {

    @Scheduled(cron = "*/1 * * * * ?")
    public void process(){

        new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println(1);
                return null;
            }
        }).run();

    }
}
