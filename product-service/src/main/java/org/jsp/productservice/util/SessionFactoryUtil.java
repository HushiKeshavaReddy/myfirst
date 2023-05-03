package org.jsp.productservice.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class SessionFactoryUtil 
{
	
	@Bean
	public LocalSessionFactoryBean getfactory()
	{
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(getDataSource());
		bean.setHibernateProperties(getMysqlDbProperties());
		bean.setPackagesToScan("org.jsp.productservice.entity");
		return bean;
	}
	@Bean
	public DataSource getDataSource()  //database connection object.
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/config_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
   public static Properties getMysqlDbProperties()
   {
	   Properties properties = new Properties();
	   // properties.setproperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect"); when driver resolution cannot be null problem occurs.
	   properties.setProperty("hibernate.show_sql","true");
	   properties.setProperty("hibernate.hbm2ddl.auto","update");
	   return properties;
   }
}
