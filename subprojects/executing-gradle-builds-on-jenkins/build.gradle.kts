plugins {
    id("org.gradle.guide")
}

guide {
    repositoryPath.set("gradle-guides/executing-gradle-builds-on-jenkins")
    minimumGradleVersion.set("4.10.3")
    displayName.set("Executing Gradle builds on Jenkins")
    category.set("Getting Started")
}

// TODO: gradle-site-plugin seems to be broken
tasks.named("checkAsciidoctorGuideContents") {
    enabled = false
}
