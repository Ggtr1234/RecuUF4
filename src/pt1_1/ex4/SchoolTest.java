package pt1_1.ex4;

public class SchoolTest {
    public static void main(String[] args) {
        UserSchool user1 = new UserSchool("German", 18, "Student");
        UserSchool user2 = new UserSchool("Pep", 88, "Professor");
        UserSchool user3 = new UserSchool("Miguel", 23, "Student");
        UserSchool user4 = new UserSchool("Alberto", 50, "Student");
        SchoolDataBase schoolDataBase = new SchoolDataBase();
        schoolDataBase.userAdd(user1);
        schoolDataBase.userAdd(user2);
        schoolDataBase.userAdd(user3);
        schoolDataBase.userAdd(user4);
        schoolDataBase.getUser("German");
        System.out.println(schoolDataBase.getUsers());
        schoolDataBase.showUsers();


    }
}
