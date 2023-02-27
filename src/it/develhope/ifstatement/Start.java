package it.develhope.ifstatement;
public class Start {
    public static void main(String args[])
    {
        String surname = "Mazilu";
        boolean containsNi = surname.contains("ni");
        String result = containsNi ? "contains" : "doesn't contain";
        System.out.println("My surname " + result + " letters 'ni'");
    }
}

