include(":logging")
include(":app", ":networking")
rootProject.name = "TjackBase"

rootProject.children.forEach { subProject ->
    subProject.buildFileName = "${subProject.name}.gradle"
}