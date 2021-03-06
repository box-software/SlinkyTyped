organization := "org.scalablytyped.slinky"
name := "dc"
version := "0.0-unknown-dt-20191210Z-5a2729"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-fa9d5f",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-e8dbdc",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-98e406",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        