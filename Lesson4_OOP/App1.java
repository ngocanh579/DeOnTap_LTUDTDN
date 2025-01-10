public class App1 {
    public static void main(String[] args) {
        // Tạo mảng 10 User
        // User[] users = new User[10];

        // // Khởi tạo từng phần tử trong mảng
        // for (int i = 0; i < 10; i++) {
        // users[i] = new User("Name" + (i + 1), "user" + (i + 1) + "@example.com");
        // }

        // // In thông tin từng User
        // for (User user : users) {
        // System.out.println(user);
        // }
        Usermanger usermanger = new Usermanger(2);
        User u1 = new User("nam01", "nam@gmail.com");
        usermanger.addUser(u1);
        User u2 = new User("ha02", "ha@gmail.com");
        usermanger.addUser(u2);

        User u3 = new User("hoa", "hoa@gmail.com");
        usermanger.addUser(u3);
        User u4 = new User("hoahip", "hoahip@gmail.com");
        usermanger.addUser(u4);
        usermanger.show();
    }
}
