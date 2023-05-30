/*
 * package com.project.init.Security;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.web.SecurityFilterChain; import
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 * 
 * 
 * @EnableWebSecurity public class SecurityConfig{
 * 
 * 
 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
 * throws Exception { http .csrf() .disable() .authorizeHttpRequests()
 * .requestMatchers("/") .permitAll() .anyRequest() .authenticated()
 * 
 * }
 * 
 * 
 * }
 */