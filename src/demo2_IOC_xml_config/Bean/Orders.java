package demo2_IOC_xml_config.Bean;

public class Orders {
    private String oname;

    //constructor

    public Orders() {
        System.out.println("1.Non-paramterized constructor has been called up.");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2.Value has been injected");
    }

    public void initMethod(){
        System.out.println("3. the initialization method has been called up.");
    }

    public void destroyMethod(){
        System.out.println("5. Instance has been destroyed.");
    }
}
