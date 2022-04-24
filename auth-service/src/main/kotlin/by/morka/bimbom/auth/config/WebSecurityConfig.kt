package by.morka.bimbom.auth.config

import org.springframework.context.annotation.Bean
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.BeanIds
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@EnableWebSecurity
class WebSecurityConfig(private val passwordEncoder: PasswordEncoder) : WebSecurityConfigurerAdapter() {

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder)
    }

    @Override
    @Bean(name = [BeanIds.AUTHENTICATION_MANAGER])
    override fun authenticationManager(): AuthenticationManager = super.authenticationManager()

    @Bean
    override fun userDetailsService() =
        InMemoryUserDetailsManager(User.withUsername("enduser").passwordEncoder { passwordEncoder.encode(it) }
            .password("password").roles("USER").build())
}
