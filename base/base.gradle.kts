plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    buildToolsVersion(buildToolsVersion)

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // core
    implementation(Libraries.material)

    // androidx
    implementation(Libraries.ktxCore)
    implementation(Libraries.fragmentKtx)
    implementation(Libraries.appCompat)

    // hilt
    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)

    // timber
    implementation (Libraries.timber)

    // core test
    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)
}

android.sourceSets.all {
    java.srcDir("src/$name/kotlin")
}