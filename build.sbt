import Dependencies._
import java.net.URL

name := "resttest"

organization := "pl.newicom"

version := "0.3.2"

homepage := Some(new URL("http://github.com/pawelkaczor/resttest"))

licenses := ("Apache2", new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")) :: Nil

scalaVersion := "2.11.7"

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"

publishMavenStyle := true

libraryDependencies ++= resttestDependencies

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.2"

parallelExecution in Test := false

Publish.settings