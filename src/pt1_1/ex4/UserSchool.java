package pt1_1.ex4;

public class UserSchool {
    private String name;
    private int age;
    private String rol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UserSchool(String name, int age, String rol) {
        this.name = name;
        this.age = age;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "UserSchool{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rol='" + rol + '\'' +
                '}';
    }
}
