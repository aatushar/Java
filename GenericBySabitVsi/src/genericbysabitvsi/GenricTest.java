
package genericbysabitvsi;


public class GenricTest <A>{
   private A id;
   private A name;
   private A address;

    public GenricTest(A id, A name, A address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public A getId() {
        return id;
    }

    public void setId(A id) {
        this.id = id;
    }

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public A getAddress() {
        return address;
    }

    public void setAddress(A address) {
        this.address = address;
    }
    
   
   public <A> void  test (){
       System.out.println("you id is "+ id);
       System.out.println("you id is "+ name);
       System.out.println("you id is "+ address);
   }
    
}
