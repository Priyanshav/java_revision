class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}

class Person implements Cloneable{
    String name;
    Address address;

    Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class shallowCloning{
    public static void main(String[] args) throws CloneNotSupportedException{
        Address address = new Address("Greater Noida");
        Person p1 = new Person("Priyanshu", address);
        Person p2 = (Person) p1.clone();

        System.out.println("Before Changes");

        System.out.println("Name : " + p1.name + " City : " + p1.address.city);
        System.out.println("Name : " + p2.name + " City : " + p2.address.city);

        System.out.println("After Changes");
        p2.name = "Amit";
        p2.address.city = "Muzaffarpur";
        System.out.println("Name : " + p1.name + " City : " + p1.address.city);
        System.out.println("Name : " + p2.name + " City : " + p2.address.city);
    }
}