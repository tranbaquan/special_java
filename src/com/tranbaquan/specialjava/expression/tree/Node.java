package com.tranbaquan.specialjava.expression.tree;

public class Node {
    private String value;
    private Node left;
    private Node right;

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public double doExpression() {
        if (left == null && right == null) {
            return Double.parseDouble(value);
        } else if (right == null) {
            return doCalculation(left.doExpression(), 0);
        }
        double a = left.doExpression();
        double b = right.doExpression();
        return doCalculation(a, b);
    }

    private double doCalculation(double a, double b) {
        switch (value) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "sin":
                return Math.sin(a);
            case "cos":
                return Math.cos(a);
        }
        return 0;
    }

    public void addLeft(Node node) {
        left = node;
    }

    public void addRight(Node node) {
        right = node;
    }

    @Override
    public String toString() {
        if (left == null && right == null) {
            return "[" + value + "]";
        }
        return "[" + value + "]\n" + "-L" + left + "\n-R" + right;
    }
}
