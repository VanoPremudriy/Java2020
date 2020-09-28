package ru.mirea.java2020.lab7;

public class FurnitureTest {
    public static void main(String args[]){
        FurnitureShop myShop = new FurnitureShop();
        Person me = new Person();

        Chair myChair = new Chair(130, "black", "middle","ChairCompany","wooden",4,"Circle");
        myShop.addChairInShop(myChair);
        int i = myShop.getFurniture().indexOf(myChair);
        System.out.println(myShop.getFurniture().get(i));

        Table myTable = new Table(150,"white","big","TableCompany","wooden",4,150,200,150);
        myShop.addTableInShop(myTable);
        int j = myShop.getFurniture().indexOf(myTable);
        System.out.println(myShop.getFurniture().get(j));

        Sofa mySofa = new Sofa(500,"small","SofaCompany","violet",300,50,100,"velour");
        myShop.addSofaInShop(mySofa);
        int k = myShop.getFurniture().indexOf(mySofa);
        System.out.println(myShop.getFurniture().get(k));

        me.byFurniture(myShop.getFurniture().get(i));
        me.byFurniture(myShop.getFurniture().get(j));
        me.byFurniture(myShop.getFurniture().get(k));

        System.out.println(me.getMyPurchase());
    }

}
