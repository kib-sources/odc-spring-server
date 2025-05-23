package kib.odc.master.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "master")
public record AppProperties(
        String name,
        String dbName,
        boolean savePrivateKeysInDb
) {
}
