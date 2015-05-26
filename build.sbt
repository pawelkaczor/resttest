import sbtrelease.ReleasePlugin._
import Dependencies._

name := "resttest"

organization := "pl.newicom"

version := "0.2.0"

homepage := Some(new java.net.URL("http://github.com/pawelkaczor/resttest"))

licenses := ("Apache2", new java.net.URL("http://www.apache.org/licenses/LICENSE-2.0.txt")) :: Nil

scalaVersion := "2.11.6"

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"

publishMavenStyle := true

libraryDependencies ++= resttestDependencies

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.2"

parallelExecution in Test := false

Publish.settings ++ releaseSettings