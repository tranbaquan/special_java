package com.tranbaquan.specialjava.expression.tree;

public class BinaryTree {

    public Node parseExpression(String expression) {
        Node node;
        expression = expression.trim();
        String left = getLeftSubExpression(expression);
        if (left.length() == expression.length()) {
            return new Node(left);
        }
        String right = expression.substring(left.length() + 1);
        node = new Node(expression.substring(left.length(), left.length() + 1));

        if (left.startsWith("(") && left.endsWith(")")) {
            left = left.substring(1, left.length() - 1);
        }
        if (right.startsWith("(") && right.endsWith(")")) {
            right = right.substring(1, right.length() - 1);
        }
        node.addLeft(parseExpression(left));
        node.addRight(parseExpression(right));
        return node;
    }

    private String getLeftSubExpression(String expression) {

        String[] pieces = expression.split("(?=[-+])|(?<=[-+])");
        StringBuilder builder = new StringBuilder();
        if (pieces.length > 1) {
            for (int i = 0; i < pieces.length-1; i++){
                builder.append(pieces[i]);
                if(isCorrectSubExpression(builder)) {
                    return builder.toString();
                }
            }
        }
        builder = new StringBuilder();
        pieces = expression.split("(?=[/*])|(?<=[/*])");
        if (pieces.length > 1) {
            for (int i = 0; i < pieces.length-1; i++){
                builder.append(pieces[i]);
                if(isCorrectSubExpression(builder)) {
                    return builder.toString();
                }
            }
        }
        return pieces[0];
    }


    public boolean isCorrectSubExpression(StringBuilder subExpression) {
        int count = 0;
        for (int i = 0; i < subExpression.length(); i++) {
            if (subExpression.charAt(i) == '(') {
                count++;
            } else if (subExpression.charAt(i) == ')') {
                count--;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        Node n = b.parseExpression("(3+3*4)*2/2");
        System.out.println(n.doExpression());
    }
}
