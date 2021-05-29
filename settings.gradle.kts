include(":app", ":base", ":logging", ":navigation", ":networking", ":sample-api", ":devdrawer", ":feature-one", ":feature-two", ":feature-three")
rootProject.name = "TjackBase"

rootProject.children.forEach { subProject ->
    subProject.buildFileName = "${subProject.name}.gradle.kts"
}
