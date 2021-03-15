lazy val akkaHttpVersion  = "10.1.14"
lazy val akkaVersion      = "2.5.32"
lazy val jwtVersion       = "5.0.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.techmonad",
      scalaVersion    := "2.12.13"
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
      "org.scalatest"     %% "scalatest"            % "3.2.6"         % Test
    )
  )
