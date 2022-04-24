package by.morka.bimbom.auth.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.Resource
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory
import java.security.KeyPair

@Configuration
class AuthBeans(
    @Value("\${custom.key-store}")
    private val keyStore: Resource,
    @Value("\${custom.key-store-password}")
    private val keyStorePassword: String,
    @Value("\${custom.key-pair-alias}")
    private val keyPairAlias: String,
    @Value("\${custom.key-pair-password}")
    private val keyPairPassword: String
) {

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()

    @Bean
    fun keyPair(): KeyPair = KeyStoreKeyFactory(keyStore, keyStorePassword.toCharArray())
        .getKeyPair(keyPairAlias, keyPairPassword.toCharArray())

    @Bean
    fun accessTokenConverter() = JwtAccessTokenConverter().apply { setKeyPair(keyPair()) }

    @Bean
    fun tokenStore() = JwtTokenStore(accessTokenConverter())
}