load("@rules_android//rules:rules.bzl", "android_library")

android_library(
    name = "example_instrumented_test",
    srcs = ["java/com/example/bazel/ExampleInstrumentedTest.java"],
    testonly = True,
    deps = [
        "//src/main/java/com/example/bazel:greeter",
        "@maven//:junit_junit",
    ],
)
