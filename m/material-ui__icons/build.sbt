organization := "org.scalablytyped.slinky"
name := "material-ui__icons"
version := "4.5.1-a70e94"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20191112Z-dde020",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20190715Z-45c376",
  "org.scalablytyped.slinky" %%% "jss" % "10.0.0-a1afec",
  "org.scalablytyped.slinky" %%% "material-ui__core" % "3.9.3-596f22",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.0-c65b3b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-26f45e",
  "org.scalablytyped.slinky" %%% "react-transition-group" % "4.2-dt-20191126Z-3eb784",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        