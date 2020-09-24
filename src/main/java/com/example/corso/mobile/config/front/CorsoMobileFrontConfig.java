package com.example.corso.mobile.config.front;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mobile.device.DeviceHandlerMethodArgumentResolver;
import org.springframework.mobile.device.DeviceResolverHandlerInterceptor;
import org.springframework.mobile.device.site.SitePreferenceHandlerMethodArgumentResolver;
import org.springframework.mobile.device.switcher.SiteSwitcherHandlerInterceptor;
import org.springframework.mobile.device.view.LiteDeviceDelegatingViewResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Decido di usare il progetto spring-webmvc con l'annotation @EnableWebMvc
//Sono obbligato a implementare l'interface WebMvcConfigurer e/o estendere
//WebMvcConfigurerAdapter (con Spring >= 5 posso evitare l'Adapter).
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example.corso.mobile.controller")
public class CorsoMobileFrontConfig implements WebMvcConfigurer {

	// VEDI CONFIGURAZIONE MOBILE
//	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		return bean;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// <mvc:resources mapping="/resources/webjars/**" location="/resources/
		// classpath:META-INF/resources/webjars/"/>
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/",
				"classpath:META-INF/resources/webjars/");
		// <mvc:resources mapping="/sandbox*" location="/"/>
		registry.addResourceHandler("/sandbox*").addResourceLocations("/");
	}

	// CONFIGURAZIONE SPRING MOBILE

	@Bean
	public LiteDeviceDelegatingViewResolver liteDeviceAwareViewResolver() {
		InternalResourceViewResolver delegate = internalResourceViewResolver();
		LiteDeviceDelegatingViewResolver resolver = new LiteDeviceDelegatingViewResolver(delegate);
		resolver.setMobilePrefix("mobile/");
		resolver.setMobileSuffix("-mobile");
		resolver.setTabletPrefix("normal/");
		resolver.setTabletSuffix("-normal");
		resolver.setNormalPrefix("normal/");
		resolver.setNormalSuffix("-normal");
//		delegate.setViewClass(CheckingJstlView.class);
//		resolver.setEnableFallback(true);
		return resolver;
	}

	@Bean
	public DeviceResolverHandlerInterceptor deviceResolverHandlerInterceptor() {
		return new DeviceResolverHandlerInterceptor();
	}

	@Bean
	public SiteSwitcherHandlerInterceptor siteSwitcherHandlerInterceptor() {
		return SiteSwitcherHandlerInterceptor.urlPath("/m", "/mobile-corso-2020");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(deviceResolverHandlerInterceptor());
		registry.addInterceptor(siteSwitcherHandlerInterceptor());
	}

	@Bean
	public DeviceHandlerMethodArgumentResolver deviceHandlerMethodArgumentResolver() {
		return new DeviceHandlerMethodArgumentResolver();
	}

	@Bean
	public SitePreferenceHandlerMethodArgumentResolver sitePreferenceHandlerMethodArgumentResolver() {
		return new SitePreferenceHandlerMethodArgumentResolver();
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(deviceHandlerMethodArgumentResolver());
		argumentResolvers.add(sitePreferenceHandlerMethodArgumentResolver());
	}
}
