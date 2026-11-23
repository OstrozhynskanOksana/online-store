plugins {
    // Auto-provisions the JDK required by the Java toolchain if it is not installed locally
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "online-store"

include(
    "common",
    "api-gateway",
    "auth-service",
    "user-service",
    "catalog-service",
    "cart-service",
    "order-service",
    "notification-service",
)
