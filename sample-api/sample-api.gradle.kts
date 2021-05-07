plugins {
    id(BuildPlugins.javaLibrary)
}

dependencies {
    // core
    implementation(project(":networking"))
}

sourceSets.all {
    java.srcDir("src/$name/kotlin")
}