name := "argonaut-sum-example"

version := "1.0.0"

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked", // Enable additional warnings where generated code depends on assumptions
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Xlint", // Enable recommended additional warnings.
  "-Xfatal-warnings",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
  )

resolvers ++= Seq(
  "Java.net Maven2 Repository"     at "http://download.java.net/maven/2/",
  "Sonatype scala-tools repo"      at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype scala-tools releases"  at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype scala-tools snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
    "org.scalaz"     %% "scalaz-core"   % "7.1.0",
    "io.argonaut"    %% "argonaut"      % "6.1-M5",
    "com.github.alexarchambault" %% "argonaut-shapeless_6.1" % "0.1.1",
    "junit"          %  "junit"         % "4.7"    % "test",
    "org.specs2"     %% "specs2"        % "2.4.15" % "test",
    "org.scalacheck" %% "scalacheck"    % "1.12.1" % "test",
    "org.typelevel"  %% "scalaz-specs2" % "0.3.0"  % "test"
)