plugins {
    `kotlin-dsl`
}

repositories {
    google()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.5.30"))
    implementation(kotlin("serialization", version = "1.5.30"))
    implementation("org.jetbrains.dokka", "dokka-gradle-plugin", "1.5.0")
    implementation("io.gitlab.arturbosch.detekt", "detekt-gradle-plugin", "1.17.1")
    implementation(gradleApi())
    implementation(localGroovy())
}
