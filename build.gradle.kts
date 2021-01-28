plugins {
    java
    kotlin("jvm") version "1.4.10"
    antlr
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.freemarker:freemarker:2.3.20")
    antlr("org.antlr:antlr4:4.7")
}

tasks.generateGrammarSource {
    arguments = arguments + listOf("-visitor", "-package", "generator")
    outputDirectory = file("src/main/java/generator")
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}