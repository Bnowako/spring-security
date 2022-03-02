package blaze98.ssiach2ex1.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@RequiredArgsConstructor
public class WebAuthorizationConfig extends WebSecurityConfigurerAdapter {

    private final CustomAuthenticationSuccessHandler authenticationSuccessHandler;

    private final CustomAuthenticationFailureHandler authenticationFailureHandler;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin();
        http.authorizeRequests().anyRequest().authenticated();
        http.formLogin()
                .successHandler(authenticationSuccessHandler)
                .failureHandler(authenticationFailureHandler);
        http.authorizeRequests()
                .anyRequest().authenticated();
        http.formLogin()
                .defaultSuccessUrl("/home", true);
        http.authorizeRequests()
                .anyRequest().authenticated();
    }

}
