enablePlugins(ScalaJSPlugin)

name := "hello world"

version := "0.1-SNAPSHOT"
scalaVersion := "2.12.8"

scalaJSUseMainModuleInitializer := true // we have a main method

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.4",
  "com.lihaoyi" %%% "scalatags" % "0.6.7",
  "com.lihaoyi" %% "utest" % "0.6.6" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")

jsDependencies += "org.webjars" % "jquery" % "3.3.1-1" / "3.3.1-1/jquery.js"

skip in packageJSDependencies := false

scalaJSStage in Global := FastOptStage  // use FullOptStage for Production

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
