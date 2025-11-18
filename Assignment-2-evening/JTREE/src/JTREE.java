import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTREE {

    public static void main(String[] args) {

        JFrame frame = new JFrame("style");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");

       
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        
        color.add(new DefaultMutableTreeNode("red"));
        color.add(new DefaultMutableTreeNode("blue"));
        color.add(new DefaultMutableTreeNode("black"));
        color.add(new DefaultMutableTreeNode("green"));
     
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");

        style.add(color);
        style.add(font);

        JTree tree = new JTree(style);
        JScrollPane treeView = new JScrollPane(tree);

        frame.add(treeView);

        frame.setVisible(true);
    }
}
