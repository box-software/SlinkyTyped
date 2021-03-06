organization := "org.scalablytyped.slinky"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20190717Z-9bb470"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "dnd-core" % "9.5.1-2c389e",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-adc998",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "react-dnd" % "9.5.1-72494c",
  "org.scalablytyped.slinky" %%% "react-sortable-tree" % "0.3-dt-20191024Z-f485fb",
  "org.scalablytyped.slinky" %%% "react-virtualized" % "9.21-dt-20191218Z-fd0a65",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-95021d",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        