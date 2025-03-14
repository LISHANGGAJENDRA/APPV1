pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        maven(url = "https://jitpack.io")
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven(url = "https://jitpack.io")
        mavenCentral()
    }
}
rootProject.name = "Bard"
include(":app")