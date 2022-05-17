import sbt.Keys.{publishMavenStyle, scalaVersion}
name := "flytekitspark"
organization := "io.github.dav009"
publishArtifact in (Compile, packageSrc) := true
publishArtifact in (Compile, packageDoc) := true
homepage := Some(url("https://github.com/dav009/flytekitspark"))
developers := List(
  Developer(id="dav009", name="David Przybilla", email="dav.alejandro@gmail.com", url=url("https://github.com/dav009"))
)
licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

publishMavenStyle := true
publishTo := sonatypePublishToBundle.value
scalaVersion := "2.12.10"
//enablePlugins(GitVersioning)
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
sonatypeCredentialHost := "s01.oss.sonatype.org"
scmInfo := Some(
    ScmInfo(url("https://github.com/dav009/flytekitspark"), "scm:git@github.com:dav009/ergo-puppet.git")
)


lazy val sonatypePublic = "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"
lazy val sonatypeReleases = "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
lazy val sonatypeSnapshots = "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers ++= Seq(Resolver.mavenLocal, sonatypeReleases, sonatypeSnapshots, Resolver.mavenCentral)

libraryDependencies += "org.flyte" % "flytekit-java" % "0.3.15"




