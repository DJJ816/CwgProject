package com.bdqn.config;

import com.bdqn.component.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;

@Configuration
public class Myconfiger  {

    @Bean
    public FilterRegistrationBean setFilterRegistrationBean(){
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LoginFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/bizpage/*"));
        return filterRegistrationBean;
    }
}
