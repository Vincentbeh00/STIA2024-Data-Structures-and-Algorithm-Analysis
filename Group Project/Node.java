/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructproject;

public class Node {
   
    // Data fields for Node
   public Vacay info;       // data stored in the node
   public Node link;         // link to next node

   // Methods
   // Constructors
   // postcondition: Creates a new empty node.
   public Node() {
     info = null;
     link = null;
   }

   // postcondition: Creates a new node storing obj.
   public Node(Vacay vacay) {
     this.info = vacay;
     link = null;
   }

   // postcondition: Creates a new node storing obj 
   //   and linked to node referenced by next.
   public Node(Vacay vacay, Node next) {
     this.info = vacay;
     this.link = next;
   }

    // accessors
   public Vacay getInfo() 
   {
      return info;
   }

   public Node getLink() 
   {
      return link;
   }


   // mutators
   public void setInfo(Vacay newInfo) 
   {
      info = newInfo;
   }

   public void setLink(Node newLink) 
   {
      link = newLink;
   }

    
    
}
