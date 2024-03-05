package com.example.jooqreactivetest;

import io.r2dbc.spi.ConnectionFactory;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class JooqReactiveConfiguration {
    private final ConnectionFactory connectionFactory;

    @Bean
    public DSLContext jooqDslContext() {
        return DSL.using(connectionFactory).dsl();
    }
}
