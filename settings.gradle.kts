include(":app", ":base", ":logging", ":networking", ":sample-api")
rootProject.name = "TjackBase"

rootProject.children.forEach { subProject ->
    subProject.buildFileName = "${subProject.name}.gradle.kts"
}