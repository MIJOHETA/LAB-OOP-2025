public class nomor01 {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        nomor01 orang = new nomor01();

        orang.setName("Femi");
        orang.setAge(20);
        orang.setGender(false); 

        System.out.println("Nama    : " + orang.getName());
        System.out.println("Umur    : " + orang.getAge());
        System.out.println("Gender  : " + orang.getGender());
    }
}
