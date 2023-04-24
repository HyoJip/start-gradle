package me.bbbicb.worker;

public class HelloBot {

  private final String helloComment;

  public HelloBot(String helloComment) {
    this.helloComment = helloComment;
  }

  public String hello() {
    return this.helloComment;
  }
}
