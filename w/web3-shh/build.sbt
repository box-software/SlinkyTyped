organization := "org.scalablytyped.slinky"
name := "web3-shh"
version := "1.2.4-baf3b4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.0-cb1383",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20190328Z-b8d95e",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.4-82cf9a",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.4-7e94e2",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.4-ba30a7",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.2.4-a6e0c0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        