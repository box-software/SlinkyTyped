organization := "org.scalablytyped.slinky"
name := "nivo__radar"
version := "0.59.1-3c11e0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "nivo__colors" % "0.59.0-12ed1d",
  "org.scalablytyped.slinky" %%% "nivo__core" % "0.59.1-4aab5b",
  "org.scalablytyped.slinky" %%% "nivo__legends" % "0.59.1-19cf36",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        