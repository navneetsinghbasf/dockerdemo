package org.tcs.mm;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



/** 
 * version : 1.0
 * This class loads Security Configuration class
 *  
 *  
 *  
 **/

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

   /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //.antMatchers("/").permitAll()
                .antMatchers("/h2/*").permitAll();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }*/
}
