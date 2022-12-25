package mainpackage;



public class Main {
    public static void main(String[] args) {
        Person p = new Person("Andrei",35);
        JsonReadWrite jrw = new JsonReadWrite();
        
//        String personJSON = jrw.writeFile("person.json", p);
            jrw.writeFile("person.json", p);
//        jrw.readFile("person.json", personJSON);
            
    }
}
