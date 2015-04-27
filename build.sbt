import sbtrelease.ReleasePlugin._
import Dependencies._

name := "resttest"

organization := "pl.newicom"

version := "0.2.0-SNAPSHOT"

scalaVersion := "2.11.5"

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "spray repo" at "http://repo.spray.io/"

publishMavenStyle := true

libraryDependencies ++= resttestDependencies

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.2"

parallelExecution in Test := false

Publish.settings ++ releaseSettings