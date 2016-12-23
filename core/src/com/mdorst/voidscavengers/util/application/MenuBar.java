package com.mdorst.voidscavengers.util.application;

public class MenuBar {
  public static void setApplicationName(String name) {
    // This sets the application name listed in the menu bar on a mac to Void Scavengers
    System.setProperty("com.apple.mrj.application.apple.menu.about.name", name);
  }
}
