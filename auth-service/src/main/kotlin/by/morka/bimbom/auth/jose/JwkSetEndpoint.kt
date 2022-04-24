package by.morka.bimbom.auth.jose

import com.nimbusds.jose.jwk.JWKSet
import com.nimbusds.jose.jwk.RSAKey
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.security.KeyPair
import java.security.interfaces.RSAPublicKey

@FrameworkEndpoint
class JwkSetEndpoint(private val keyPair: KeyPair) {

    @GetMapping("/.well-known/jwks.json")
    @ResponseBody
    fun getKey(): Map<String, Any> {
        val publicKey = keyPair.public as RSAPublicKey
        val key = RSAKey.Builder(publicKey).build()
        return JWKSet(key).toJSONObject()
    }
}