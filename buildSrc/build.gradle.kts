plugins {
    `kotlin-dsl`
}

group = "by.morka"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin:1.6.0")
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.6.0")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.0.11.RELEASE")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.6.6")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
}