package com.dp.behavioural._15_Interpreter;

public class Client {

  public void main(AbstractSyntaxTree ast) {

    Context context = new Context("glide splitS glide barelRoll glide");

//    while (ast.hasNext()) {
//      Program node = ast.getNextNode();
//      node.interpret(context);
//    }
  }

  private class AbstractSyntaxTree {
  }
}
