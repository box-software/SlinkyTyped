organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "3.3.3-12d400"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.6-4ee961",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.1-643d88",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.8-b39959",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.11.5-c23144",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.11-df356b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        