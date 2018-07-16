package com.test;

import org.gradle.api.Plugin;
import org.gradle.api.Project;


class TestPlugin implements Plugin<Project> {

  public void apply(Project project) {
      System.out.println("------------------开始----------------------");
      System.out.println("这是我们的自定义插件!");
      System.out.println("------------------结束----------------------->");
      def android = project.extensions.getByType(AppExtension)
      //注册一个Transform
      def classTransform = new MyClassTransform(project);
      android.registerTransform(classTransform);
  }
}
