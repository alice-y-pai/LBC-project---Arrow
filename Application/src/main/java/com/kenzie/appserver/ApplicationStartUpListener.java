package com.kenzie.appserver;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/***This file created by Kenzie***/
@Component
public class ApplicationStartUpListener {

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // Perform any application start-up tasks
    }
}
