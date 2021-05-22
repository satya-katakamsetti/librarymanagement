package com.lms.squad4.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.lms.squad4.repositories")
@EnableTransactionManagement
public class PersistenceContext {
	@Bean(destroyMethod = "close")
	HikariDataSource dataSource(Environment env) {
	    HikariDataSource dataSource = new HikariDataSource();
		
		dataSource.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
		
		/* hikari configuration connection pool properties */
		dataSource.setMinimumIdle(Integer.parseInt(env.getRequiredProperty("spring.datasource.hikari.minimum-idle")));
		dataSource.setMaximumPoolSize(Integer.parseInt(env.getRequiredProperty("spring.datasource.hikari.maximum-pool-size")));
        dataSource.setAutoCommit(Boolean.parseBoolean(env.getRequiredProperty("spring.datasource.hikari.auto-commit")));
        dataSource.setIdleTimeout(Long.parseLong(env.getRequiredProperty("spring.datasource.hikari.idle-timeout")));
		dataSource.setMaxLifetime(Long.parseLong(env.getRequiredProperty("spring.datasource.hikari.max-lifetime")));
        dataSource.setConnectionTimeout(Long.parseLong(env.getRequiredProperty("spring.datasource.hikari.connection-timeout")));
		Properties dsProp=new Properties();
		dsProp.put("cachePrepStmts" , "true");
		dsProp.put( "prepStmtCacheSize" , "250");
		dsProp.put( "prepStmtCacheSqlLimit" , "2048");
        dataSource.setDataSourceProperties(dsProp);
        return dataSource;
	}
	

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory(HikariDataSource dataSource, Environment env) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("com.lms.squad4.entities");
		
		Properties jpaProperties = new Properties();

		// Configures the used database dialect. This allows Hibernate to create SQL
		// that is optimized for the used database.
		jpaProperties.put("hibernate.dialect", env.getRequiredProperty("spring.jpa.properties.hibernate.dialect"));
		jpaProperties.put("hibernate.enable_lazy_load_no_trans", true);

		// If the value of this property is true, Hibernate writes all SQL
		// statements to the console.
		jpaProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));

		// If the value of this property is true, Hibernate will format the SQL
		// that is written to the console.
		jpaProperties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		
		jpaProperties.put("hibernate.max_fetch_depth", env.getRequiredProperty("hibernate.max_fetch_depth"));

		entityManagerFactoryBean.setJpaProperties(jpaProperties);

		return entityManagerFactoryBean;
	}
	

	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
}
