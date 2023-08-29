
package genericmethod;

public class TestG <DataType,DataType1> {
    DataType variableName;
    DataType1 variaableName1;

    public TestG(DataType variableName, DataType1 variaableName1) {
        this.variableName = variableName;
        this.variaableName1 = variaableName1;
    }

    public TestG(DataType variableName) {
        this.variableName = variableName;
    }

    public void getMethod(){
        System.out.println(variableName);
        System.out.println(variaableName1);
    }
    public void getMethod1(){
        System.out.println(variableName);
        System.out.println(variaableName1);
    }
 
 

}
