package kib.odc.production.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CheckUpProductionService {


    @PostConstruct
    public void checkUpProduction() {
        log.info("Check up production");
    }

}
