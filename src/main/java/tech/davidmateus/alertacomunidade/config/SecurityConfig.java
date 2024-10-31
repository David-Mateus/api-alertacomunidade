package tech.davidmateus.alertacomunidade.config;
// configuração o spring security

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    private SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //customizar toda questão de segurança do projeto
        http
                .authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated()) // qualquer requisição deve ser autorizada
                .csrf(csrf -> csrf.disable()) //proteção contra CSRF (Cross-Site Request Forgery)
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); //Spring Security não manterá informações de sessão entre requisições.
        return http.build();
    }
}
