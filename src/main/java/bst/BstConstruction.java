package bst;

public class BstConstruction {
    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    BST newBst = new BST(value);
                    left = newBst;
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    BST newBst = new BST(value);
                    right = newBst;
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            //https://www.jetbrains.com/help/idea/configuring-project-and-ide-settings.html#restore-defaults
            if (value < this.value) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else if (value > this.value) {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            } else {

                return true;
            }

        }

        public BST remove(int value) {
            return remove(value, null);
        }

        private BST remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            } else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            } else {
                if (left != null && right != null) {
                    this.value = right.getMinValue();
                    right.remove(this.value, this);
                } else if (parent == null) {
                    if (left != null) {
                        this.value = left.value;
                        right = left.right;
                        left = left.left;
                    } else if (right != null) {
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    } else {
                        //only parent node
                    }
                } else if (parent.left == this) {
                    parent.left = left != null ? left : right;

                } else if (parent.right == this) {
                    parent.right = left != null ? left : right;
                }
            }
            return this;
        }

        private int getMinValue() {
            if (left == null) {
                return this.value;
            } else {
                return left.getMinValue();
            }
        }
    }
}

