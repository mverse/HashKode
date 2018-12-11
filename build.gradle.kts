import io.mverse.gradle.kotlinx

plugins {
  kotlin("jvm").version("1.3.10")
  id("io.mverse.project") version "0.5.32"
}

group = "io.mverse"


dependencies {
  compile("org.jetbrains.kotlin:kotlin-stdlib:1.3.11")
//  compile("org.jetbrains.kotlin:kotlin-reflect:1.3.10")
  testCompile("io.kotlintest:kotlintest:2.0.7")
}

dependencyManagement {
  dependencies {
    dependency("org.jetbrains.kotlin:kotlin-reflect:1.3.11")
  }
}

mverse {
  bom = "io.mverse:mverse-bom:0.5.13"
  isDefaultDependencies = false
  coverageRequirement = 0.0

}


