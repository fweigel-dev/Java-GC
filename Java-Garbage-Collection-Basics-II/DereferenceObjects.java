public class DereferenceObjects {

    // 1. Referenz gleich `null` setzen
    MyClass obj = new MyClass();
    obj = null;

    // 2. Die Referenz mit einer anderen überschreiben
    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();
    obj1 = obj2;

    // 3. Ein anonymes Objekt verwenden
    myMethod(new MyClass());

    // 4. Objekt aus dem Scope entfernen
    {
        MyClass localObj = new MyClass();
    } // localObj ist hier nicht mehr zugänglich

    // 5. Referenz in einer Methode übergeben
    public void methodScope(MyClass param) {
        // param wird am Ende der Methode dereferenziert
    }
}