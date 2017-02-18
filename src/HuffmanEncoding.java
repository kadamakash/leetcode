/**
 * Created by Akash on 2/9/2017.
 */
class HuffmanNode{
    char val;
    HuffmanNode leftChild;
    HuffmanNode rightChild;
    Boolean isLeaf;

    HuffmanNode(char val){
        this.val = val;
        isLeaf = true;
    }
    HuffmanNode(){
        isLeaf = true;
    }

    public void setValue(char val){
        this.val = val;
    }
    public void setLeftChild(HuffmanNode leftChild){
        this.leftChild = leftChild;
    }
    public void setRightChild(HuffmanNode rightChild){
        this.rightChild = rightChild;
    }
    public void setAsLeafNode(){
        isLeaf = true;
    }
    public void setAsNonLeafNode(){
        isLeaf = false;
    }

    public char getVal(){
        return val;
    }
    public HuffmanNode getLeftChild(){
        return leftChild;
    }
    public HuffmanNode getRightChild(){
        return rightChild;
    }
    public Boolean isLeaf(){
        return isLeaf;
    }

}

public class HuffmanEncoding {

    char LEFT = '0';
    char RIGHT = '1';

    HuffmanNode root = null;

    public void createHuffmanTree(char val, String code){
        HuffmanNode currentNode = root;
        char newLine = ' ';
        for(char c : code.toCharArray()){
            if(LEFT == c){
                HuffmanNode leftChild = currentNode.getLeftChild();
                if(leftChild == null){
                    leftChild = new HuffmanNode(val);
                    currentNode.setAsNonLeafNode();
                    currentNode.setLeftChild(leftChild);
                }
                currentNode = currentNode.getLeftChild();
            } else if(RIGHT == c){
                HuffmanNode rightChild = currentNode.getRightChild();
                if(rightChild == null){
                    rightChild = new HuffmanNode(val);
                    currentNode.setAsNonLeafNode();
                    currentNode.setRightChild(rightChild);
                }
                currentNode = currentNode.getRightChild();
            }
            if(newLine == val){
                currentNode.setValue('\n');
            } else {
                currentNode.setValue(val);
            }

        }
    }
}
