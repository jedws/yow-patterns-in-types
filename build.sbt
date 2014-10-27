name := "introduction-to-fp-in-scala"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core"    % "7.1.0",
  "org.specs2" %% "specs2"         % "2.4.9"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.6" % "test"
)

resolvers ++= Seq(
  "oss snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "oss releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

scalacOptions := Seq(
  "-deprecation",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xlint",
  "-feature",
  "-language:_"
)
