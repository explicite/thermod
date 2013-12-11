import AssemblyKeys._

name := "thermod"

version := "0.1"

scalaVersion := "2.10.2"

resolvers += "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"

resolvers += "termo-1" at "https://raw.github.com/Explicite/termo-1/mvn-repo"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "termo-1" % "termo-1" % "0.9-BETA"

assemblySettings

jarName in assembly := "thermod.jar"

mainClass in assembly := Some("thermo.Main")