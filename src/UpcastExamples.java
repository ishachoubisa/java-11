
class Tree{
    String type = "unknown";

    String getTreeString(){
        return "Tree";
    }
}

class DeciduousTree extends Tree {
    String type = "deciduous";

    String getTreeString(){
        return "Leafy Tree";
    }
}

class FruitTree extends Tree {
    String type = "fruit";

    String getTreeString(){
        return "Fruit Tree";
    }
}

public class UpcastExamples {
    public static void main(String[] args) {
        UpcastExamples upex = new UpcastExamples();

        DeciduousTree mapleTree = new DeciduousTree();
        FruitTree appleTree = new FruitTree();

        Tree genericTree = (Tree)mapleTree;

        System.out.println("Tree type = "+ mapleTree.type);

        System.out.println("Tree type = "+ ((Tree)mapleTree).type);

        upex.printTreeType((Tree)appleTree);
    }

    public void printTreeType(Tree tree){
        System.out.println("Tree type = "+ tree.getTreeString());
    }
}
