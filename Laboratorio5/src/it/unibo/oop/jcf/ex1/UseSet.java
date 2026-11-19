package it.unibo.oop.jcf.ex1;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet 
{

    private UseSet() 
    {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) 
    {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	/*
    	Set<Integer> set = new TreeSet<>();
    	set.add(10);
    	set.add(1);
    	set.add(20);
    	set.add(2);
    	set.add(2);
    	
    	System.out.println("Dimensione: " + set.size());
    	System.out.println(set);*/
    	
    	SortedSet<Team> sortedSet = new TreeSet<>();
    	
    	Team t1 = new Team("Juve");
    	Team t2 = new Team("Inter");
    	Team t3 = new Team("Milan");
    	
    	sortedSet.add(t1);	/* Invocazione implicita di compareTo*/
    	sortedSet.add(t2);	/* Invocazione implicita di compareTo*/
    	sortedSet.add(t3);	/* Invocazione implicita di compareTo*/
    		
    	sortedSet.getFirst().win();
    	sortedSet.getLast().draw();
    	
    	sortedSet.remove(t2);
    	
    	System.out.println(sortedSet);
    
    }
}
