package kib.odc.master.service;

import kib.odc.master.config.AppProperties;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MasterInit {

    private final AppProperties appProperties;

    public void init() {}

}
