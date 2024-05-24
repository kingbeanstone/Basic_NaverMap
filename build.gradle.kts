// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application) apply false
}


//buildscript {
//
//    repositories {
//        google()
//        jcenter()
//    }
//    dependencies {
//        classpath 'com.android.tools.build:gradle:3.2.1'
//
//
//        // NOTE: Do not place your application dependencies here; they belong
//        // in the individual module build.gradle files
//    }
//} 책 버전....


//핵심...
allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://repository.map.naver.com/archive/maven")
    }
}


//task clean(type: Delete) {
//    delete rootProject.buildDir
//}