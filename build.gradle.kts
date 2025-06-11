plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.pond"
version = "1.0.1"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.2")         // Use IntelliJ version you're targeting
    type.set("IC")                // "IC" for Community, "IU" for Ultimate
    plugins.set(listOf("java"))   // Required plugins
}

tasks {
    patchPluginXml {
        version.set(project.version.toString())
        sinceBuild.set("232")
    }

    buildSearchableOptions {
        enabled = false  // Optional: speeds up build
    }
}