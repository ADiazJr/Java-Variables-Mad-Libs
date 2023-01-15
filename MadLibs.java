public class MadLibs {
  /*
  This program generates a mad libbed story
  Author: Arturo
  Date 1/15/2023
  */
  	public static void main(String[] args){
      String name1 = "Rocky";
      String adjective1 = "excited";
      String adjective2 = "crazy";
      String adjective3 = "confused";
      String verb1 = "jumping";
      String noun1 = "cats";
      String noun2 = "chess board";
      String noun3 = "basketball";
      String noun4 = "dogs";
      String noun5 = "water";
      String noun6 = "computers";
      String name2 = "Mike";
      int number = 23;
      String place1 = "Chicago";
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
