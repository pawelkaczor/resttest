import Dependencies._
import java.net.URL

name := "resttest"

organization := "pl.newicom"

version := "0.4.0"

homepage := Some(new URL("http://github.com/pawelkaczor/resttest"))

licenses := ("Apache2", new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")) :: Nil

scalaVersion := "2.12.1"
crossScalaVersions := Seq("2.12.1", "2.11.8")

scalaVersion in Test:= "2.11.8"

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"

publishMavenStyle := true

libraryDependencies ++= resttestDependencies

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.21"

parallelExecution in Test := false

Publish.settings