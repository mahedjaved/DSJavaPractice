import java.lang.reflect.Array;

/*
 * ***************************************************************************************************************
 * @desc: implement the basic union find algol for dynamic connectivity problems
 * @author: my own trial version below
 * ***************************************************************************************************************
 */

public class QuickFind {

  // id is the DS that will store all the graph entries
  private int[] id;

  // N defines the size of all of the nodes
  public void QuickFindUF(int N) {
    // assign new id
    id = new int[N];
    // loop through all
    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  // function to check if two nodes are connected or not, i.e. is there entries is the same
  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  // implement the union function (i.e. join two unconnected nodes)
  public void union(int p, int q) {
    if (!connected(p, q)) {
      // store seperately for preservation
      int pid = id[p];
      int qid = id[q];
      // loop through the graph, and set all the entries that match p to entries of q
      for (int i = 0; i < Array.getLength((id)); i++) {
        if (id[i] == pid) {
          id[q] = qid;
        }
      }
    }
  }
}
