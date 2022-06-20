package com.hapi.hapi.configuracao;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ConfiguracaoSeguranca extends WebSecurityConfigurerAdapter{

    //Função que realiza a configuração de usuarios para requerimento de segurança
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        
        //metodo de criptografar senhas
        PasswordEncoder encoder =
            PasswordEncoderFactories.createDelegatingPasswordEncoder();
        
        //criação de usuarios para autenticação
        auth
            .inMemoryAuthentication()
            .withUser("front")
            .password(encoder.encode("HEFESTO2022br$"))
            .roles("USER")
            .and()
            .withUser("back")
            .password(encoder.encode("HEFESTO2022br$"))
            .roles("ADMIN","USER");

    }

    //metodo que define o que vai depender da autenticação
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {

        http
            .cors()
            .and()
            .authorizeRequests()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic()
            .and().csrf().disable();

    }
    
}
