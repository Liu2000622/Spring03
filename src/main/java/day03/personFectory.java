package day03;

public class personFectory {
    public person newperson() {
        System.out.println("实例方法bean工厂");
        return new person();
    }
}
