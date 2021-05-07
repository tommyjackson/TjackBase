repositories {
    mavenCentral()
}

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}


kotlinDslPluginOptions {
    experimentalWarning.set(false)
}