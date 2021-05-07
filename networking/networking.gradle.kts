plugins {
    id(BuildPlugins.javaLibrary)
}

dependencies {
    // moshi
    api (Libraries.moshi)

    // retrofit
    api (Libraries.retrofit)
    api (Libraries.retrofitMoshiConverter)
}

sourceSets.all {
    java.srcDir("src/$name/kotlin")
}