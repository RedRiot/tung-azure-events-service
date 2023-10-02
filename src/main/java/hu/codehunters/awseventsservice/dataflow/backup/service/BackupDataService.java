package hu.codehunters.awseventsservice.dataflow.backup.service;

import hu.codehunters.awseventsservice.dataflow.EventProcessor;
import hu.codehunters.awseventsservice.service.model.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Profile("backup")
public class BackupDataService implements EventProcessor {

    @Override
    public void process(Event event) {
        log.info("Received event {}", event);
    }

}
