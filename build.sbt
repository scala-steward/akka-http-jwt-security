lazy val akkaHttpVersion  = "10.2.4"
lazy val akkaVersion      = "2.6.14"
lazy val jwtVersion       = "7.1.3"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.techmonad",
      scalaVersion    := "2.13.5"
    )),
    name := "akka-http-jwt-security",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
      "com.github.jwt-scala"     %% "jwt-core"             % jwtVersion,

      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
      "org.scalatest"     %% "scalatest"            % "3.2.8"         % Test
    )
  )
