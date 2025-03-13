package userPackage;

public class UserData {
        private String name;
        private String email;

        public UserData(String name, String email) {
            this.name = name;
            this.email = email;
        }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void displayUserInfo(){
        System.out.println("The user name is "+name);
        System.out.println("The user Email is "+email);
    }
}
