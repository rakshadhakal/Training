package com.eprabidhi.ecom.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class EcomSecurityConfig {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/admin/**").hasRole("ADMIN")
				.requestMatchers("/user/**").hasRole("USER"))
				.authorizeHttpRequests(
						authorize -> authorize.requestMatchers("/**").permitAll().anyRequest().authenticated())

				.formLogin(login -> login.defaultSuccessUrl("/welcome", true)
						// .successHandler(null)
						.failureUrl("/login?failed").permitAll())

				.logout(logout -> logout.logoutUrl("/logout").permitAll().invalidateHttpSession(true))

				.rememberMe(me -> me.key("Aabbccddeegg"));

		return http.build();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder)
				.usersByUsernameQuery(
						"select user_username, user_password, active from userdetail_table where user_username=?")

				.authoritiesByUsernameQuery("select ud.user_username, ur.role_userrole from userdetail_table "
	    				+ "as ud, role_table as ur where ud.user_id = ur.user_id and ud.user_username=?");
	}

}
