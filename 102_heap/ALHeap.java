import java.util.ArrayList;

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

//import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return "" + _heap;
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.isEmpty();
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * add the value at leftmost child of highest level (end of arrayList). 
   * While addVal is less than its parent and its not the root, swap addVal with its parent.
   * 
   */
  public void add( Integer addVal )
  {
    int currPos = _heap.size();
    _heap.add(currPos, addVal);

    while(currPos > 0 && addVal <_heap.get((currPos-1)/2)){
      swap(currPos, (currPos - 1)/2);
      currPos = (currPos -1)/2;
    }
    
  }//O(log(n))


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * 
   */
  public Integer removeMin()
  {
    if(_heap.size() == 0){
      return null;
    }
    if(_heap.size() == 1){
      return _heap.remove(0);
    }
    
    Integer retVal =  _heap.set(0, _heap.remove(_heap.size()- 1));
    int currPos = 0;
    while(2 * currPos + 1 < _heap.size()){
      if(2 * currPos + 2 < _heap.size()){
        if(_heap.get(2 *currPos + 1) < _heap.get(2*currPos + 2)){
          if(_heap.get(2*currPos + 1) < _heap.get(currPos)){
            swap(currPos, 2*currPos + 1);
            currPos = 2*currPos+1;
          }
          else{
            return retVal;
          }
        }
        else {
          if(_heap.get(2*currPos + 2) < _heap.get(currPos)){
            swap(currPos, 2*currPos + 2);
            currPos = 2*currPos+2;
          }
          else{
            return retVal;
          }
        }
      }
      else{
        if(_heap.get(2*currPos + 1) < _heap.get(currPos)){
          swap(currPos, 2*currPos + 1);
          currPos = 2* currPos + 1;
        }
        else{
          return retVal;
        }
      }
    }
    return retVal;
  }//O(log(n))


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    if ( 2*pos+1 >= _heap.size()){
      return -1;
    }
    return minOf(_heap.get(2 * pos + 1), _heap.get(2 * pos + 2)) == _heap.get(2 * pos + 1) ? 2 * pos + 1 : 2 * pos + 2;
  }//O(?)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );	
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
   
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      
  }//end main()

}//end class ALHeap
