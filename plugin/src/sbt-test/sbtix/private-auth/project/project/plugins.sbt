if (sys.props.contains("plugin.version")) {
  addSbtPlugin("se.nullable.sbtix" % "sbtix" % sys.props("plugin.version"))
} else {
  Seq()
}

resolvers += Resolver.typesafeIvyRepo("releases")

resolvers += Resolver.sbtPluginRepo("releases")
