package com.umu.arrui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.umu.arrui.repository", entityManagerFactoryRef = "trWebEntityManager", transactionManagerRef = "trWebTransactionManager")
public class DatabseConfigurationArrui {

}
