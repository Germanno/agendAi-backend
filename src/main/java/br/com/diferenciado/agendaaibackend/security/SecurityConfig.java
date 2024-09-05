package br.com.diferenciado.agendaaibackend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf ->csrf.disable())
                .authorizeHttpRequests(auth ->{
                    auth.requestMatchers("/alunos/").permitAll();
                    auth.requestMatchers("/enderecos/").permitAll();
                    auth.anyRequest().authenticated();
                        })

        ;
        return http.build();

    };
}
