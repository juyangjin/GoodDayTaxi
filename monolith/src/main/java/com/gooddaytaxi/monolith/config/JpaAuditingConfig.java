package com.gooddaytaxi.monolith.config;

import com.gooddaytaxi.account.infrastructure.audit.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.UUID;

@Configuration(proxyBeanMethods = false)
@EnableJpaAuditing(auditorAwareRef = "accountAuditorAware")
public class JpaAuditingConfig {

    @Bean
    AuditorAware<UUID> accountAuditorAware(AuditorAwareImpl delegate) {
        return delegate;
    }
}
