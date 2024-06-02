package com.eprabidhi.ecom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/prod_image/**")
		.addResourceLocations("file:/C:/Users/DELL/OneDrive/Desktop/e-commerce/product_image/")
		.setCachePeriod(3600);
	}

}
