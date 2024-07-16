package Daily_Problems;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.tree.TreeNode;

public class Create_binary_tree_from_descriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer>ans=new HashSet<>();
        HashMap<Integer,TreeNode> mp=new HashMap<>();
        for(int i=0;i<descriptions.length;i++){
            if(!mp.containsKey(descriptions[i][0])){
                mp.put(descriptions[i][0],new TreeNode(descriptions[i][0]));
            }
            if(!mp.containsKey(descriptions[i][1])){
                mp.put(descriptions[i][1],new TreeNode(descriptions[i][1]));
            }
            if(descriptions[i][2]==1){
                mp.get(descriptions[i][0]).left=mp.get(descriptions[i][1]);
            }
            if(descriptions[i][2]==0){
                mp.get(descriptions[i][0]).right=mp.get(descriptions[i][1]);
            }
            ans.add(descriptions[i][1]);
        }
        for(int i=0;i<descriptions.length;i++){
            if(!ans.contains(descriptions[i][0])){
                return mp.get(descriptions[i][0]);
            }
        }
        return null;
        
    }
    
}
