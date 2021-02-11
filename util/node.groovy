String[] findNodesByName(String pattern) {
  return jenkins.model.Jenkins.get().computers
    .findAll { it.node.selfLabel =~ pattern }
    .collect { it.node.selfLabel.name }
}

String[] findNodesByLabel(String pattern) {
  return jenkins.model.Jenkins.get().computers
    .findAll { it.node.labelString =~ pattern }
    .collect { it.node.selfLabel.name }
}