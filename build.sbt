
lazy val root = (project in file("."))
  .settings ( name := "scala-template" )
  .settings ( BuildSettings.settings : _* )
  .settings ( resolvers ++= Seq(Resolvers.typesafeRepo) )
  .settings ( libraryDependencies ++= Dependencies.allDependencies )
  .settings ( scalacOptions ++= Seq("-unchecked", "-deprecation", "=Xlint", "Xfatal-warnings", "-feature") )
