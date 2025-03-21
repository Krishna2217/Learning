package graph;

public class Main {
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
//        ds.unionByRank(1,2);
//        if(ds.findUParent(1)==ds.findUParent(2)){
//            System.out.println("union");
//        }
//        ds.unionByRank(2,3);
//        ds.unionByRank(4,5);
//        ds.unionByRank(5,6);
//        if(ds.findUParent(3) !=ds.findUParent(7)){
//            System.out.println("not  union");
//        }else{
//            System.out.println("union");
//        }
//        ds.unionByRank(3,7);
//        if(ds.findUParent(3) !=ds.findUParent(7)){
//            System.out.println("not  union");
//        }else{
//            System.out.println("union");
//        }

        ds.unionBySize(1,2);
        if(ds.findUParent(1)==ds.findUParent(2)){
            System.out.println("union");
        }
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(5,6);
        if(ds.findUParent(3) !=ds.findUParent(7)){
            System.out.println("not  union");
        }else{
            System.out.println("union");
        }
        ds.unionBySize(3,7);
        if(ds.findUParent(3) !=ds.findUParent(7)){
            System.out.println("not  union");
        }else{
            System.out.println("union");
        }

    }
}
