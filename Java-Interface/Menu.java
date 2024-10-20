/**
 * Ein Interface ist eine komplett abstrakte Klasse, die nur Methodenköpfe enthält.
 */

public interface Menu {
    void showMenu();
    void selectOption(int option);
    void selectOption(String option);
    void exit();
}
