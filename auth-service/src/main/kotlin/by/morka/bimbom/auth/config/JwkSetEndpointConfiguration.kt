package by.morka.bimbom.auth.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerSecurityConfiguration

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
class JwkSetEndpointConfiguration : AuthorizationServerSecurityConfiguration() {

    override fun configure(http: HttpSecurity) {
        super.configure(http)
        http
            .requestMatchers()
            .mvcMatchers("/.well-known/jwks.json")
            .and()
            .authorizeRequests()
            .mvcMatchers("/.well-known/jwks.json").permitAll()
    }
}