rootProject.name = "hashkode"

//include("jsonskema-js")

pluginManagement {
  repositories {
    jcenter()
    gradlePluginPortal()
    google()
    maven("https://dl.bintray.com/mverse-io/mverse-public")
    maven("https://kotlin.bintray.com/kotlinx")
  }

  resolutionStrategy {
    this.eachPlugin {
      if (requested.id.id == "kotlinx-serialization") {
        useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
      }
    }
  }
}

