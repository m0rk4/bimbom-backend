plugins {
    id("web-client-common-conventions")
}

dependencies {
    implementation("com.nimbusds:nimbus-jose-jwt:9.22")
    implementation("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.1.2.RELEASE")
    implementation("org.springframework.security.oauth:spring-security-oauth2:2.3.4.RELEASE")
    implementation("org.springframework.security:spring-security-jwt:1.0.9.RELEASE")
}