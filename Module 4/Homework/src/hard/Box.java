package hard;

public class Box <T>{
    private T item;

    void setItem(T item){
        this.item = item;
    }

    T getItem(){
        return this.item;
    }

    void showType(){
        System.out.println("Тип объекта: " + this.item.getClass().getSimpleName());
    }
}


