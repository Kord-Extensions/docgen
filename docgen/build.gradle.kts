import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        maven {
            name = "KotDis"
            url = uri("https://maven.kotlindiscord.com/repository/maven-public/")
        }
    }
}

plugins {
    `docgen-module`
    `published-module`
}

dependencies {
    api(project(":docgen-core"))
    api(project(":docgen-generator"))
    api(project(":docgen-templates"))
}

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    languageVersion = "1.5"
}
