package org.example;

import java.util.ArrayList;
import java.util.List;

public class LoopInspector {
  public int loopSize(Node node) {
    List<Node> nodes = new ArrayList<>();
    while (node != null) {
      int index = nodes.indexOf(node);
      if (index >=0 ) {
        return nodes.size() - index;
      }
      nodes.add(node);
      node = node.getNext();
    }
    return -1;
  }
}