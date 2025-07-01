load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "example_unit_test",
    srcs = ["java/com/example/bazel/ExampleUnitTest.java"],
    test_class = "com.example.bazel.ExampleUnitTest",
    deps = [
        "//src/main/java/com/example/bazel:greeter",
        "@maven//:junit_junit",
        "@maven//:org_assertj_assertj_core",
    ],
)
