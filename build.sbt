
name := "neo4j-tests"

version := "1.0"

resolvers ++= Seq(
  "anormcypher" at "http://repo.anormcypher.org/", 
	  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.anormcypher" %% "anormcypher" % "0.4.3"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M5b" % "test"
