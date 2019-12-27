package com.tyss.assetmanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class AssetConfig {

		@Bean
		public LocalEntityManagerFactoryBean getEntityManager() {
			LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
			bean.setPersistenceUnitName("asset");
			return bean;
		}
}
