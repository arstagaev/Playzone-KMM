plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

android {
    namespace = "com.arstagaev.myplayzone.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.arstagaev.myplayzone.android"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    //implementation(project(":common:core"))
    //implementation(project(":common:games:api"))
    implementation(project(":common:umbrella-compose"))
    //implementation(project(":common:umbrella-core"))

//    implementation(Dependencies.Android.Compose.runtime)
//    implementation(Dependencies.Android.Compose.ui)
//    implementation(Dependencies.Android.Compose.material)
//    implementation(Dependencies.Android.Compose.icons)
//    implementation(Dependencies.Android.Compose.tooling)


    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.compose.foundation:foundation:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.activity:activity-compose:1.5.1")
//
//    implementation("com.google.android.material:material:1.6.1")
//    implementation("androidx.appcompat:appcompat:1.5.0")
}
