load("@rules_android//rules:rules.bzl", "android_library")
load("@rules_java//java:defs.bzl", "java_library")

package(
    default_visibility = ["//src:__subpackages__"],
)

java_library(
    name = "greeter",
    srcs = ["Greeter.java"],
    visibility = ["//visibility:public"],
)

android_library(
    name = "greeter_activity",
    srcs = [
        "MainActivity.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [":greeter"],
)