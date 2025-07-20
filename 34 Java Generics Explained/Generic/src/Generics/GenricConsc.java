package Generics;

class GenBox<T extends Number> {
    private T value;

    /*
    Genric Class & also Genric Constructor
    */
    public GenBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class NotGenricBox{
     /*
    Not Genric Class & also Genric Constructor
    */
/*
    public <T> NotGenricBox(T value){
        System.out.println(value);
    }*/
     public <T extends Number> NotGenricBox(T value){
         System.out.println(value);
     }

}
public class GenricConsc {
    public static void main(String[] args) {
        GenBox<Integer> intBox = new GenBox<>(123);
        GenBox<Float> floatBox = new GenBox<>(45.67f);

        System.out.println("Integer value: " + intBox.getValue());
        System.out.println("Float value: " + floatBox.getValue());

//        issues when extend number :
//        NotGenricBox notGenricBox1 = new NotGenricBox("Sm");
        NotGenricBox notGenricBox2 = new NotGenricBox(1.23);
    }
}
