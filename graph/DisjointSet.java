package graph;

import java.util.ArrayList;

public class DisjointSet {
    //initialize parent and rank array
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> rank = new ArrayList<>();
    ArrayList<Integer> size  = new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0; i<=n; i++){ // for one based and zero based indexing
            parent.add(i);
            rank.add(0);
            size.add(0);
        }
    }

    // to find parent of node in graph recursively
    public  int findUParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        //path compressing  similar to  return parent[node] = findUParent(parent[node])
        int ultParent = findUParent(parent.get(node));
        parent.set(node,ultParent);
        return parent.get(node);
    }

    // union by rank
    public  void unionByRank(int u, int v){
        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);
        if(ulp_u == ulp_v) {
            return;
        }
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_v) < rank.get(ulp_u)){
            parent.set(ulp_v,ulp_u);
        }else{
            parent.set(ulp_u,ulp_v);
            int rank_v = rank.get(ulp_v);
            rank.set(ulp_v,rank_v+1);
        }
    }
    public void unionBySize(int u,int v){
        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);
        if(ulp_u == ulp_v) {
            return;
        }
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v) + size.get(ulp_u));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_v) + size.get(ulp_u));
        }
    }


}
