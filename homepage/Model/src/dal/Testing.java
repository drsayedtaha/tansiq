package dal;

public class Testing {
    public static void main(String[] args) {
        UserDAL user = new UserDALImpl();
        user.login("test11", "test1");
    }
}
