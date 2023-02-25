package pe.company.security;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("antoine").password(passwordEncoder().encode("a123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("werther").password(passwordEncoder().encode("w123")).roles("USER");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{		
		http.authorizeRequests()
		    .antMatchers("/listar_public").permitAll()
		    .antMatchers("/listar_admin").access("hasRole('ADMIN')")
		    .antMatchers("/listar_user").access("hasRole('USER')");
		
		http.authorizeRequests().and()
			.httpBasic();
		
		http.authorizeRequests().and()
			.csrf().disable();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
