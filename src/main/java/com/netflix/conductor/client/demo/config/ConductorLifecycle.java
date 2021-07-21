/*
package com.netflix.conductor.client.demo.config;

import java.util.concurrent.atomic.AtomicBoolean;

import com.netflix.conductor.client.automator.TaskRunnerConfigurer;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConductorLifecycle implements SmartLifecycle {

	AtomicBoolean isRunning = new AtomicBoolean(false);
   // WorkflowTaskCoordinator taskCoordinator;
    TaskRunnerConfigurer taskRunnerConfigurer;
    public ConductorLifecycle(TaskRunnerConfigurer taskRunnerConfigurer) {
        this.taskRunnerConfigurer = taskRunnerConfigurer;
    }

    @Override
    public void start() {
    	System.out.println("Starting taskCoord");
        taskRunnerConfigurer.init();;
    }

    @Override
    public void stop() {
        taskRunnerConfigurer.shutdown();
    }

    @Override
    public boolean isRunning() {
        return isRunning.get();
    }
}
*/
