import sbt._
import Keys._
import xerial.sbt.Sonatype.sonatypeSettings

object Publish {
  lazy val settings = sonatypeSettings :+ (pomExtra :=
    <scm>
      <url>git@github.com:pawelkaczor/resttest.git</url>
      <connection>scm:git:git@github.com:pawelkaczor/resttest.git</connection>
      <developerConnection>scm:git:git@github.com:pawelkaczor/resttest.git</developerConnection>
    </scm>
      <developers>
        <developer>
          <id>newicom</id>
          <name>Pawel Kaczor</name>
        </developer>
      </developers>)
}