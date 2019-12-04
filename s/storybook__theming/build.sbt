organization := "org.scalablytyped.slinky"
name := "storybook__theming"
version := "5.2.6-42ad63"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.19-5d9cb0",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-e5c729",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-213c24",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-fb148f",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-dd36fe",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-7e2d6a",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-26f45e",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        