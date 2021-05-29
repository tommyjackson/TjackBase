
const val kotlinVersion = "1.5.0"
const val buildToolsVersion = "30.0.2"

object BuildPlugins {

    object Versions {
        const val gradlePluginVersion = "4.2.1"
        const val hiltPluginVersion = "2.35"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePluginVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val javaLibrary = "java-library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val hiltClasspathPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltPluginVersion}"
    const val hiltPlugin = "dagger.hilt.android.plugin"
}

object AndroidSdk {
    const val min = 24
    const val compile = 30
    const val target = compile
}

object Libraries {
    private object Versions {
        const val jetpack = "1.2.0"
        const val constraintLayout = "1.1.2"
        const val ktx = "1.3.2"
        const val hilt = "2.35"
        const val material = "1.3.0"
        const val lifecycle = "2.3.1"
        const val moshi = "1.11.0"
        const val retrofit = "2.9.0"
        const val retrofitMoshiConverter = "2.4.0"
        const val timber = "4.7.1"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.ktx}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofitMoshiConverter}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.13.2"
        const val testRunner = "1.1.2"
        const val espresso = "3.3.0"
    }
    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}