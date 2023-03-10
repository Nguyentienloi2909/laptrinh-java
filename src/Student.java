public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private float gpa;
    public Student(){}
    public Student( String id, String name, int age,
                    String address, float gpa){
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public float getGpa(){
        return this.gpa;
    }

    public void setGpa(float gpa){
        this.gpa = gpa;
    }
}
