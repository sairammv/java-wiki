package beingzero.trees;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MasterTreeLogic {
    static TreeMap<Integer, LinkedList<Integer>> distanceMap =
            new TreeMap<>();

    static TreeMap<Integer, LinkedList<Integer>> levelMap =
            new TreeMap<>();

    public static void main(String[] args) {
        Node root = new Node(10);
        Node rootLeft = new Node(20);
        Node rootRight = new Node(30);
        Node rootLeftRight = new Node(40);
        Node rootLeftLeft = new Node(50);
        Node rootRightRight = new Node(60);
        Node rootRightLeft = new Node(70);
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = rootLeftRight;
        rootLeft.right = rootLeftLeft;
        rootRight.right = rootRightLeft;
        rootRight.left = rootRightRight;

        fillMaps(root);

    }

    static void fillMaps(Node root) {
        fillMapsHelper(root, 0, 1);
    }

    static void fillMapsHelper(Node root, int distance, int level) {
        if (root == null) {
            return;
        }
        if (!distanceMap.containsKey(distance)) {
            LinkedList<Integer> path = new LinkedList<>();
            path.add(root.data);
            distanceMap.put(distance, path);
        } else {
            LinkedList<Integer> existingPath = distanceMap.get(distance);
            existingPath.add(root.data);
            distanceMap.put(distance, existingPath);
        }

        if (!levelMap.containsKey(distance)) {
            LinkedList<Integer> path = new LinkedList<>();
            path.add(root.data);
            levelMap.put(distance, path);
        } else {
            LinkedList<Integer> existingPath = distanceMap.get(distance);
            existingPath.add(root.data);
            levelMap.put(distance, existingPath);
        }
        fillMapsHelper(root.left, distance - 1, level + 1);
        fillMapsHelper(root.right, distance + 1, level + 1);
    }
}


