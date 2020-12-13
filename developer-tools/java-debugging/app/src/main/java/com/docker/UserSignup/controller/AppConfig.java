//package com.docker.UserSignup.controller;
//
//import java.util.Properties;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableJpaRepositories
//@EnableTransactionManagement
//class AppConfig {
//
//  @Bean
//  public DataSource dataSource() {
//
//	DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	dataSource.setUrl("jdbc:mysql://localhost:3306/dockercon2035");
//	dataSource.setUsername("gordon");
//	dataSource.setPassword("password");
//	  
//	return dataSource;
//  }
//
//  @Bean
//  public EntityManagerFactory entityManagerFactory() {
//
//    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//    vendorAdapter.setGenerateDdl(true);
//
//    LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
//    entityManagerFactory.setJpaVendorAdapter(vendorAdapter);
//    entityManagerFactory.setPackagesToScan("com.docker.UserSignup.repository");
//    entityManagerFactory.setDataSource(dataSource());
//    entityManagerFactory.afterPropertiesSet();
//    Properties jpaPropertyMap = new Properties();
//    jpaPropertyMap.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
//    jpaPropertyMap.setProperty("hibernate.hbm2ddl.auto", "validate");
//    jpaPropertyMap.setProperty("hibernate.format_sql", "true");
//    entityManagerFactory.setJpaProperties(jpaPropertyMap);
//
//    return entityManagerFactory.getObject();
//  }
//
//  @Bean
//  public PlatformTransactionManager transactionManager() {
//
//    JpaTransactionManager transactionManager = new JpaTransactionManager();
//    transactionManager.setEntityManagerFactory(entityManagerFactory());
//    return transactionManager;
//  }
//}
