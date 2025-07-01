package com.example.bazel.lib;

/**
 * A tiny Greeter library for the Bazel Android "Hello, World" app.
 */
public class Greeter {
  private String name;

  public Greeter(String name) {
    this.name = name;
  }

  public String sayHello() {
    return "Hello Bazel! \uD83D\uDC4B\uD83C\uDF31"; // Unicode for 👋🌱
  }

  public String greet() {
    return "Hello, " + name + "!";
  }
}
