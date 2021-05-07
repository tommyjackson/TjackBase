plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.hiltPlugin)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    buildToolsVersion(buildToolsVersion)

    defaultConfig {
        applicationId = "com.tjackapps.tjackbase"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // projects
    implementation(project(":base"))
    implementation(project(":logging"))

    // core
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.material)

    // androidx
    implementation(Libraries.ktxCore)
    implementation(Libraries.fragmentKtx)
    implementation(Libraries.appCompat)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.viewModel)
    kapt(Libraries.lifecycleCompiler)

    // hilt
    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)

    // core test
    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)
}

android.sourceSets.all {
    java.srcDir("src/$name/kotlin")
}