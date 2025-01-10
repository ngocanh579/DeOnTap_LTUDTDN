public class Usermanger {
    private User[] list;
    private int limit;

    public Usermanger(int limit) {
        list = new User[0];
        this.limit = limit;
    }

    public void addUser(User u) {//setter : phuong thuc khong co gia tri tra ve
        int total = list.length;
        if (total == limit) {
            System.out.println("User list is full");
        } else {
            User[] temp = new User[total + 1];
        }
        User[] newlis = new User[total + 1];
        for (int i = 0; i < total; i++) {
            newlis[i] = list[i];
        }
        newlis[total] = u;
        list = newlis;
    }

    public void show() {
        for (User u : list) {
            System.out.println(u.getInfo());
        }
    }

}
