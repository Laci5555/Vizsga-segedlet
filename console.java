

public class Class{
    String ;
    int ;
    double ;
    boolean ;
    
    public Class(String sor) {
        String[] s = sor.split(";");
        this. = s[0];
    }
    
}

private void betolt(String fajlnev){
    Scanner be = null;
    try {
        be = new Scanner(new File(fajlnev), "utf-8");
        lista1.getItems().clear();
        while (be.hasNextLine()) a.add(new Class(be.nextLine()));
    } catch (Exception e) {
        throw new RuntimeException(e);
    } finally {
        if(be != null) be.close();
    }
}

ArrayList<Class> a = new ArrayList<>();

public Main(){
    betolt("");
    // = a-b (>0 a nagyobb, <0 b nagyobb, =0 egyenlőek)
    madarak.sort((a, b) -> a.nev.compareTo(b.nev));
    madarak.sort((a, b) -> {
        int nameCompare = a.nev.compareTo(b.nev);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(a.magas, b.magas);
    });
    "a".compareTo("a")   // 0
    "a".compareTo("b")   // negative
    "b".compareTo("a")   // positive

    Integer.compare(5, 5)   // 0
    Integer.compare(3, 10)  // negative
    Integer.compare(10, 3)  // positive

    Double.compare()

    TreeSet<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(2);
    set.add(10);
    set.add(2); // duplicate ignored
    set.add(7);
    set.remove(5);

    System.out.println(set.first()); // smallest element
    System.out.println(set.last());  // largest element

    System.out.println(set.contains(10)); // true

    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(3, "Apple");
    map.put(1, "Banana");
    map.put(2, "Orange");

    map.put(4, "Grapes");
    map.remove(2);

    System.out.println(map.get(3)); // Apple

    System.out.println(map.firstKey()); // 1
    System.out.println(map.lastKey());  // 4
    for(var i : map.keySet()){
        
    }
}

public static void main(String[] args) {
	new Main();
}