import userPackage.*;
import itemPackage.*;
public class Main {
    public static void main(String[] args) {
        UserData obj = new UserData("Tackson","tackson@mail.com");
        obj.displayUserInfo();
        System.out.println();
        Item obj2 = new Item("Hp",300,"Dell",400);
        obj2.add();
    }
}