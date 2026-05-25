

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
}

public static void main(String[] args) {
	new Main();
}