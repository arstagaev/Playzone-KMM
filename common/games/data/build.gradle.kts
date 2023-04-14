plugins {
    id(Dependencies.Plugin.multiplatformSetup)
    id(Dependencies.Plugin.androidSetup)
    kotlin("plugin.serialization")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                //api(project(":common:games:api"))
                implementation(project(":common:core"))
            }
        }
    }
}