/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/8.1.1/userguide/building_java_projects.html
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.0"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.4.2")
    testImplementation("io.mockk:mockk:1.12.3")
    testImplementation("com.amazonaws:aws-java-sdk:1.12.504")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<Test> {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }

    systemProperty("kotest.framework.classpath.scanning.config.disable", true)
    systemProperty("kotest.framework.config.fqn", "evaluatetestperformance.KotestProjectConfig")
    systemProperty("kotest.framework.classpath.scanning.autoscan.disable", true)

    // always run tests
    outputs.upToDateWhen { false }

    reports.html.outputLocation.set(File("./reports"))

    doLast {
        val reportLocation = reports.html.outputLocation.get().toString() + "/index.html"
        println("unit test report located available at: $reportLocation")
    }
}
