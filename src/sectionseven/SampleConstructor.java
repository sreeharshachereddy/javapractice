package sectionseven;

public class SampleConstructor {
private String name;
private int rollNo;

    public SampleConstructor(String name, int rollNo) {
        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        SampleConstructor DummyConstructor = new SampleConstructor("Harsha", 10);
        System.out.println(DummyConstructor.name+ "'s rollNo is "+DummyConstructor.rollNo);
    }

}
