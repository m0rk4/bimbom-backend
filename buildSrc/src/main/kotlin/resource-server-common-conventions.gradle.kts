plugins {
    id("web-client-common-conventions")
}

dependencies {
    implementation("org.springframework.security:spring-security-config:5.6.3")
    implementation("org.springframework.security:spring-security-oauth2-jose:5.6.3")
    implementation("org.springframework.security:spring-security-oauth2-resource-server:5.6.3")
}