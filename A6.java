public class A6 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setModel("X5");
        phone1.setNumber(890055535);
        phone1.setWeight(2500);
        phone1.setReciveCall("Мишка");
        phone1.specificationsPhone();
        System.out.println("Ваш номер: " + phone1.getNumber());
        phone1.reciveCall();
    }
}


class Phone{
    private int number;
    private int weight;
    private String name;
    private String model;
    void setModel (String modelPhone){
        model = modelPhone;
    }
    void setReciveCall(String nameCall){
        name = nameCall;
    }
    void  reciveCall(){
        System.out.println("Вам звонит: "+name);
    }
    public void setNumber(int numberUser){
        number = numberUser;
    }
    public int getNumber(){
        return number;
    }
    public void setWeight(int weightPhone){
        weight = weightPhone;
    }
    void specificationsPhone(){
        System.out.println("Модель телефона: " + model + ", вес телефона: " + weight);
    }
}

