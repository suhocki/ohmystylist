plugins {
    kotlin("multiplatform") version "2.0.0"
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                val composeVersion = "1.6.20-dev1667"
                implementation("org.jetbrains.compose.web:web-core:$composeVersion")
                implementation("org.jetbrains.compose.runtime:runtime:$composeVersion")
            }
        }
    }
}
